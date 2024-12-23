package Quiz_3_Sec_J;


abstract class Product {
    protected String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public abstract double calculatePrice();
}


class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String productName, double weight) throws NegativeWeightException {
        super(productName);
        if (weight < 0) {
            throw new NegativeWeightException("Weight cannot be negative!");
        }
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return weight * 5.00;
    }
}


class DigitalProduct extends Product {
    public DigitalProduct(String productName) {
        super(productName);
    }

    @Override
    public double calculatePrice() {
        return 20.00;
    }
}


class NegativeWeightException extends Exception {
    public NegativeWeightException(String message) {
        super(message);
    }
}

// Main class - এইটুক লাগবে না, প্রশ্নেই দেয়া আছে।
// public class Ques_2 {
//     public static void main(String[] args) {
//         try {
//             Product physicalProduct = new PhysicalProduct("Laptop", 2.5);
//             System.out.println(physicalProduct.productName + " Price: $" + physicalProduct.calculatePrice());

//             Product digitalProduct = new DigitalProduct("E-Book");
//             System.out.println(digitalProduct.productName + " Price: $" + digitalProduct.calculatePrice());

//             Product invalidProduct = new PhysicalProduct("Mobile", -2.5);
//         } catch (NegativeWeightException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

