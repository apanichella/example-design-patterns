package nl.tudelft.factory_method;

public interface Serializer {
    String serialize (Song song);
    Song deserialize(String string);
}
