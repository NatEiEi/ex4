public class App {
    public static void main(String[] args) {
        ICustomerTypeInput inputHandler = new CustomerInputHandler();
        String customerType = inputHandler.getCustomerTypeFromUser();

        CustomerFactory customerMailFactory = new CustomerFactory();
        
        Customer customer = customerMailFactory.createCustomer(customerType);
        customer.createMail(); 
        customer.createBrochure();
    }
}
