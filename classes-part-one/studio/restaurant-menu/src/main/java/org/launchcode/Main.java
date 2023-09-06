package main.java.org.launchcode;

import main.java.org.launchcode.MenuItem;
import main.java.org.launchcode.MenuItemCategoryEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem newItem = new MenuItem(15.00, "Some food", MenuItemCategoryEnum.APPETIZER, true);
        //MENU items
            //menu item
            //menu item

        Menu currentMenu = new Menu(LocalDate.now(), new ArrayList<>());

        currentMenu.getItems().add(newItem);

        //all items added to menu
        System.out.println(currentMenu.getItems());
        currentMenu.printAll();
        //iterate over the currentMenu arrayList(s)
        //for MenuItem : currentMenu.getItems()
        //print out the properties you want


    }


}
