package converter;

public class Controller implements IController {
    private ICalc iCalc;

    public Controller(Calc.ICallBack callBack) {
        iCalc = new Calc(callBack);
    }

    @Override
    public void grvkg(double gramm) {
        iCalc.grvkg(gramm);
    }

    @Override
    public void kgvtn(double kg) {
        iCalc.kgvtn(kg);
    }

    @Override
    public void tnvunc(double tonna) {
        iCalc.tnvunc(tonna);
    }

    @Override
    public void cvf(double c) {
        iCalc.cvf(c);
    }

    @Override
    public void kvc(double k) {
        iCalc.kvc(k);
    }

    @Override
    public void history() {
        iCalc.history();
    }
}
