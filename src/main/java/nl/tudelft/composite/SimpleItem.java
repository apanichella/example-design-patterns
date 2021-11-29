package nl.tudelft.composite;

public class SimpleItem extends MenuItem {

    public SimpleItem(String name, String url) {
        super(name, url);
    }

    @Override
    public void add(MenuItem component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void displayMenu() {
        System.out.println(" --> " + this.getName() + " is the " + this.getDescription());
    }
}
