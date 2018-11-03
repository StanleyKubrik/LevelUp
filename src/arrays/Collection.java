/*
программа предлагает ввести элементы массива,
пока не введешь значение в неправильном формате,
после этого предлагает ввести операцию.
доступные операции print и del.
del предлагает ввести i-й индекс массива и удаляет его.
ну, и должна быть проверка, если введенный индекс больше размера массива
 */
package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Collection {
    private List<Integer> list;
    private String code;
    private boolean flag = true;
    private BufferedReader bufferedReader;

    public Collection(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();
        init();
    }

    private void init() {
        System.out.println("Введите элементы массива:");
        do {
            try {
                code = bufferedReader.readLine();
                if(code.equals("end")){
                    flag = false;
                }
                list.add(Integer.parseInt(bufferedReader.readLine()));
            } catch (NumberFormatException e) {
                System.out.println("Неверное значение!");
            } catch (IOException e){
                e.printStackTrace();
            }
        } while (flag);
        System.out.println("Введите операцию:");
        do {
            switch (code) {
                case "print":
                    printCollection();
                    break;
                case "del":
                    deleteElement();
                    break;
                case "exit":
                    System.out.println("Приложение завершено");
                    break;
                case "help":
                default:
                    System.out.println("Список доступных операций: +" +
                            "\n print - Вывести коллекцию в консоль." +
                            "\n del - Удалить i-ый элемент коллекции." +
                            "\n help - Список доступных операций." +
                            "\n exit - Завершение приложения.");
                    break;
            }
        } while (!String.valueOf(code).equals("exit"));
    }

    private void printCollection(){
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    private void deleteElement(){
        try {
            System.out.println("Введите индекс элемента для удаления:");
            code = bufferedReader.readLine();
            list.remove(Integer.parseInt(bufferedReader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
