package be.intecbrussel.Customers;

public class CustomerFactory {
    public static final String[] NAMES = { "Jos", "Bob", "Tom", "Jean" };

    public static AbstractCustomer getCustomer(String name) {
        RealCustomer customer = null;
        NullCustomer noCustomer = null;


        for (String customerName : NAMES ) {
            if (customerName.equalsIgnoreCase(name)) {
                customer = new RealCustomer(name);
            } else {
                noCustomer = new NullCustomer();
            }
        }
        return
    }
}
