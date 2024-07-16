package Step4;

public class Main {
    public static void main(String[] args) {
        // 더하기 연산
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println("Addition: " + calculator.calculate(10, 5)); // Output: 15.0

        // 빼기 연산
        calculator.setOperation(new SubstractOperation());
        System.out.println("Subtraction: " + calculator.calculate(10, 5)); // Output: 5.0

        // 곱하기 연산
        calculator.setOperation(new MultiplyOperation());
        System.out.println("Multiplication: " + calculator.calculate(10, 5)); // Output: 50.0

        // 나누기 연산
        calculator.setOperation(new DivideOperation());
        System.out.println("Division: " + calculator.calculate(10, 5)); // Output: 2.0
    }
}
