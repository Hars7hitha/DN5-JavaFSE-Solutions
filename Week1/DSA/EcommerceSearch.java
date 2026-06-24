import java.util.Arrays;

public class EcommerceSearch {

    static int linearSearch(String[] products, String key) {

        for(int i=0;i<products.length;i++) {
            if(products[i].equals(key))
                return i;
        }

        return -1;
    }

    static int binarySearch(String[] products, String key) {

        Arrays.sort(products);

        int low = 0;
        int high = products.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result = products[mid].compareTo(key);

            if(result == 0)
                return mid;

            if(result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        String[] products = {
                "Laptop",
                "Mobile",
                "Watch",
                "Headphones",
                "Tablet"
        };

        System.out.println("Linear Search: "
                + linearSearch(products, "Watch"));

        System.out.println("Binary Search: "
                + binarySearch(products, "Watch"));
    }
}