package converter;

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
        iCallBack.callBack(String.valueOf(kg));
    }

    @Override
    public void kgvtn(double kg) {
        double tonna = kg / 1000;
        iCallBack.callBack(String.valueOf(tonna));
    }

    @Override
    public void tnvunc(double tonna) {
        double unc = tonna * 35274;
        iCallBack.callBack(String.valueOf(unc));
    }

    @Override
    public void cvf(double c) {
        double f = (c * 9/5) + 32;
        iCallBack.callBack(String.valueOf(f));
    }

    @Override
    public void kvc(double k) {
        double c = k - 272.15;
        iCallBack.callBack(String.valueOf(c));
    }
}
