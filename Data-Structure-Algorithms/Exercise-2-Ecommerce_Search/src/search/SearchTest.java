package search;

public class SearchTest {

    // Products must be sorted by productName for Binary Search
    static Product[] products = {

        new Product(105, "Keyboard", "Electronics"),
        new Product(101, "Laptop", "Electronics"),
        new Product(102, "Mouse", "Electronics"),
        new Product(103, "Shoes", "Fashion"),
        new Product(104, "Watch", "Accessories")

    };

    // Linear Search
    public static Product linearSearch(String name) {

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }

        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(String name) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) {
                return products[mid];
            }

            else if (compare < 0) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println("===== Linear Search =====");

        Product linear = linearSearch("Watch");

        if (linear != null)
            System.out.println(linear);
        else
            System.out.println("Product Not Found");


        System.out.println("\n===== Binary Search =====");

        Product binary = binarySearch("Watch");

        if (binary != null)
            System.out.println(binary);
        else
            System.out.println("Product Not Found");
    }
}