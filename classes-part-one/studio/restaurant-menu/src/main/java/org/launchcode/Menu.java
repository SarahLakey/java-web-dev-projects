package main.java.org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        //this.lastUpdate = LocalDate.now();
        this.menuItems = i;
    }
//    public void addMenuItem(MenuItem item){
//        this.addMenuItem();
//    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.menuItems = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem addItem){
        this.menuItems.add(addItem);
    }
    public void removeMenuItem(MenuItem removeItem){
        this.menuItems.remove(removeItem);
    }

    public void printAll(){
        System.out.println(menuItems);
    }

    public  void printItem(MenuItem singleItem){
        //for loop iterate through menuItems
            // if(menuItem.equals(singleItem) = singleItem){

             System.out.println("Name: " + singleItem.getName());
//             for (MenuItem.singleItem: singleItem){
//                     printItem(singleItem);
//
    }

}
