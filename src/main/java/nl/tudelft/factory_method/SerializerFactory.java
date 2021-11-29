package nl.tudelft.factory_method;

public abstract class SerializerFactory {
    // abstract method
    public abstract Serializer createSerializer();

    public void otherMethod(){
        // non-abstract method
        // ...
    }
}
