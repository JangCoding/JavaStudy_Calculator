package Step1to3;

public class DivideOperation {
    public double operate(int firstNumber, int secondNumber){
        if (firstNumber == 0 || secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double)firstNumber / secondNumber;
    }
}
