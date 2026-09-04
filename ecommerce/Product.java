package ecommerce;

/*
Implement an e-commerce application with Collection and custom exception
(Like - PaymentException, InventoryException, ShippingException)
Provide User an experience to add different items in a Cart.
User can add single or multiple item/s in a Cart and then checkout.
If, Item/s get sold maintain its unit in inventory.
Provide Statistical data like - number of Item get sold, quantity of an Item in inventory
 */
public class Product {
    private int id;
    private String product_name;
    private float price;
    private int quantity;

    public Product(int id, String product_name, float price, int quantity) {
        this.id = id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product_name='" + product_name + '\'' +
                ", price=" + price +
                '}';
    }
}
