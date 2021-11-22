package nl.tudelft.chain_of_responsibility;

public class WireTransfer {
    private String iban;
    private String recipient;
    private double amount;

    public WireTransfer (String pIban, String pRecipient, double pAmount){
        this.iban = pIban;
        this.recipient = pRecipient;
        this.amount = pAmount;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
