package com.example.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MenuItemAdapter extends RecyclerView.Adapter<MenuItemAdapter.MenuItemViewHolder> {

    private List<MenuItem> menuItems;

    public MenuItemAdapter(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @NonNull
    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item, parent, false);
        return new MenuItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {
        MenuItem currentMenuItem = menuItems.get(position);
        holder.nameTextView.setText(currentMenuItem.getName());
        holder.priceTextView.setText("Price: $" + currentMenuItem.getPrice());
        holder.descriptionTextView.setText(currentMenuItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    static class MenuItemViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView priceTextView;
        TextView descriptionTextView;

        public MenuItemViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.menu_item_name);
            priceTextView = itemView.findViewById(R.id.menu_item_price);
            descriptionTextView = itemView.findViewById(R.id.menu_item_description);
        }
    }
}

