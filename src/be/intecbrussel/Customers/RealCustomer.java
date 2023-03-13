package be.intecbrussel.Customers;

public class RealCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
