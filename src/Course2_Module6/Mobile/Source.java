package Course2_Module6.Mobile;

public class Source {
    public static void main(String[] args) {
        Mobile mobile1 = getMobile1();
        System.out.println(mobile1.getDetails());

        Mobile mobile2 = getMobile2();
        System.out.println(mobile2.getDetails());
    }

    /*
     * TODO 1: Complete the following method. This method should create a Mobile object with
     * brand as "Samsung" and price as 15000.
     */

    static Mobile getMobile1 () {
        return new Mobile("Samsung", 15000);
    }

    /*
     * TODO 2: Complete the following method. This method should create a Mobile object with
     * brand as "Apple" and price as 50000.
     */
    static Mobile getMobile2 () {
        return new Mobile("Apple", 50000);
    }
}
