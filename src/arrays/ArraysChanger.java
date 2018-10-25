package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysChanger {
    private String code = "";
    private int[] arr;
    BufferedReader bufferedReader;

    public ArraysChanger() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void init(){
        do{
            try {
                System.out.println("Введите код операции: ");
                code = bufferedReader.readLine();
                if (code.equals("bsort") || code.equals("isort") || code.equals("reverse") || code.equals("min")
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
                            bubbleSort(arr);
                            break;
                        case "reverse":
                            reverse(arr);
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
                                    "\n reverse - Вывод массива задом наперёд" +
                                    "\n exit - Завершение программы.");
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести число!");
            } catch (IOException e){
                e.printStackTrace();
            }
        } while (!code.toLowerCase().equals("exit"));
    }

    public void bubbleSort(int[] arr){
        for (int i = arr.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + i];
                    arr[j + i] = tmp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void reverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }
}
