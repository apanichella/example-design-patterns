package nl.tudelft.chain_of_responsibility;

public class BalanceValidator extends BaseValidator {
    @Override
    public boolean handle(WireTransfer transfer) throws InvalidTransferException {
        // core logic to check the balance
        // ...
        if (transfer.getAmount() <= 0)
            throw new InvalidTransferException("Amount must be > 0.00");

        if (transfer.getAmount() > 200)
            throw new InvalidTransferException("Amount over the daily limit");

        return super.checkNext(transfer);
    }
}
