package nl.tudelft.chain_of_responsibility;

public abstract class BaseValidator implements Validator {
    private Validator next;

    public void setNext(Validator h){
        this.next = h;
    }

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(WireTransfer transfer) throws InvalidTransferException {
        if (next == null) {
            return true;
        }
        return next.handle(transfer);
    }

}
