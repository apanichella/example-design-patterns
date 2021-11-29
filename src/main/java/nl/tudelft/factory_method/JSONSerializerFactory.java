package nl.tudelft.factory_method;

public class JSONSerializerFactory extends SerializerFactory{
    @Override
    public Serializer createSerializer() {
        return new JSONSerializer();
    }
}
