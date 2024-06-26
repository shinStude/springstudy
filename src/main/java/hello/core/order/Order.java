package hello.core.order;

public class Order {

    private Long memerId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memerId, String itemName, int itemPrice, int discountPrice) {
        this.memerId = memerId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }
  public  int calculatePrice(){
        return itemPrice - discountPrice;
  }
  public Long getMemerId() {
        return memerId;
    }

    public void setMemerId(Long memerId) {
        this.memerId = memerId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memerId=" + memerId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
