//make this class a subclass of customer
public class DelinquentCustomerMail implements IMail {
    @Override
    public String createMail() {
        return "Delinquent Customer Mail";
    }   
}
