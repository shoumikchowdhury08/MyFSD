package Course2_Module8.Debit_Card;

public class Source {
    //Don't make any change below this line or your test cases may not pass.
    public static void main(String[] args) {
        String name = "Foo Bar";
        String number = "5556 3355 3345 2222";
        String expiryDate = "11/22";
        CustomerDebitCard customerDebitCard = new CustomerDebitCard(name, number, expiryDate);

        System.out.println("The customer's masked debit number is: " + customerDebitCard.getMaskedCardNumber());
    }
}
