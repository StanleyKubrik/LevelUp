package calculator;

public class Controller implements IController {
    private ICalculation iCalculation;

    public Controller(Calculation.ICallBack iCallBack){
        iCalculation = new Calculation(iCallBack);
    }

    @Override
    public void sum(double firstValue, double secondValue) {
        iCalculation.sum(firstValue, secondValue);
    }

    @Override
    public void diff(double firstValue, double secondValue) {
        iCalculation.diff(firstValue, secondValue);
    }

    @Override
    public void mult(double firstValue, double secondValue) {
        iCalculation.mult(firstValue, secondValue);
    }

    @Override
    public void div(double firstValue, double secondValue) {
        iCalculation.div(firstValue, secondValue);
    }
}
