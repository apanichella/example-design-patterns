package nl.tudelft.factory_method;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class JSONSerializer implements Serializer{

    @Override
    public String serialize(Song song) {
        Gson gson = new Gson();

        JsonObject json = new JsonObject();
        json.add("id", new JsonPrimitive(song.getId()));
        json.add("title", new JsonPrimitive(song.getTitle()));
        json.add("artist", new JsonPrimitive(song.getArtist()));
        json.add("record-label", new JsonPrimitive(song.getRecordLabel()));
        json.add("year", new JsonPrimitive(song.getYear()));

        return gson.toJson(json);
    }

    @Override
    public Song deserialize(String string) {
        JsonObject json = new Gson().fromJson(string, JsonObject.class);

        String id = json.get("id").getAsString();
        String title = json.get("title").getAsString();
        String artist = json.get("artist").getAsString();
        String record = json.get("record-label").getAsString();
        int year = json.get("year").getAsInt();
        return new Song(id, title, artist, record, year);
    }
}
