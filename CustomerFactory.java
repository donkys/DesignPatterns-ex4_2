import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CustomerFactory implements ICustomerFactory {
    private static CustomerFactory factory = new CustomerFactory();
    private Map<String, Supplier<IMail>> mailSuppliers = new HashMap<>();
    private Map<String, Supplier<IBrochure>> brochureSuppliers = new HashMap<>();

    private CustomerFactory() {
        mailSuppliers.put("Regular", RegularCustomerMail::new);
        mailSuppliers.put("Mountain", MountainCustomerMail::new);
        mailSuppliers.put("Delinquent", DelinquentCustomerMail::new);

        brochureSuppliers.put("Regular", RegularCustomerBrochure::new);
        brochureSuppliers.put("Mountain", MountainCustomerBrochure::new);
        brochureSuppliers.put("Delinquent", DelinquentCustomerBrochure::new);
    }

    public static CustomerFactory getCustomerFactory() {
        return factory;
    }

    @Override
    public IBrochure createBrochure(String customerType) {
        Supplier<IBrochure> brochureSupplier = brochureSuppliers.get(customerType);
        return brochureSupplier != null ? brochureSupplier.get() : null;
    }

    @Override
    public IMail createMail(String customerType) {
        Supplier<IMail> mailSupplier = mailSuppliers.get(customerType);
        return mailSupplier != null ? mailSupplier.get() : null;
    }
}
