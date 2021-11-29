package nl.tudelft.composite;

public abstract class MenuItem {

    private String name;
    private String description;

    public MenuItem(String pName, String text){
        this.name = pName;
        this.description = text;
    }

    public abstract void add(MenuItem component);

    public abstract void displayMenu();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
