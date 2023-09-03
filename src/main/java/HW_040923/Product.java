package HW_040923;

public class Product {
    private int id;
    private String name;
    private ProductCategory category;
    private double price;
    private Currency currency;


    public Product(int id, String name, ProductCategory category, double price, Currency currency) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}



