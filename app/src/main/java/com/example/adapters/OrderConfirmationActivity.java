package com.example.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class OrderConfirmationActivity extends AppCompatActivity {

    private TextView orderDetailsTextView;
    private TextView totalPriceTextView;
    private TextView restaurantNameTextView;
    private TextView subtotalTextView;
    private TextView taxTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        orderDetailsTextView = findViewById(R.id.orderDetailsTextView);
        totalPriceTextView = findViewById(R.id.totalPriceTextView);
        restaurantNameTextView = findViewById(R.id.restaurantNameTextView);
        subtotalTextView = findViewById(R.id.subtotalTextView);
        taxTextView = findViewById(R.id.taxTextView);

        // Retrieve the ordered items and their prices from the intent
        Intent intent = getIntent();
        String restaurantName = intent.getStringExtra("restaurant_name");
        ArrayList<String> orderedItems = intent.getStringArrayListExtra("ordered_items");
        double totalPrice = intent.getDoubleExtra("total_price", 0.0);

        // Display the restaurant name if not null
        if (restaurantName != null) {
            restaurantNameTextView.setText(getString(R.string.ordered_items_from, restaurantName));
        } else {
            restaurantNameTextView.setText("Restaurant name not available");
        }

        // Display the order details and total price
        if (orderedItems != null && !orderedItems.isEmpty()) {
            displayOrderDetails(orderedItems);
        } else {
            orderDetailsTextView.setText("No items ordered");
        }

        // Calculate and display total price, subtotal, and tax
        displayTotalPrice(totalPrice);
    }

    private void displayTotalPrice(double totalPrice) {
        totalPriceTextView.setText(getString(R.string.total_price_format, totalPrice));
        // Calculate and display subtotal and tax
        double tax = totalPrice * 0.1; // Assuming tax rate is 10%
        double subtotal = totalPrice - tax;
        subtotalTextView.setText(getString(R.string.subtotal_format, subtotal));
        taxTextView.setText(getString(R.string.tax_format, tax));
    }

    private void displayOrderDetails(ArrayList<String> orderedItems) {
        StringBuilder orderDetails = new StringBuilder();
        for (String item : orderedItems) {
            orderDetails.append("- ").append(item).append("\n");
        }
        orderDetailsTextView.setText(orderDetails.toString());
    }
}
