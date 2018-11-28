package person.control;

import person.model.Person;
import person.model.TableContract;
import person.view.factory.DialogCreate;
import person.view.factory.DialogUpdate;
import person.view.factory.FactoryDialog;
import person.view.factory.IDialogFactory;

public class Controller implements IController, DialogCreate.DialogCreateCallBack,
        DialogUpdate.DialogUpdateCallBack {
    private TableContract tabelConfig;
    private IDialogFactory iDialogFactory;


    public Controller(TableContract tabelConfig) {
        this.tabelConfig = tabelConfig;
    }


    @Override
    public void create() {
        iDialogFactory = FactoryDialog.getInstance().factoryMethod(this, "create");
        iDialogFactory.setModal(true);
        iDialogFactory.setVisible(true);
    }

    @Override
    public void read() {
    }

    @Override
    public void update() {
        iDialogFactory = FactoryDialog.getInstance().factoryMethod(this, "update");
        iDialogFactory.setModal(true);
        iDialogFactory.setVisible(true);
    }

    @Override
    public void delete() {
    }

    @Override
    public void callBackCreate(Person person) {
        tabelConfig.setValue(person);
    }

    @Override
    public void callBackUpdate(Person person) {
        tabelConfig.setUpdateValue(person);
    }
}
