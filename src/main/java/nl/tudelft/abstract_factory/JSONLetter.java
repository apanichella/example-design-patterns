package nl.tudelft.abstract_factory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class JSONLetter implements Letter {
    private JsonObject json;

    @Override
    public void fill(String receiver, String body) {
        this.json = new JsonObject();
        json.add("receiver", new JsonPrimitive(receiver));
        json.add("body", new JsonPrimitive(body));
        json.add("ending", new JsonPrimitive("Best, Sansa Stark"));
    }

    @Override
    public void print() {
        Gson gson = new Gson();
        System.out.println(gson.toJson(json));
    }
}
