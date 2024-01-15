import java.util.Scanner;

public class CustomerMailApplication {
    private ICustomerFactory customerFactory;

    public CustomerMailApplication(ICustomerFactory customerFactory) {
        this.customerFactory = customerFactory;
    }

    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }

    public String generateMail(String customerType) {
        IMail mail = customerFactory.createMail(customerType);
        return  mail.createMail();
    }

    public String generateBrochure(String customerType) {
        IBrochure brochure = customerFactory.createBrochure(customerType);
        return brochure.createBrochure();
    }

    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        ICustomerFactory factory = CustomerFactory.getCustomerFactory();
        CustomerMailApplication app = new CustomerMailApplication(factory);
        
        String mail = app.generateMail(customerType);
        String brochure = app.generateBrochure(customerType);

        System.out.println(mail);
        System.out.println(brochure);
    }
}
