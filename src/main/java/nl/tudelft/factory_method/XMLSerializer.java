package nl.tudelft.factory_method;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLSerializer implements Serializer {

    @Override
    public String serialize(Song song) {
        String result = "";
        try {
            XmlMapper xmlMapper = new XmlMapper();
            result += xmlMapper.writeValueAsString(song);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } finally{
            return result;
        }
    }

    @Override
    public Song deserialize(String string) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(string, Song.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
