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

public interface IList {
    void clear();
    void init(int[] ini);
    void size();
    void addStart(int val);
    String toString();
    void addEnd(int val);
    void addPos(int pos, int val);
    void delStart();
    void delEnd();
    void delPos(int pos);
    void min();
    void max();
    void minPos();
    void maxPos();
    void sort();
    int get(int pos);
}
