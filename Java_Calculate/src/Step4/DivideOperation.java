package Step4;

public class DivideOperation extends AbstractOperation{
    @Override
    double operate(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double)firstNumber / secondNumber;
    }
}
