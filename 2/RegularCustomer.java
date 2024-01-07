//make this class a subclass of customer
public class RegularCustomer extends Customer {
    @Override
    public void createMail() {
        System.out.println("Regular Customer Mail");
    }
    @Override
    public void createBrochure() {
        System.out.println("Regular Customer Brochure");
    }
}
