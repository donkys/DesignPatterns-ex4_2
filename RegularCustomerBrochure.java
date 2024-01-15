//make this class a subclass of customer
public class RegularCustomerBrochure implements IBrochure {
    @Override
    public String createBrochure() {
        return "Regular Customer Brochure";
    }
}
