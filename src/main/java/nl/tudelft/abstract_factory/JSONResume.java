package nl.tudelft.abstract_factory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class JSONResume implements Resume {
    private JsonObject json;

    @Override
    public void fill(String info, String education, String skills) {
        this.json = new JsonObject();
        json.add("info", new JsonPrimitive(info));
        json.add("education", new JsonPrimitive(education));
        json.add("skills", new JsonPrimitive(education));
    }

    @Override
    public void print() {
        Gson gson = new Gson();
        System.out.println(gson.toJson(json));
    }
}