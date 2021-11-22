package nl.tudelft.chain_of_responsibility;

public interface Validator {

    void setNext(Validator handler);
    boolean handle(WireTransfer transfer) throws InvalidTransferException;
}
