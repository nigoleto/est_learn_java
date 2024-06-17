package ormi0617;

public class Car1<T> {
    private T t;

    public void setCar1(T t) {
        this.t = t;
    }

    public T getCar1() {
        return t;
    }

    public boolean isString() {
        return t instanceof String;
    }

//    public <T> T sumCar1(T t1, T t2) {
//
//        return t1 + t2;
//    }
}
