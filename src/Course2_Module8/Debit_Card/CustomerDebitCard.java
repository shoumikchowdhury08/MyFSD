package Course2_Module8.Debit_Card;

public class CustomerDebitCard {
    //TODO 1: Encapsulate all the attributes i.e. customerName, cardNumber, expiryDate
    private String customerName;
    private String cardNumber;
    private String expiryDate;

    //TODO 2: Create a public constructor with parameters customerName, cardNumber, expiryDate. These parameters are used to modify the attributes with the same names.
    public CustomerDebitCard(String customerName, String cardNumber, String expiryDate) {
        this.customerName = customerName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    //TODO 3: Make the following method accessible to all classes
    public String getCustomerName() {
        return customerName;
    }

    //TODO 4: Make the following method accessible to all classes
    public String getMaskedCardNumber() {
        String last4Digits = cardNumber.substring(cardNumber.length() - 4);
        return "XXXXXXXXXXXX" + last4Digits;
    }

    //TODO 5: Make the following method accessible to all classes
    public String getExpiryDate() {
        return expiryDate;
    }
}

