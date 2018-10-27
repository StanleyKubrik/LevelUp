package arrays;

public class Arrays {

    public void min(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
    }

    public void max(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Масимальный элемент массива: " + max);
    }

    public void index_min(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = i;
            }
        }
        System.out.println("Индекс минимального элемента массива: " + min);
    }

    public void index_max(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = i;
            }
        }
        System.out.println("Индекс максимального элемента массива: " + max);
    }

    public void sum_not_even(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0){
                sum += a[i];
            }
        }
        System.out.println("Сумма элементов массива с нечётными индексами: " + sum);
    }
}
