package nl.tudelft.factory_method;

public class XMLSerializerFactory extends SerializerFactory{
    @Override
    public Serializer createSerializer() {
        return new XMLSerializer();
    }
}
