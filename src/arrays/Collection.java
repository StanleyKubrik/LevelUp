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
    private BufferedReader bufferedReader;

    public Collection(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();
        fillCollection();
    }

    private void fillCollection(){
        System.out.println("Введите элементы массива:");
        try {
            do {
                code = bufferedReader.readLine();
                list.add(Integer.parseInt(code));
            } while (!code.equals("end"));
        } catch (NumberFormatException e) {
            collectionOperatin();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void collectionOperatin(){
        System.out.println("\nВведите операцию:");
        try {
            do {
                code = bufferedReader.readLine();
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
            } while (!code.equals("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printCollection(){
        System.out.println("Коллекция состоит из:");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        collectionOperatin();
    }

    private void deleteElement(){
        try {
            System.out.println("Введите индекс элемента для удаления:");
            code = bufferedReader.readLine();
            list.remove(Integer.parseInt(code));
            printCollection();
            collectionOperatin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
