import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

    @Test(expected = IllegalArgumentException.class)
    public void TestHw1_1_0_0(){
        cs.fourth(0,0);
    }
}
