import org.junit.After;
import org.junit.Assert;
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

    @Test(expected = IllegalArgumentException.class)
    public void TestHw1_2_0_1(){
        cs.fourth(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestHw1_3_1_0(){
        cs.fourth(1, 0);
    }

    @Test
    public void TestHw1_fourth_1(){
        String res = cs.fourth(1, 1);
        Assert.assertEquals("Точка находится в 1-й четверти", res);
    }

    @Test
    public void TestHw1_fourth_2(){
        String res = cs.fourth(-1, 1);
        Assert.assertEquals("Точка находится во 2-й четверти", res);
    }

    @Test
    public void TestHw1_fourth_3(){
        String res = cs.fourth(-1, -1);
        Assert.assertEquals("Точка находится в 3-й четверти", res);
    }

    @Test
    public void TestHw1_fourth_4(){
        String res = cs.fourth(1, -1);
        Assert.assertEquals("Точка находится в 4-й четверти", res);
    }
}