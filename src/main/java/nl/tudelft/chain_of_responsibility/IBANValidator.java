package nl.tudelft.chain_of_responsibility;

import nl.garvelink.iban.IBAN;
import nl.garvelink.iban.Modulo97;

public class IBANValidator extends BaseValidator {

    @Override
    public boolean handle(WireTransfer transfer) throws InvalidTransferException {
        boolean valid = Modulo97.verifyCheckDigits(transfer.getIban());
        if (!valid)
            throw new InvalidTransferException("Invalid IBAN");

        boolean isSepa = IBAN.parse(transfer.getIban()).isSEPA();
        if (!isSepa)
            throw new InvalidTransferException("IBAN not from a SEPA-participating country");

        // You can query whether an IBAN is in the SWIFT Registry
        boolean isRegistered = IBAN.parse(transfer.getIban()).isInSwiftRegistry();
        if (!isRegistered)
            throw new InvalidTransferException("IBAN is not in the SWIFT Registry");

        return super.checkNext(transfer);
    }
}
