package Step4;

public class Calculator {
    private AbstractOperation operation;

    // 생성자 통해 연산 객체 주입
    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation){
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}
