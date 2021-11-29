package nl.tudelft.abstract_factory;

public class TextFactory implements DocumentFactory {

    @Override
    public Letter createLetter() {
        return new TxtLetter();
    }

    @Override
    public Resume createResume() {
        return new TxtResume();
    }
}