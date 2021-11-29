package nl.tudelft.factory_method;

public class Application {

    public static void main(String[] args) {
        Song song = new Song("ID01",
                "Sweet Child O\' Mine",
                "Guns N\' Roses",
                "Geffen Records",
                1987);

        SerializerFactory factory = new JSONSerializerFactory();
        String jsonString = factory.createSerializer().serialize(song);
        System.out.println(jsonString);
        Song song2 = factory.createSerializer().deserialize(jsonString);
        System.out.println(song2);

        factory = new XMLSerializerFactory();
        String xmlString = factory.createSerializer().serialize(song);
        System.out.println(xmlString);
        Song song3 = factory.createSerializer().deserialize(xmlString);
        System.out.println(song3);
    }
}
