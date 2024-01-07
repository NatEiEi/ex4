public class CustomerFactory{


    public Customer createCustomer(String customerType) {
        Customer customer  = null;
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                break; 
        }
        return customer;
    }
}
