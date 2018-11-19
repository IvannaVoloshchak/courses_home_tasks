package inner_nested_classes.task2_4;

public class RunSomeNumber {
    public static void main(String args[]) {

        // inner from outer
        Number num = new Number();
        Number.Inner inner = num.getInner();
        inner.method();

        // anonymous from outer
        // outer from anonymous
        new Number().runAnonymousClass();

        Number.Inner obj = new Number().new Inner();
        // outer from inner
        Number numberFromInner = obj.getOuter();
        numberFromInner.run();

        // local from outer
        Number.Inner local= new Number().getLocal();

        // outer from local
        Number numberFromLocal = local.getOuter();
        numberFromLocal.run();

    }
}