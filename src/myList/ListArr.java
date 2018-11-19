package myList;

import java.lang.reflect.Array;

public class ListArr implements IList {
    private int[] newList;

    public ListArr(int[] ints){
        newList = ints;
    }

    @Override
    public void clear() {
        newList = null;
    }

    @Override
    public void init(int[] ini) {
        if (ini == null) {
            newList = new int[0];
        } else {
            newList = ini;
        }
    }

    @Override
    public void size() {
        System.out.println("Размер массива: " + newList.length);
    }

    @Override
    public void addStart(int val) {
        int[] tempList = new int[newList.length + 1];
        for (int i = 0; i <= newList.length; i++) {
            tempList[i + 1] = newList[i];
        }
        tempList[0] = val;
        newList = null;
        newList = tempList;
        tempList = null;
    }

    @Override
    public void addEnd(int val) {
        int[] tempList = new int[newList.length + 1];
        for (int i = 0; i < newList.length; i++) {
            tempList[i] = newList[i];
        }
        tempList[tempList.length - 1] = val;
        newList = null;
        newList = tempList;
        tempList = null;
    }

    @Override
    public void addPos(int pos, int val) {

    }

    @Override
    public void delStart() {
        int[] tempList = new int[newList.length - 1];
        for (int i = 1; i < newList.length - 1; i++) {
            tempList[i - 1] = newList[i];
        }
        newList = null;
        newList = tempList;
        tempList = null;
    }

    @Override
    public void delEnd() {
        newList[newList.length - 1] = 0;
    }

    @Override
    public void delPos(int pos) {
        int[] tempList = new int[newList.length - 1];

    }

    @Override
    public void min() {
        int min = newList[0];
        for (int i = 0; i < newList.length; i++){
            if (newList[i] < min){
                min = newList[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
    }

    @Override
    public void max() {
        int max = newList[0];
        for (int i = 0; i < newList.length; i++){
            if (newList[i] > max){
                max = newList[i];
            }
        }
        System.out.println("Масимальный элемент массива: " + max);
    }

    @Override
    public void minPos() {
        int min = newList[0];
        for (int i = 0; i < newList.length; i++){
            if (newList[i] <= min){
                min = i;
            }
        }
        System.out.println("Индекс минимального элемента массива: " + min);
    }

    @Override
    public void maxPos() {
        int max = newList[0];
        for (int i = 0; i < newList.length; i++){
            if (newList[i] > max){
                max = i;
            }
        }
        System.out.println("Индекс максимального элемента массива: " + max);
    }

    @Override
    public void sort() {
        for (int i = 0; i < newList.length; i++) {
            for (int j = 1; j < newList.length - i; j++) {
                if (newList[j - 1] > newList[j]) {
                    int temp = newList[j - 1];
                    newList[j - 1] = newList[j];
                    newList[j] = temp;
                }
            }
        }
    }

    @Override
    public int get(int pos) {
        return newList[pos];
    }
}
