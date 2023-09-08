package HW_040923;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        products.add(new Product(1, "Jacket", ProductCategory.OUTERWEAR, 200.0, Currency.USD));
        products.add(new Product(2, "Knit sweatshirt", ProductCategory.SWEATSHIRTS, 50.0, Currency.USD));
        products.add(new Product(3, "Skiny", ProductCategory.JEANS, 30.0, Currency.USD));
        products.add(new Product(4, "Boots", ProductCategory.SHOES, 100.0, Currency.USD));
        products.add(new Product(5, "Loafers", ProductCategory.SHOES, 150.0, Currency.USD));

        ShopManager shopManager = new ShopManager();
        shopManager.setProduct(products);


        List<Product> shoes = shopManager.getProductsByCategory(ProductCategory.SHOES);
        System.out.println("Products in category SHOES: ");
        for (Product product : shoes) {
            System.out.println(product.getName());  // Ничего не выводит! Пробовала, не нашла причину.
        }



    }
}
