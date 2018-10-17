package home_task1;

public class Task3 {
    public static void main(String[] args) {

        loopFor(20, 500, 1000);
        loopDoWhile(20,  500, 1000);
        loopWhile(20,  500, 1000);
    }

    static void loopFor(double rate, double amount, int goal) {
        int years;
        for ( years=1 ; ; years++) {
            amount = amount + (amount * rate / 100);
            if (amount >= goal) {
                break;
            }
        }
        System.out.println("You need " + years + "years, for get " + amount + " money. With " +rate +" percent");
    }

    static void loopDoWhile(double rate, double amount, int goal) {
        int years=0;
        do {
            amount = amount + (amount * rate / 100);
            years++;
        } while (amount <= goal);
        System.out.println("You need " + years + " years, for get " + amount + " money. With " +rate +" percent");
    }

    static void loopWhile(double rate, double amount, int goal) {
        int years=0;
        while (amount <= goal) {
            amount = amount + (amount * rate / 100);
            years++;
        }
        System.out.println("You need " + years + " years, for get " + amount + " money With " +rate +" percent");
    }
}
