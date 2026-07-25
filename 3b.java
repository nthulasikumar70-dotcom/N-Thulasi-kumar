class PiCalculator {

    // Public member
    public double pi = 3.14159;

    // Private member
    private double value;

    // Protected member
    protected void calculatePi() {
        value = Math.PI;
    }

    // Public method to access private value
    public double getPi() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {

        PiCalculator obj = new PiCalculator();

        // Accessing public member
        System.out.println("Public Pi = " + obj.pi);

        // Calling protected method
        obj.calculatePi();

        // Accessing private value through public method
        System.out.println("Private Pi = " + obj.getPi());
    }
}
