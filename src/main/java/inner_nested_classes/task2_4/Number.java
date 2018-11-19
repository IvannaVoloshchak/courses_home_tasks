package inner_nested_classes.task2_4;

public class Number {
    public void run(){
        System.out.println("This is method of Number class");
    }

    public Number getNumber() {
        return this;
    }

    public class Inner implements SomeNumber {
        public void method() {
            System.out.println("Interface Method Implementation");
        }

        public Number getOuter() {
            System.out.println("outer from inner");
            return getNumber();
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
                getNumber();
            }

            @Override
            public Number getOuter(){
                System.out.println("outer from local");
                return getNumber();
            }
        }
        return new Local();
    }

    public void runAnonymousClass() {
        new Number() {
            public Number runNumberMethod() {
                System.out.println("This is my Anonymous  class");
                return getNumber();
            }
        }.runNumberMethod();
    }
}






