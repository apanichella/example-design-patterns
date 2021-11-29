package nl.tudelft.abstract_factory;

public interface DocumentFactory {
    Letter createLetter();
    Resume createResume();
}
