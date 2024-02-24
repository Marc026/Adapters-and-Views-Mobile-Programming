package com.example.adapters;

import java.util.ArrayList;
import java.util.List;

public class RestaurantData {
    public static List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();

        // Add restaurant data here
        restaurants.add(new Restaurant("Chick-fil-A", 4.7f, "20 mins",
                generateChickFilAMenu()));
        restaurants.add(new Restaurant("Starbucks", 4.5f, "15 mins",
                generateStarbucksMenu()));
        restaurants.add(new Restaurant("McDonald's", 4.3f, "25 mins",
                generateMcDonaldsMenu()));
        restaurants.add(new Restaurant("Subway", 4.2f, "30 mins",
                generateSubwayMenu()));
        restaurants.add(new Restaurant("Chipotle Mexican Grill", 4.6f, "35 mins",
                generateChipotleMenu()));
        restaurants.add(new Restaurant("Burger King", 4.0f, "22 mins",
                generateBurgerKingMenu()));
        restaurants.add(new Restaurant("Taco Bell", 4.4f, "18 mins",
                generateTacoBellMenu()));
        restaurants.add(new Restaurant("Pizza Hut", 4.2f, "28 mins",
                generatePizzaHutMenu()));
        restaurants.add(new Restaurant("Domino's Pizza", 4.1f, "25 mins",
                generateDominosMenu()));
        restaurants.add(new Restaurant("KFC", 4.3f, "23 mins",
                generateKFCMenu()));
        restaurants.add(new Restaurant("Dunkin' Donuts", 4.6f, "20 mins",
                generateDunkinMenu()));
        restaurants.add(new Restaurant("Wendy's", 4.1f, "27 mins",
                generateWendysMenu()));
        restaurants.add(new Restaurant("Panera Bread", 4.4f, "20 mins",
                generatePaneraMenu()));
        restaurants.add(new Restaurant("Five Guys", 4.7f, "15 mins",
                generateFiveGuysMenu()));
        restaurants.add(new Restaurant("Panda Express", 4.2f, "28 mins",
                generatePandaExpressMenu()));
        restaurants.add(new Restaurant("Olive Garden", 4.5f, "30 mins",
                generateOliveGardenMenu()));
        restaurants.add(new Restaurant("Red Lobster", 4.3f, "35 mins",
                generateRedLobsterMenu()));
        restaurants.add(new Restaurant("Outback Steakhouse", 4.6f, "22 mins",
                generateOutbackMenu()));
        restaurants.add(new Restaurant("Applebee's", 4.0f, "18 mins",
                generateApplebeesMenu()));
        restaurants.add(new Restaurant("Chili's", 4.4f, "25 mins",
                generateChilisMenu()));

        return restaurants;
    }

    private static List<MenuItem> generateChickFilAMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Chick-fil-A® Chicken Sandwich", 3.79, ""));
        menuItems.add(new MenuItem("Spicy Deluxe Sandwich", 4.99, ""));
        menuItems.add(new MenuItem("Waffle Potato Fries", 1.89, ""));
        menuItems.add(new MenuItem("Chicken Nuggets (8-Count)", 4.29, ""));
        return menuItems;
    }

    private static List<MenuItem> generateStarbucksMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Caffè Latte", 4.25, ""));
        menuItems.add(new MenuItem("Pumpkin Spice Latte", 5.45, ""));
        menuItems.add(new MenuItem("Bacon & Gouda Sandwich", 4.95, ""));
        menuItems.add(new MenuItem("Blueberry Muffin", 2.95, ""));
        return menuItems;
    }

    private static List<MenuItem> generateMcDonaldsMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Big Mac", 3.99, ""));
        menuItems.add(new MenuItem("McChicken", 1.29, ""));
        menuItems.add(new MenuItem("French Fries (Medium)", 1.89, ""));
        menuItems.add(new MenuItem("Vanilla Cone", 1.00, ""));
        return menuItems;
    }

    private static List<MenuItem> generateSubwayMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Italian B.M.T.", 6.29, ""));
        menuItems.add(new MenuItem("Oven Roasted Chicken", 5.99, ""));
        menuItems.add(new MenuItem("Veggie Delite®", 5.29, ""));
        menuItems.add(new MenuItem("Chocolate Chip Cookie", 0.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateChipotleMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Chicken Burrito Bowl", 7.95, ""));
        menuItems.add(new MenuItem("Barbacoa Tacos", 8.50, ""));
        menuItems.add(new MenuItem("Chips & Guacamole", 4.25, ""));
        menuItems.add(new MenuItem("Quesadilla", 6.50, ""));
        return menuItems;
    }

    private static List<MenuItem> generateBurgerKingMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Whopper", 4.79, ""));
        menuItems.add(new MenuItem("Chicken Nuggets (10 pieces)", 1.69, ""));
        menuItems.add(new MenuItem("BK Veggie Burger", 3.99, ""));
        menuItems.add(new MenuItem("French Fries (Medium)", 1.79, ""));
        return menuItems;
    }

    private static List<MenuItem> generateTacoBellMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Crunchy Taco", 1.29, ""));
        menuItems.add(new MenuItem("Bean Burrito", 1.29, ""));
        menuItems.add(new MenuItem("Quesarito", 3.29, ""));
        menuItems.add(new MenuItem("Cinnamon Twists", 1.09, ""));
        return menuItems;
    }

    private static List<MenuItem> generatePizzaHutMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Pepperoni Pizza", 8.99, ""));
        menuItems.add(new MenuItem("Supreme Pizza", 10.99, ""));
        menuItems.add(new MenuItem("Cheese Sticks", 5.99, ""));
        menuItems.add(new MenuItem("Cinnamon Sticks", 4.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateDominosMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Margherita Pizza", 7.99, ""));
        menuItems.add(new MenuItem("ExtravaganZZa Pizza", 11.99, ""));
        menuItems.add(new MenuItem("Chicken Wings (8 pieces)", 7.99, ""));
        menuItems.add(new MenuItem("Chocolate Lava Crunch Cake", 4.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateKFCMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Original Recipe Chicken", 3.99, ""));
        menuItems.add(new MenuItem("Chicken Sandwich", 4.49, ""));
        menuItems.add(new MenuItem("Famous Bowl", 5.49, ""));
        menuItems.add(new MenuItem("Mashed Potatoes & Gravy", 2.29, ""));
        return menuItems;
    }

    private static List<MenuItem> generateDunkinMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Iced Coffee", 2.49, ""));
        menuItems.add(new MenuItem("Donut", 1.09, ""));
        menuItems.add(new MenuItem("Bacon, Egg & Cheese Croissant", 3.99, ""));
        menuItems.add(new MenuItem("Bagel with Cream Cheese", 2.49, ""));
        return menuItems;
    }

    private static List<MenuItem> generateWendysMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Dave's Single", 4.99, ""));
        menuItems.add(new MenuItem("Spicy Chicken Sandwich", 5.29, ""));
        menuItems.add(new MenuItem("Baconator", 6.59, ""));
        menuItems.add(new MenuItem("Frosty (Small)", 1.49, ""));
        return menuItems;
    }

    private static List<MenuItem> generatePaneraMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Broccoli Cheddar Soup", 5.69, ""));
        menuItems.add(new MenuItem("Turkey Avocado BLT", 8.99, ""));
        menuItems.add(new MenuItem("Classic Grilled Cheese", 6.99, ""));
        menuItems.add(new MenuItem("Chocolate Chip Cookie", 2.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateFiveGuysMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Hamburger", 6.99, ""));
        menuItems.add(new MenuItem("Cheeseburger", 7.99, ""));
        menuItems.add(new MenuItem("Fries (Regular)", 3.79, ""));
        menuItems.add(new MenuItem("Milkshake", 4.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generatePandaExpressMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Orange Chicken", 7.50, ""));
        menuItems.add(new MenuItem("Beijing Beef", 8.00, ""));
        menuItems.add(new MenuItem("Fried Rice", 2.50, ""));
        menuItems.add(new MenuItem("Crab Rangoon", 4.00, ""));
        return menuItems;
    }

    private static List<MenuItem> generateOliveGardenMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Chicken Alfredo", 15.99, ""));
        menuItems.add(new MenuItem("Lasagna Classico", 14.79, ""));
        menuItems.add(new MenuItem("Unlimited Soup, Salad, and Breadsticks", 10.99, ""));
        menuItems.add(new MenuItem("Black Tie Mousse Cake", 7.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateRedLobsterMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Ultimate Feast", 34.99, ""));
        menuItems.add(new MenuItem("Lobster Lover's Dream", 29.99, ""));
        menuItems.add(new MenuItem("Admiral's Feast", 24.99, ""));
        menuItems.add(new MenuItem("Key Lime Pie", 7.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateOutbackMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Bloomin' Onion", 9.99, ""));
        menuItems.add(new MenuItem("Victoria's Filet® Mignon", 22.99, ""));
        menuItems.add(new MenuItem("Alice Springs Chicken", 17.99, ""));
        menuItems.add(new MenuItem("Chocolate Thunder From Down Under", 9.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateApplebeesMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Riblet Basket", 12.99, ""));
        menuItems.add(new MenuItem("Double Crunch Bone-In Wings", 10.99, ""));
        menuItems.add(new MenuItem("Shrimp Wonton Stir-Fry", 14.99, ""));
        menuItems.add(new MenuItem("Triple Chocolate Meltdown", 6.99, ""));
        return menuItems;
    }

    private static List<MenuItem> generateChilisMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Baby Back Ribs", 17.49, ""));
        menuItems.add(new MenuItem("Classic Beef Nachos", 11.99, ""));
        menuItems.add(new MenuItem("Margarita Grilled Chicken", 14.49, ""));
        menuItems.add(new MenuItem("Molten Chocolate Cake", 8.49, ""));
        return menuItems;
    }
}

