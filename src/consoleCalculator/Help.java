package consoleCalculator;

import java.text.DecimalFormat;
import java.util.ArrayList;

class Help {
    private static ArrayList<String> helpList = new ArrayList<>();

    static void printOperation(){
        helpList.add("Список доступных операций:");
        helpList.add("+ Сложение A и B.");
        helpList.add("- Вычитание B из A.");
        helpList.add("* Умножение A на B.");
        helpList.add("/ Деление A на B.");
        helpList.add("% Остаток от деления модулю A на B.");
        helpList.add("^ Возведение A в степень B.");
        helpList.add("root Вычисление из А корня степени B.");
        helpList.add("rand Вывод случайного числа от A до B.");
        helpList.add("helpList Вывод списка операций.");
        helpList.add("exit Выход из программы.");

        for (String string : helpList){
            System.out.println(string);
        }
    }

    static void random(double numberA, double numberB){
        double res = Math.random() * (numberB - numberA + 1) + numberA;
        String formattedDouble = new DecimalFormat("#0.00").format(res);
        System.out.println("Случайное число в интервале от " + numberA + " до " + numberB + ": "
                + formattedDouble);
    }
}