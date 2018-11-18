package list;

import java.util.ArrayList;
import java.util.List;

public class ListArr<T> extends BaseList<T> implements IList<T> {
    private List<T> list;

    public ListArr() {
        list = new ArrayList<>();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void add(T value) {
        list.add(value);
    }

    @Override
    public void toArray() {
        if (list.size() == 0) {
            System.out.println("size = empty(0)");
            return;
        }
        list.forEach(this::print);
        System.out.println();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public void type(T val) {
        super.typeCheck(val);
    }

    @Override
    public void removeAll() {
        list.clear();
    }
}
