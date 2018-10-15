import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ClassWork {
    public void cw1() throws IOException {
//        System.out.println("В цикле вывести в консоль от A до Z");
//        for (char a = 'A'; a <= 'Z'; a++){
//            System.out.print(a + " ");
//        }
//
//        System.out.println();
//        System.out.println("В цикле вывести в консоль от Z до A");
//        for (char a = 'z'; a >= 'a'; a--){
//            System.out.print(a + " ");
//        }
//
//        System.out.println();
//        System.out.println("В цикле вывести в консоль от А до Я");
//        for (char a = 'А'; a <= 'Я'; a++){
//            System.out.print(a + " ");
//        }
//
//        System.out.println();
//        System.out.println("В цикле вывести в консоль от я до б");
//        for (char a = 'я'; a > 'а'; a--){
//            System.out.print(a + " ");
//        }
//
//        System.out.println();
//        System.out.println("В цикле вывести в консоль от 0 до 90");
//        for (int a = 0; a <= 90; a++){
//            System.out.print(a + " ");
//        }
//
//        System.out.println();
//        System.out.println("В цикле вывести в консоль от -10 до 20");
//        for (int a = -10; a <= 20; a++){
//            System.out.print(a + " ");
//        }
//
//        System.out.println();
//        System.out.println("while index от 0 до 20");
//        int index = 0;
//        while (index <= 20){
//            System.out.print(index + " ");
//            index++;
//        }
//        System.out.println();
//        System.out.println("while");
//        System.out.println(" do while index " + index);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        while (true){
            int value = Integer.parseInt(bufferedReader.readLine());
            if (value > max){
                max = value;
            }
        }
    }
}
