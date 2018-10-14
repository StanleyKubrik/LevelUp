import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CyclesTest {
    private Cycles cycles;

    @Before
    public void setUp(){
        cycles = new Cycles();
    }

    @After
    public void tearDown(){
        cycles = null;
    }

    @Test
    public void even_1_99(){
        assertEquals("Кол-во чётных чисел в диапазоне от 1 до 99: 49\n" +
                "Сумма чётных чисел: 2450", cycles.even(1, 99));
    }

    @Test(expected = IllegalArgumentException.class)
    public void simpledig_0(){
        cycles.simpledig(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void simpledig_negative(){
        cycles.simpledig(-1);
    }

    @Test
    public void simpledig_simple(){
        assertEquals("Число 5 простое.", cycles.simpledig(5));
    }

    @Test
    public void simpledig_composite(){
        assertEquals("Число 5.436 составное.", cycles.simpledig(5.436));
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorial_negative(){
        cycles.factorial(-1);
    }

    @Test
    public void factorial_0(){
        assertEquals("Факториал числа 0: 1", cycles.factorial(0));
    }

    @Test
    public void factorial_5(){
        assertEquals("Факториал числа 5: 120", cycles.factorial(5));
    }


}
