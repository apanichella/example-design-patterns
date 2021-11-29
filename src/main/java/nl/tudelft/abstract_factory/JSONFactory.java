package nl.tudelft.abstract_factory;

public class JSONFactory implements DocumentFactory {

    @Override
    public Letter createLetter() {
        return new JSONLetter();
    }

    @Override
    public Resume createResume() {
        return new JSONResume();
    }
}
