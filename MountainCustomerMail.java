//make this class a subclass of customer
public class MountainCustomerMail implements IMail {
    @Override
    public String createMail() {
        return "Mountain Customer Mail";
    }
}
