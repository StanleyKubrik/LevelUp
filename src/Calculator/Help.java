package Calculator;

import java.util.ArrayList;

class Help {
    static ArrayList<String> help = new ArrayList<>();

    static void printOperation(){
        help.add("Список доступных операций:");
        help.add("+ Сложение A и B.");
        help.add("- Вычитание B из A.");
        help.add("* Умножение A на B.");
        help.add("/ Деление A на B.");
        help.add("% Остаток от деления модулю A на B.");
        help.add("^ Возведение A в степень B.");
        help.add("root Вычисление из А корня степени B.");
        help.add("rand Вывод случайного числа от A до B.");
        help.add("help Вывод списка операций.");
        help.add("exit Выход из программы.");

        for (String string : help){
            System.out.println(string);
        }
    }
}