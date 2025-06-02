package Interface.src.minihandel;

public class PercentDiscount implements Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double getDiscount(double price){
       return price - (price / 100 * discountPercentage);
    }

}
