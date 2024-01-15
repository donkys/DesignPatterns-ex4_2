//make this class a subclass of customer
public class DelinquentCustomerBrochure implements IBrochure {
    @Override
    public String createBrochure() {
        return "Delinquent Customer Brochure";
    }   
}
