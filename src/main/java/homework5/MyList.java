package homework5;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> array = new ArrayList<>();

    public MyList<T> add(T t) {
        array.add(t);
        return this;
    }

    public T max() {
        T max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).doubleValue() > max.doubleValue()) {
                max = array.get(i);
            }
        }
        return max;
    }

    public T min() {
        T min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).doubleValue() < min.doubleValue()) {
                min = array.get(i);
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return "MyList " + "array = " + array;
    }
}
