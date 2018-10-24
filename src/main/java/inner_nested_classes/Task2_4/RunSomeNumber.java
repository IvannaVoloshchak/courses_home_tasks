package inner_nested_classes.Task2_4;

public class RunSomeNumber {
    public static void main(String args[]) {

        Number num = new Number();
        num.getInner();
        new Number().getLocal();
        new Number().getAnonymousClass();
    }
}

