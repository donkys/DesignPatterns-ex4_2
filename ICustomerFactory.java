public interface ICustomerFactory {
    public IBrochure createBrochure(String customerType);
    public IMail createMail(String customerType);
}
