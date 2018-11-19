package converter;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Calc implements ICalc {
    private ICallBack iCallBack;
    private List<String> history;

    public Calc(Calc.ICallBack iCallBack){
        this.iCallBack = iCallBack;
        history = new ArrayList<>();
    }

    interface ICallBack {
        void callBack(String message);
        void callBackHistory(String message);
    }

    @Override
    public void grvkg(double gramm) {
        double kg = gramm / 1000;
        String formattedDouble = new DecimalFormat("#0.000").format(kg);
        history.add(formattedDouble + "\n");
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void kgvtn(double kg) {
        double tonna = kg / 1000;
        String formattedDouble = new DecimalFormat("#0.00").format(tonna);
        history.add(formattedDouble + "\n");
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void tnvunc(double tonna) {
        double unc = tonna * 35274;
        String formattedDouble = new DecimalFormat("#0.00").format(unc);
        history.add(formattedDouble + "\n");
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void cvf(double c) {
        double f = (c * 9/5) + 32;
        String formattedDouble = new DecimalFormat("#0.000").format(f);
        history.add(formattedDouble + "\n");
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void kvc(double k) {
        double c = k - 272.15;
        String formattedDouble = new DecimalFormat("#0.000").format(c);
        history.add(formattedDouble + "\n");
        iCallBack.callBack(formattedDouble);
    }

    @Override
    public void history() {
        for (String str : history) {
            iCallBack.callBackHistory(str);
        }
        history.clear();
    }
}