package nl.tudelft.abstract_factory;

public class TxtResume implements Resume {
    private String letter;

    @Override
    public void fill(String info, String education, String skills) {
        letter = "Name and Surname "+ info +",\n" +
                "My education = " + education + "\n" +
                "My Skills = skills \n";
    }

    @Override
    public void print() {
        System.out.println(letter);
    }
}
