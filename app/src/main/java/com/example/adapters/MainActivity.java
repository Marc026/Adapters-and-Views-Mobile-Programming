package com.example.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RestaurantAdapter adapter;
    private NestedScrollView nestedScrollView;
    private FloatingActionButton fabScrollToTop;
    private FloatingActionButton fabRandomOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView restaurantRecyclerView = findViewById(R.id.restaurantRecyclerView);
        nestedScrollView = findViewById(R.id.nestedScrollView);
        fabScrollToTop = findViewById(R.id.fabScrollToTop);
        fabRandomOrder = findViewById(R.id.fabRandomOrder);

        // Pass context to the adapter
        adapter = new RestaurantAdapter(this);
        restaurantRecyclerView.setAdapter(adapter);
        restaurantRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Get restaurant data from RestaurantData class
        List<Restaurant> restaurants = RestaurantData.getRestaurants();

        // Set the restaurant data to the adapter
        adapter.setRestaurants(restaurants);

        // Scroll to top when FloatingActionButton is clicked
        fabScrollToTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nestedScrollView.smoothScrollTo(0, 0);
            }
        });

        // Hide FloatingActionButton when RecyclerView is scrolled
        restaurantRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0 && fabScrollToTop.getVisibility() == View.VISIBLE) {
                    fabScrollToTop.hide();
                } else if (dy < 0 && fabScrollToTop.getVisibility() != View.VISIBLE) {
                    fabScrollToTop.show();
                }
            }
        });

        // Randomize order when FloatingActionButton for random order is clicked
        fabRandomOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeOrder();
            }
        });
    }

    private void randomizeOrder() {
        List<Restaurant> restaurants = RestaurantData.getRestaurants();
        if (restaurants.size() > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(restaurants.size());
            Restaurant randomRestaurant = restaurants.get(randomIndex);
            orderFromRestaurant(randomRestaurant);
        }
    }

    private void orderFromRestaurant(Restaurant restaurant) {
        // Retrieve all menu items from the selected restaurant
        List<MenuItem> menuItems = restaurant.getMenuItems();

        if (menuItems != null && !menuItems.isEmpty()) {
            // Calculate the total price of the ordered items
            double totalPrice = 0.0;
            ArrayList<String> orderedItems = new ArrayList<>();
            for (MenuItem item : menuItems) {
                orderedItems.add(item.getName()); // Assuming getName() returns the item name as a String
                totalPrice += item.getPrice();
            }

            // Apply tax (assuming 10% tax)
            totalPrice *= 1.1;

            // Retrieve the restaurant name
            String restaurantName = restaurant.getName();

            // Launch OrderConfirmationActivity and pass necessary data
            Intent intent = new Intent(MainActivity.this, OrderConfirmationActivity.class);
            intent.putStringArrayListExtra("ordered_items", orderedItems);
            intent.putExtra("total_price", totalPrice);
            intent.putExtra("restaurant_name", restaurantName); // Pass the restaurant name
            startActivity(intent);
        } else {
            // Handle case where menu items are not available
            // You can display a toast message or handle it in any other appropriate way
            Toast.makeText(this, "Menu items are not available", Toast.LENGTH_SHORT).show();
        }
    }


}
