package com.example.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private List<Restaurant> restaurants;
    private Context context;

    public RestaurantAdapter(Context context) {
        this.restaurants = new ArrayList<>();
        this.context = context;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_item, parent, false);
        return new RestaurantViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant currentRestaurant = restaurants.get(position);
        holder.bind(position + 1, currentRestaurant);
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        TextView numberTextView;
        TextView nameTextView;
        TextView ratingTextView;
        TextView deliveryTimeTextView;
        RecyclerView menuRecyclerView;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            numberTextView = itemView.findViewById(R.id.restaurantNumberTextView);
            nameTextView = itemView.findViewById(R.id.restaurant_name);
            ratingTextView = itemView.findViewById(R.id.restaurant_rating);
            deliveryTimeTextView = itemView.findViewById(R.id.delivery_time);
            menuRecyclerView = itemView.findViewById(R.id.menuRecyclerView);
        }

        public void bind(int position, Restaurant restaurant) {
            numberTextView.setText(String.valueOf(position));
            nameTextView.setText(restaurant.getName());
            ratingTextView.setText("Rating: " + restaurant.getRating());
            deliveryTimeTextView.setText("Delivery Time: " + restaurant.getDeliveryTime());

            MenuItemAdapter menuItemAdapter = new MenuItemAdapter(restaurant.getMenuItems());
            menuRecyclerView.setAdapter(menuItemAdapter);
            menuRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        }
    }
}
