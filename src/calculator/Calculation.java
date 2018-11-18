package calculator;

class Calculation {
    double calc(double firstValue, char operation, double secondValue){
        switch (operation){
            case '+': return firstValue + secondValue;
            case '-': return firstValue - secondValue;
            case '*': return firstValue * secondValue;
            case '/': return firstValue / secondValue;
            default: return 0;
        }
    }
}
