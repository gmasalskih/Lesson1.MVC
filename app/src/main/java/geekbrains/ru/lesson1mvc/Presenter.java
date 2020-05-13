package geekbrains.ru.lesson1mvc;

public class Presenter {

    private Model model = Model.getInstance();

    public int getCurrentValueByIndex(int index) {
        return model.getElementValueAtIndex(index);
    }

    public int getNewValueByIndex(int index) {
        int value = model.getElementValueAtIndex(index);
        value++;
        model.setElementValueAtIndex(index, value);
        return value;
    }
}
