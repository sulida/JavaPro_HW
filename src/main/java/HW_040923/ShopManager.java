package HW_040923;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {


    private List<Product> products = new ArrayList<>();


    public ShopManager() {
            products = new ArrayList<>();

        }

    public void addProduct(Product product) {
        products.add(product);
    }


    public List<Product> getProductsByCategory(ProductCategory category) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : products) {
            System.out.println(product.getName());
            if (product.getCategory() == category) {
                productsByCategory.add(product);
                System.out.println(product.getName());
            }
        }
        return productsByCategory;
    }


    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        List<Product> productsRange = new ArrayList<>();
        for (Product product : products) {
            if (product.getCurrency() == currency && product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                productsRange.add(product);
            }
        }
        return productsRange;
    }


    public void setProduct(List<Product> products) {
        this.products = products;
    }
}

