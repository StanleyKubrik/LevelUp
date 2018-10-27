package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysChanger {
    private String code = "";
    private int[] arr = null;
    private int[] copy = null;
    private BufferedReader bufferedReader;

    public ArraysChanger() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void init(){
        do{
            try {
                System.out.println("Введите код операции: ");
                code = bufferedReader.readLine();
                if (code.equals("print master") || code.equals("print second")){
                    try {
                        switch (code){
                            case "print master":
                                printArray(arr);
                                break;
                            case "print second":
                                if (copy == null){
                                    System.out.println("ОШИБКА: Сначала скопируйте массив!");
                                } else {
                                    printArray(copy);
                                }
                                break;
                        }
                    } catch (NullPointerException e) {
                        System.out.println("ОШИБКА: Сначала необходимо задать массив!");
                    }
                } else if (code.equals("bsort") || code.equals("isort") || code.equals("reverse") || code.equals("min")
                        || code.equals("max") || code.equals("copy")) {
                    System.out.println("Введите длину массива: ");
                    int length = Integer.parseInt(bufferedReader.readLine());
                    arr = new int[length];
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("Введите следующий элемент массива: ");
                        arr[i] = Integer.parseInt(bufferedReader.readLine());
                    }
                    switch (code){
                        case "bsort":
                            bubbleSort(arr);
                            break;
                        case "isort":
                            insertSort(arr);
                            break;
                        case "copy":
                            copy(arr);
                            break;
                        case "reverse":
                            reverse(arr);
                            break;
                        case "min":
                            min(arr);
                            break;
                        case "max":
                            max(arr);
                            break;
                    }
                } else {
                    switch (code){
                        case "exit":
                            System.out.println("Программа завершена.");
                            break;
                        case "help":
                        default:
                            System.out.println("Список доступных команд: " +
                                    "\n bsort - Сортировка массива пузырьковым методом." +
                                    "\n isort - Сортировка массива методом вставки." +
                                    "\n copy - Копирование массива в массив copy." +
                                    "\n print master - Вывода исходного массива в консоль." +
                                    "\n print second - Вывода скопированного массива в консоль." +
                                    "\n min - Вывод минимального значения массива." +
                                    "\n max - Вывод максимального значения массива." +
                                    "\n reverse - Вывод массива задом наперёд" +
                                    "\n help - Список доступных комманд." +
                                    "\n exit - Завершение программы.");
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА: Необходимо ввести число!");
            } catch (IOException e){
                e.printStackTrace();
            }
        } while (!code.toLowerCase().equals("exit"));
    }

    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void insertSort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }

        System.out.println("Отсортированный массив:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void copy(int[] arr){
        copy = arr;
    }

    public void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void reverse(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
    }

    public void max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Масимальный элемент массива: " + max);
    }
}
