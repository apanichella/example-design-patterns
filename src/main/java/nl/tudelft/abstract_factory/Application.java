package nl.tudelft.abstract_factory;

public class Application {
    enum Type {JSON, TXT}

    public static void main(String[] args) {
        DocumentFactory factory;
        Letter letter;

        Type type = Type.TXT;
        if (type == Type.JSON) {
            factory = new JSONFactory();
        } else {
            factory = new TextFactory();
        }

        letter = factory.createLetter();
        letter.fill("John Snow", "You know nothing");
        letter.print();
    }
}
