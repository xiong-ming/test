package 泛型.含有泛型的类;


public class GenericClass<E> {
    private E name;

    public E getName() {

        return name;
    }

    public void setName(E name) {

        this.name = name;
    }
}
