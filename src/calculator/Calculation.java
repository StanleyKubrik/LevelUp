package calculator;

import java.util.ArrayList;
import java.util.List;

class Calculation implements ICalculation {
    private ICallBack iCallBack;
    private List<String> history;

    public Calculation(Calculation.ICallBack iCallBack){
        this.iCallBack = iCallBack;
        history = new ArrayList<>();
    }

    interface ICallBack {
        void callBack(String message);
        void callBackHistory(String message);
    }

    @Override
    public void sum(double firstValue, double secondValue) {
        double res = firstValue + secondValue;
        iCallBack.callBack(String.valueOf(firstValue + " + " + secondValue + " = " + res + "\n"));
    }

    @Override
    public void diff(double firstValue, double secondValue) {

    }

    @Override
    public void mult(double firstValue, double secondValue) {

    }

    @Override
    public void div(double firstValue, double secondValue) {

    }

    @Override
    public void history() {

    }
}
