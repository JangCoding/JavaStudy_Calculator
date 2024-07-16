package Step1to3;


public class Calculator {
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator(AddOperation add, SubstractOperation subs, MultiplyOperation mult, DivideOperation div){
        this.addOperation = add;
        this.substractOperation = subs;
        this.multiplyOperation = mult;
        this.divideOperation = div;
    }

    public double calculate(int firstNumber, String operator, int secondNumber){
        return switch (operator) {
            case "+" -> addOperation.operate(firstNumber, secondNumber);
            case "-" -> substractOperation.operate(firstNumber, secondNumber);
            case "*" -> multiplyOperation.operate(firstNumber, secondNumber);
            case "/" -> divideOperation.operate(firstNumber, secondNumber);
            case "%" -> firstNumber % secondNumber;
            default -> {
                System.out.println("잘못된 연산자를 입력하였습니다.");
                yield 0;
            }
        };
    }
}
