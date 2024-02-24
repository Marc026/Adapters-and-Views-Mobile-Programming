package com.example.adapters;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class OrderSummaryActivity extends AppCompatActivity {

    private TextView orderedItemsTextView;
    private TextView totalPriceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        // Initialize TextViews
        orderedItemsTextView = findViewById(R.id.orderedItemsTextView);
        totalPriceTextView = findViewById(R.id.totalPriceTextView);

        // Retrieve ordered items and total price from the intent
        ArrayList<String> orderedItems = getIntent().getStringArrayListExtra("ordered_items");
        double totalPrice = getIntent().getDoubleExtra("total_price", 0);

        // Display order details
        displayOrderSummary(orderedItems, totalPrice);
    }

    private void displayOrderSummary(ArrayList<String> orderedItems, double totalPrice) {
        // Display ordered items
        StringBuilder itemsText = new StringBuilder();
        for (String item : orderedItems) {
            itemsText.append("- ").append(item).append("\n");
        }
        orderedItemsTextView.setText(itemsText.toString());

        // Display total price
        totalPriceTextView.setText("Total Price (incl. tax): $" + totalPrice);
    }
}
