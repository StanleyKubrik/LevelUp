/* Список доступных операций:
        + Сложение A и B.
        - Вычитание B из A.
        * Умножение A на B.
        / Деление A на B.
        % Остаток от деления по модулю A на B.
        ^ Возведение A в степень B.
        root Вычисление из А корня степени B.
        rand Вывод случайного числа от A до B.
        help Вывод списка операций.
        exit Выход из программы. */
package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleCalc {
    private double numberA;
    private double numberB;
    private String code = "";

    public void calc() throws Exception {
        do {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Введите код операции:");
                code = bufferedReader.readLine();

                if (code.equals("+") || code.equals("-") || code.equals("*") || code.equals("/") || code.equals("%")) {
                    System.out.println("Введите 1-е число:");
                    numberA = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
                    System.out.println("Введите 2-е число:");
                    numberB = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));

                    switch (code) {
                        case "+":
                            System.out.println(numberA + " + " + numberB + " = " + (numberA + numberB));
                            break;
                        case "-":
                            System.out.println(numberA + " - " + numberB + " = " + (numberA - numberB));
                            break;
                        case "*":
                            System.out.println(numberA + " * " + numberB + " = " + (numberA * numberB));
                            break;
                        case "/":
                            if (numberB == 0) {
                                System.out.println("ОШИБКА: На ноль делить нельзя!");
                            } else {
                                System.out.println(numberA + " / " + numberB + " = " + (numberA / numberB));
                                break;
                            }
                        case "%":
                            if (numberB == 0) {
                                System.out.println("ОШИБКА: На ноль делить нельзя!");
                            } else {
                                System.out.println(numberA + " % " + numberB + " = " + (numberA % numberB));
                                break;
                            }
                    }
                } else if (code.equals("^") || code.equals("root")) {
                    System.out.println("Введите число:");
                    numberA = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Введите степень:");
                    numberB = Integer.parseInt(bufferedReader.readLine());
                    switch (code) {
                        case "^":
                            System.out.println(numberA + " ^ " + numberB + " = " + (Math.pow(numberA, numberB)));
                        case "root":
                            System.out.println(numberA + " ^ " + numberB + " = " + (Math.pow(numberA, 1.0 / numberB)));
                    }
                } else if (code.equals("rand")) {
                    System.out.println("Введите нижнюю границу интервала:");
                    numberA = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Введите верхнюю границу интервала:");
                    numberB = Integer.parseInt(bufferedReader.readLine());

                    Help.random(numberA, numberB);
                } else {
                    switch (code) {
                        case "exit":
                            System.out.println("Программа завершена.");
                            break;
                        case "help":
                        default:
                            Help.printOperation();
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА: Необходимо ввести число!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!code.equalsIgnoreCase("exit"));
    }
}