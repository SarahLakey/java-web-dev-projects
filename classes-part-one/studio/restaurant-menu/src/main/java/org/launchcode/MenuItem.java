package main.java.org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private MenuItemCategoryEnum category;
    private boolean isNew;
    private  String name;


    public MenuItem(String name, double price, String description, MenuItemCategoryEnum category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setCategory(MenuItemCategoryEnum category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public MenuItemCategoryEnum getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MenuItem: " + description + " - $" + price;

    }
//    public void setCategory(String category) {
//        this.category = category;
//    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
