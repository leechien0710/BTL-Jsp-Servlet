package data;

/**
 *
 * @author ADMIN
 */
public class cart {
    private int id;
    private String user;
    private String product;
    private int quantity;
    private String image;
    private float price;
    private float total;
    public cart() {
    }

    public cart(int id, String user, String product, int quantity, String image, float price, float total) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.image = image;
        this.price = price;
        this.total = total;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
