package converter;

public class Controller implements IController {
    private IConverter iConverter;

    public Controller(Converter.ICallBack callBack) {
        iConverter = new Converter(callBack);
    }

    @Override
    public void grvkg(double gramm) {
        iConverter.grvkg(gramm);
    }

    @Override
    public void kgvtn(double kg) {
        iConverter.kgvtn(kg);
    }

    @Override
    public void tnvunc(double tonna) {
        iConverter.tnvunc(tonna);
    }

    @Override
    public void cvf(double c) {
        iConverter.cvf(c);
    }

    @Override
    public void kvc(double k) {
        iConverter.kvc(k);
    }

    @Override
    public void history() {
        iConverter.history();
    }
}
