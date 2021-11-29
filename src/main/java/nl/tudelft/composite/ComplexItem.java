package nl.tudelft.composite;

import java.util.ArrayList;
import java.util.List;

public class ComplexItem extends MenuItem{
    List<MenuItem> subMenus = new ArrayList<>();

    public ComplexItem(String name, String url) {
        super(name, url);
    }

    @Override
    public void add(MenuItem component) {
        if (component != this)
            this.subMenus.add(component);
        else
            throw new IllegalArgumentException("Circular call");
    }

    @Override
    public void displayMenu() {
        System.out.println(this.getName() +
                " is the " +
                this.getDescription());

        this.subMenus.forEach(MenuItem::displayMenu);
    }
}
