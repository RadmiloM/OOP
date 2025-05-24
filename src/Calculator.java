public class Calculator {

    public int calculateSum(int number1, int number2) {
        return number1 * number2;
    }

    public int calculateDifference(int number1, int number2) {
        return number1 - number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculateSum(5, 3);
        calculator.calculateDifference(22, 4);
    }
}
