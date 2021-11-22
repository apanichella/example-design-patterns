package nl.tudelft.chain_of_responsibility;

public class InvalidTransferException extends Exception {
    public InvalidTransferException(String errorMessage) {
        super(errorMessage);
    }
}
