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
    public void TestHw1_fourth_0_0(){
        cs.fourth(0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestHw1_fourth_0_1(){
        cs.fourth(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestHw1_fourth_1_0(){
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

    @Test
    public void TestHw1_ifa_1(){
        String str = cs.ifa(1);
        Assert.assertEquals("11", str);
    }

    @Test
    public void TestHw1_ifa_2(){
        String str = cs.ifa(2);
        Assert.assertEquals("20", str);
    }

    @Test
    public void TestHw1_sum3dig_1(){
        String str = cs.sum3dig(-1, -2, -3);
        Assert.assertEquals("0", str);
    }

    @Test
    public void TestHw1_sum3dig_2(){
        String str = cs.sum3dig(-1, 2, 3);
        Assert.assertEquals("5", str);
    }

    @Test
    public void TestHw1_sum3dig_3(){
        String str = cs.sum3dig(-1, -2, 3);
        Assert.assertEquals("3", str);
    }

    @Test
    public void TestHw1_sum3dig_4(){
        String str = cs.sum3dig(-1, 2, -3);
        Assert.assertEquals("2", str);
    }

    @Test
    public void TestHw1_sum3dig_5(){
        String str = cs.sum3dig(1, -2, -3);
        Assert.assertEquals("1", str);
    }

    @Test
    public void TestHw1_sum3dig_6(){
        String str = cs.sum3dig(1, -2, 3);
        Assert.assertEquals("4", str);
    }

    @Test
    public void TestHw1_sum3dig_7(){
        String str = cs.sum3dig(1, 2, 3);
        Assert.assertEquals("6", str);
    }

    @Test
    public void TestHw1_max_1(){
        String str = cs.max(1, 2, 3);
        Assert.assertEquals("9", str);
    }

    @Test
    public void TestHw1_max_2(){
        String str = cs.max(2, 2, 3);
        Assert.assertEquals("15", str);
    }

    @Test
    public void TestHw1_max_3(){
        String str = cs.max(1, 10, 1);
        Assert.assertEquals("15", str);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestHw1_grade_1(){
        String str = cs.grade(-1);
        Assert.assertEquals("Недопустимо значение меньше 0", str);
    }

    @Test
    public void TestHw1_grade_101(){
        String str = cs.grade(101);
        Assert.assertEquals("Введённое значение вне диапазона", str);
    }

    @Test
    public void TestHw1_grade_F(){
        String str = cs.grade(10);
        Assert.assertEquals("F", str);
    }

    @Test
    public void TestHw1_grade_E(){
        String str = cs.grade(30);
        Assert.assertEquals("E", str);
    }

    @Test
    public void TestHw1_grade_D(){
        String str = cs.grade(50);
        Assert.assertEquals("D", str);
    }

    @Test
    public void TestHw1_grade_C(){
        String str = cs.grade(70);
        Assert.assertEquals("C", str);
    }

    @Test
    public void TestHw1_grade_B(){
        String str = cs.grade(85);
        Assert.assertEquals("B", str);
    }

    @Test
    public void TestHw1_grade_A(){
        String str = cs.grade(100);
        Assert.assertEquals("A", str);
    }
}