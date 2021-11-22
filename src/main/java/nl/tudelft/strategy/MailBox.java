package nl.tudelft.strategy;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private AnswerStrategy strategy;
    private List<Email> inbox;

    public MailBox(AnswerStrategy pStrategy){
        this.inbox = new ArrayList<>();
        this.strategy = pStrategy;
    }

    public void addEmail(Email email){
        this.inbox.add(email);
    }

    public Email getNextEmail(){
        return this.strategy.getNextEmail(this.inbox);
    }
}
