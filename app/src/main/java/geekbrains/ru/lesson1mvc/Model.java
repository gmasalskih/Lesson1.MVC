package geekbrains.ru.lesson1mvc;

import java.util.Arrays;
import java.util.List;

public final class Model {

    private List<Integer> mList;

    private Model() {
        mList = Arrays.asList(0, 0, 0);
    }

    private static Model model;

    public static Model getInstance() {
        if (model == null) model = new Model();
        return model;
    }

    public int getElementValueAtIndex(int _index) {
        return mList.get(_index);
    }

    public void setElementValueAtIndex(int _index, int value) {
        mList.set(_index, value);
    }
}

