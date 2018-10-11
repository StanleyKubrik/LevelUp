import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CondStatementsTest {
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
    public void TestCS_fourth_0_0(){
        cs.fourth(0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestCS_fourth_0_1(){
        cs.fourth(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestCS_fourth_1_0(){
        cs.fourth(1, 0);
    }

    @Test
    public void TestCS_fourth_1(){
        assertEquals("Точка находится в 1-й четверти", cs.fourth(1, 1));
    }

    @Test
    public void TestCS_fourth_2(){
        assertEquals("Точка находится во 2-й четверти", cs.fourth(-1, 1));
    }

    @Test
    public void TestCS_fourth_3(){
        assertEquals("Точка находится в 3-й четверти", cs.fourth(-1, -1));
    }

    @Test
    public void TestCS_fourth_4(){
        assertEquals("Точка находится в 4-й четверти", cs.fourth(1, -1));
    }

    @Test
    public void TestCS_ifa_1(){
        assertEquals("11", cs.ifa(1));
    }

    @Test
    public void TestCS_ifa_2(){
        assertEquals("20", cs.ifa(2));
    }

    @Test
    public void TestCS_sum3dig_1(){
        assertEquals("0", cs.sum3dig(-1, -2, -3));
    }

    @Test
    public void TestCS_sum3dig_2(){
        assertEquals("5", cs.sum3dig(-1, 2, 3));
    }

    @Test
    public void TestCS_sum3dig_3(){
        assertEquals("3", cs.sum3dig(-1, -2, 3));
    }

    @Test
    public void TestCS_sum3dig_4(){
        assertEquals("2", cs.sum3dig(-1, 2, -3));
    }

    @Test
    public void TestCS_sum3dig_5(){
        assertEquals("1", cs.sum3dig(1, -2, -3));
    }

    @Test
    public void TestCS_sum3dig_6(){
        assertEquals("4", cs.sum3dig(1, -2, 3));
    }

    @Test
    public void TestCS_sum3dig_7(){
        assertEquals("6", cs.sum3dig(1, 2, 3));
    }

    @Test
    public void TestCS_max_1(){
        assertEquals("9", cs.max(1, 2, 3));
    }

    @Test
    public void TestCS_max_2(){
        assertEquals("15", cs.max(2, 2, 3));
    }

    @Test
    public void TestCS_max_3(){
        assertEquals("15", cs.max(1, 10, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestCS_grade_1(){
        cs.grade(-1);
    }

    @Test
    public void TestCS_grade_101(){
        assertEquals("Введённое значение вне диапазона", cs.grade(101));
    }

    @Test
    public void TestCS_grade_F(){
        assertEquals("F", cs.grade(10));
    }

    @Test
    public void TestCS_grade_E(){
        assertEquals("E", cs.grade(30));
    }

    @Test
    public void TestCS_grade_D(){
        assertEquals("D", cs.grade(50));
    }

    @Test
    public void TestCS_grade_C(){
        assertEquals("C", cs.grade(70));
    }

    @Test
    public void TestCS_grade_B(){
        assertEquals("B", cs.grade(85));
    }

    @Test
    public void TestCS_grade_A(){
        assertEquals("A", cs.grade(100));
    }
}