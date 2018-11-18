package list;

public interface IList<T> {
    T get(int index);

    void add(T value);

    void toArray();

    int size();

    void remove(int index);

    void type(T val);

    void removeAll();


}
