package XS2;

public interface DiscountStrategy {
    double applyDiscount(double total);
    String getDescription();
}
