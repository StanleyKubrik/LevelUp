package person;

public final class Mock {
    private static Mock instance = null;

    private Mock(){}

    public static synchronized Mock getInstance(){
        if (instance == null){
            instance = new Mock();
        }
        return instance;
    }
}
