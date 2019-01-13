public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        int valueA = 10;
        int valueB = 20;

        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));


    }
}
