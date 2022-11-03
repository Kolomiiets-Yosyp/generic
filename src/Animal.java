public class Animal<T> {
    public T view;

    public Animal(T view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "view=" + view +
                '}';
    }

}