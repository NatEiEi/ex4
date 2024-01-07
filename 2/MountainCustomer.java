//make this class a subclass of customer
public class MountainCustomer extends Customer {
    @Override
    public void createMail() {
        System.out.println("Mountain Customer Mail");
    }
    @Override
    public void createBrochure() {
        System.out.println("Mountain Customer Brochure");
    }
}
