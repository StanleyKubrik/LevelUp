package list;

public abstract class BaseList<T> {
    protected void typeCheck(T val) {
        if (val instanceof Integer) System.out.println(val.getClass());
        if (val instanceof Float) System.out.println(val.getClass());
        if (val instanceof Double) System.out.println(val.getClass());
        if (val instanceof Long) System.out.println(val.getClass());
        if (val instanceof Boolean) System.out.println(val.getClass());
        if (val instanceof String) System.out.println(val.getClass());
    }

    protected abstract T get(int index);

    protected abstract void add(T value);

    protected abstract void toArray();

    protected abstract void remove(int index);

    protected abstract void type(T val);

    protected abstract void removeAll();

    protected void print(T val){
        System.out.print(val + " ");
    }

}
