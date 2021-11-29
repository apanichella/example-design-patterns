package nl.tudelft.decorator;

public class Application {
    public static void main(String[] args) {

        Window window = new BasicWindow("We want to develop TextView that displays textual documents in a " +
                "window. The look of the TextView should change depending on the context, such as length of the text, " +
                "if contains chapters or not, as so on.\n" +
                "\n" +
                "By default, TextView has no scroll bars because we might not always need them (scroll-bars not always " +
                "apply). We also want to add bookmarks it the document to display contains chapters. ");

        FancyWindow fancyWindow = new ScrollbarWindow(window);
        FancyWindow fancyWindow2 = new DraculaWindow(fancyWindow);
        FancyWindow win = new BoldTextWindow(fancyWindow2);
        win.draw();
    }
}

