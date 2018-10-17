package numbers;

public class SimpleFraction extends Number {

    private int numerator;
    private int denominator;

    public SimpleFraction(int a, int b) {
        numerator = a;
        try {
            if (b == 0) {
                throw new Exception("This denominator Can't be zero");
            } else {
                denominator = b;
            }
        } catch (Exception e) {
            System.out.println("This denominator Can't be zero");
            System.exit(0);
        }
    }

    public SimpleFraction multiply(SimpleFraction num) {
        int numerator1 = numerator * num.numerator;
        int denominator1 = denominator * num.denominator;
        return new SimpleFraction(numerator1, denominator1);
    }

    public SimpleFraction add(SimpleFraction num) {
        int numerator1;
        int denominator1;
        if (num.denominator == denominator) {
            numerator1 = numerator + num.numerator;
            denominator1 = num.denominator;
        } else {
            numerator1 = numerator * num.denominator + num.numerator * denominator;
            denominator1 = denominator * num.denominator;
        }
        return new SimpleFraction(numerator1, denominator1);
    }

    public SimpleFraction subtract(SimpleFraction num) {
        int numerator1;
        int denominator1;

        if (num.denominator == denominator) {
            numerator1 = numerator - num.numerator;
            denominator1 = num.denominator;

        } else {
            numerator1 = numerator * num.denominator - num.numerator * denominator;
            denominator1 = denominator * num.denominator;
        }
        return new SimpleFraction(numerator1, denominator1);
    }

    public SimpleFraction division(SimpleFraction num) {
        int numerator1 = numerator * num.denominator;
        int denominator1 = denominator * num.numerator;
        return new SimpleFraction(numerator1, denominator1);
    }
    public void print(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        boolean isEquals = false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SimpleFraction that = (SimpleFraction) o;
        if (this.numerator * that.denominator == this.denominator * that.numerator) {
            isEquals = true;
        }
        return isEquals;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
