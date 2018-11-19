package converter;

import java.text.DecimalFormat;

public class Calc implements ICalc {
    private ICallBack iCallBack;

    public Calc(Calc.ICallBack iCallBack){
        this.iCallBack = iCallBack;
    }

    interface ICallBack {
        void callBack(String message);
    }

    @Override
    public void grvkg(double gramm) {
        double kg = gramm / 1000;
        String formattedDouble = new DecimalFormat("#0.000").format(kg);
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void kgvtn(double kg) {
        double tonna = kg / 1000;
        String formattedDouble = new DecimalFormat("#0.00").format(tonna);
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void tnvunc(double tonna) {
        double unc = tonna * 35274;
        String formattedDouble = new DecimalFormat("#0.00").format(unc);
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void cvf(double c) {
        double f = (c * 9/5) + 32;
        String formattedDouble = new DecimalFormat("#0.000").format(f);
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void kvc(double k) {
        double c = k - 272.15;
        String formattedDouble = new DecimalFormat("#0.000").format(c);
        iCallBack.callBack(formattedDouble);
    }
}