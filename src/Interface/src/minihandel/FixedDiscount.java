package Interface.src.minihandel;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    public int getFixedDiscount() {
        return fixedDiscount;
    }

    public void setFixedDiscount(int fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }

    public int getDiscountLimit() {
        return discountLimit;
    }

    public void setDiscountLimit(int discountLimit) {
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscount(double price){
        if(price > discountLimit){
            price -= fixedDiscount;
        }
        return price;
    }
}
