package homeworks.hw_15_01.calculator;

public class CalculatorWithFields {
    private int valueOne;
    private int valueTwo;

    public CalculatorWithFields(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public int sum() {
        return valueOne + valueTwo;
    }

    public int minus() {
        return valueOne - valueTwo;
    }
}

class TestCWF {
    public static void main(String[] args) {
        CalculatorWithFields calculator = new CalculatorWithFields(5, 3);

        int sum = calculator.sum();


    }
}
