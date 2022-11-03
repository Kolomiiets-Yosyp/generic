public class View<T> extends Animal{
    public View(T view) {
        super(view);
    }
    public T Breed;

    @Override
    public String toString() {
        return "Animal: " +
                view +
                ", view: " + Breed;
    }

    public View(T view, T breed) {
        super(view);
        this.Breed = breed;
    }
}
