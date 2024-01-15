//make this class a subclass of customer
public class RegularCustomerMail implements IMail {
    @Override
    public String createMail() {
        return "Regular Customer Mail";
    }
}
