import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleCalc {
    public void calc() throws Exception{
        double number1;
        double number2;
        String code = null;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите код операции:");
            code = bufferedReader.readLine();

            if (code.equals("+") || code.equals("-") || code.equals("*") || code.equals("/") || code.equals("%")) {
                System.out.println("Введите 1-е число:");
                number1 = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Введите 2-е число:");
                number2 = Integer.parseInt(bufferedReader.readLine());

                switch (code){
                    case "+":
                        System.out.println("Ответ: " + (number1 + number2));
                        break;
                    case "-":
                        System.out.println("Ответ: " + (number1 - number2));
                        break;
                    case "*":
                        System.out.println("Ответ: " + (number1 * number2));
                        break;
                    case "/":
                    case "%":
                        if (number2 == 0){
                            System.out.println("ОШИБКА: На ноль делить нельзя!");
                        } else {
                            System.out.println("Ответ: " + (number1 / number2));
                            break;
                        }
                }
            } else {
            }
        } while (!code.equalsIgnoreCase("exit"));
    }
}
