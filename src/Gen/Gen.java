package Gen;

/**
 * Created by IT_School on 07.11.2015.
 */
class Gen <T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    void showType(){
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}

