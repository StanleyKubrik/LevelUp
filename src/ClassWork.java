import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ClassWork {
    public void cw1(){
        System.out.println("В цикле вывести в консоль от A до Z");
        for (char a = 'A'; a <= 'Z'; a++){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("В цикле вывести в консоль от Z до A");
        for (char a = 'z'; a >= 'a'; a--){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("В цикле вывести в консоль от А до Я");
        for (char a = 'А'; a <= 'Я'; a++){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("В цикле вывести в консоль от я до б");
        for (char a = 'я'; a > 'а'; a--){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("В цикле вывести в консоль от 0 до 90");
        for (int a = 0; a <= 90; a++){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("В цикле вывести в консоль от -10 до 20");
        for (int a = -10; a <= 20; a++){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("while index от 0 до 20");
        int index = 0;
        while (index <= 20){
            System.out.print(index + " ");
            index++;
        }
        System.out.println();
        System.out.println("while");
        System.out.println(" do while index " + index);
    }

//    public void max(){
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int max = 0;
//        try {
//            for (int i = 0; i < 4; i++){
//                int number = Integer.parseInt(bufferedReader.readLine());
//                if (number > max){
//                    max = number;
//                }
//            }
//            System.out.println(max);
//        } catch (NumberFormatException e) {
//            System.out.println("Введите число!");
//            max();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public void bufferMax() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите число A:");
            int number1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Введите число B:");
            int number2 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Введите число C:");
            int number3 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Введите число D:");
            int number4 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Максимальное число: " + max(number1, number2, number3, number4));
        } catch (NumberFormatException e) {
            System.out.println("Введите число!");
            bufferMax();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int max(int numberA, int numberB, int numberC, int numberD){
        int max = Math.max(Math.max(numberA, numberB), Math.max(numberC, numberD));
        return max;
    }
}
