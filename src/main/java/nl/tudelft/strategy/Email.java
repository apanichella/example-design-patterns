package nl.tudelft.strategy;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.Date;
import java.util.List;

public class Email {
    private String sender;
    private List<String> receivers;
    private String subject;
    private String body;
    private Date date;

    public Email(String pSender, List<String> pReceivers, String pSubject, String pBody, Date pDate){
        if (!isValid(pSender))
            throw new IllegalArgumentException("Invalid email address");

        this.sender = pSender;
        this.receivers = pReceivers;
        this.subject = pSubject;
        this.body = pBody;
        this.date = pDate;
    }

    public boolean isValid(String address){
        return EmailValidator.getInstance(false, true).isValid(address);
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
