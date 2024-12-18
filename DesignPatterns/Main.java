package DesignPatterns;

public class Main {
    
    public static void main(String[] args) {
        User user = new User("Rizwaan");
        var account = new Account();
        user.sayHello();

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2024();
    }
}
