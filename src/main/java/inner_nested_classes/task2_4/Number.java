package inner_nested_classes.task2_4;

public class Number {

    private class Inner implements SomeNumber {
        public void getnum() {
            System.out.println("Interface Method Implementation");
        }
    }


    public Inner getInner() {
        System.out.println("this is nested class");
        return new Inner();
    }

    public Inner getLocal() {
        class Local extends Inner {
            public Local() {
                System.out.println("This is my local class");
            }
        }
        return new Local();
    }

    public void getAnonymousClass() {
        new Number() {
            public void methodName() {
                System.out.println("This is my Anonymous class");
            }
        }.methodName();
    }
}






