package nl.tudelft.chain_of_responsibility;

public class Application {
    public static void main(String[] args) {
        WireTransfer transfer = new WireTransfer("GB33BUKB20201555555555",
                "Jane Smith",
                150.00);

        Validator handler = new IBANValidator();
        handler.setNext(new BalanceValidator());

        try {
            boolean isValid = handler.handle(transfer);
            System.out.print("Transfer status = " + isValid);
        } catch (InvalidTransferException e) {
            e.printStackTrace();
        }
    }
}
