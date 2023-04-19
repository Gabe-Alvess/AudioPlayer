package be.intecbrussel.Customers;

public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {

    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Name: " + super.name;
    }
}
