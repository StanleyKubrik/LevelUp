package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassArray {
    private String code = "";
    private int[] arr;
    BufferedReader bufferedReader;

    public ClassArray() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void init(){
        do{
            try {
                System.out.println("Введите код операции: ");
                code = bufferedReader.readLine();
                if (!code.equals("exit")) {
                    System.out.println("Введите длину массива: ");
                    int length = Integer.parseInt(bufferedReader.readLine());
                    arr = new int[length];
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("Введите следующий элемент массива: ");
                        arr[i] = Integer.parseInt(bufferedReader.readLine());
                    }
                    switch (code){
                        case "sort":
                            bubbleSort(arr);
                            break;
                        case "reverse":
                            reverse(arr);
                            break;
                        case "help":
                            System.out.println("Список доступных команд: " +
                                    "\n sort - Сортировка массива." +
                                    "\n reverse - Вывод массива задом наперёд" +
                                    "\n exit - Завершение программы.");
                            break;
                        default:
                            System.out.println("Введите \"help\" для вывода доступных команд!");
                            break;
                    }
                } else {
                    System.out.println("Программа завершена.");
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
    }

    public void reverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }
}
