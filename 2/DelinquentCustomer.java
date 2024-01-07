//make this class a subclass of customer
public class DelinquentCustomer extends Customer {
    @Override
    public void createMail() {
        System.out.println("Delinquent Customer Mail");
    }   
    @Override
    public void createBrochure() {
        System.out.println("Delinquent Customer Brochure");
    }
}
