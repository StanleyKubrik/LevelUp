import org.junit.After;
import org.junit.Before;

public class TestHw1 {
    private CondStatements cs;

    @Before
    public void setupUp(){
        cs = new CondStatements();
    }

    @After
    public void setupDown(){
        cs = null;
    }


}
