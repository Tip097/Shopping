import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<ItemOrder> itemOrder;
    private double total = 0.0;
    private double discount = 0.0;

    public static final double DISCOUNT_PERCENT = 0.9;

    public ShoppingCart() {
        itemOrder = new ArrayList<ItemOrder>();
        total = 0;
    }

    public boolean add(ItemOrder order) {
        for (int i = 0; i < itemOrder.size(); i++) {
            ItemOrder temp = itemOrder.get(i);
            if ((temp.getItem()).equals(order.getItem())) {
                itemOrder.set(i, order);
                return true;
            }
        }
        itemOrder.add(order);
        return true;

    } 

    public void setDiscount(boolean selected) {
        if (selected) {
            discount = total * .1;
            
    }

    }

    public double getTotal() {
        total = 0;
        for (ItemOrder order : itemOrder) {
            total += order.getPrice();
        }
        return total - discount;

    }
}
