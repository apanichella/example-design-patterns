package nl.tudelft.strategy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) throws ParseException {
        MailBox box = new MailBox(new ChronologicalStrategy());

        List<String> receiver = new ArrayList<>();
        receiver.add("s.griffin@tudelft.nl");

        Email email1 = new Email("jane.smith@tudelft.nl",
                receiver, "", "",
                new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"));
        box.addEmail(email1);

        Email email2 = new Email("john.smith@tudelft.nl",
                receiver, "", "",
                new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-02"));
        box.addEmail(email2);

        Email first = box.getNextEmail();
        System.out.print(first.getDate());
    }
}
