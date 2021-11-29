package nl.tudelft.abstract_factory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class TxtLetter implements Letter {
    private String letter;

    @Override
    public void fill(String receiver, String body) {
        letter = "Dear "+ receiver +",\n" +
                body + "\n" +
                "Regards, \n" +
                "John Smith";
    }

    @Override
    public void print() {
        System.out.println(letter);
    }
}
