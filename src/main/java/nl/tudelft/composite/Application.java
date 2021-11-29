package nl.tudelft.composite;

public class Application {

    public static void main(String args[]){
        MenuItem menu = new ComplexItem("Edit Menu", "overall menu");

        // let's create a complex menu item
        MenuItem editMenu = new ComplexItem("Find", "first sub-menu");
        menu.add(editMenu);

        editMenu.add(new SimpleItem("Find", "..."));
        editMenu.add(new SimpleItem("Replace", "..."));

        // let's create another complex menu item
        MenuItem shortCuts = new ComplexItem("Shortcuts", "third sub-menu");
        menu.add(shortCuts);

        MenuItem cut = new SimpleItem("Cut", "...");
        shortCuts.add(cut);
        MenuItem copy = new SimpleItem("Copy", "...");
        shortCuts.add(copy);
        MenuItem paste = new ComplexItem("Paste", "sub sub-menu");
        shortCuts.add(paste);

        // let's add a sub sub-menu
        MenuItem simplePaste = new SimpleItem("Simple Paste", "...");
        paste.add(simplePaste);
        MenuItem specialPaste = new SimpleItem("Special Paste", "...");
        paste.add(specialPaste);

        menu.displayMenu();
    }
}
