//Дз реализовать коллекцию класс + интерфейс
//        методы
//        clear()
//        init(int[] ini)
//        size()
//        addStart(int val)
//        toString()
//        addEnd(int val)
//        addPos(int pos, int val)
//        delStart()
//        delEnd()
//        delPos(int pos)
//        min()
//        max()
//        minPos()
//        maxPos()
//        sort()
//        get(int pos)

package myList;

public interface IList<T> {
    void clear();
    void init(T[] ini);
    void size();
    void addStart(T val);
    String toString();
    void addEnd(T val);
    void addPos(int pos, T val);
    void delStart();
    void delEnd();
    void delPos(int pos);
    void min();
    void max();
    void minPos();
    void maxPos();
    void sort();
    void get(int pos);
}
