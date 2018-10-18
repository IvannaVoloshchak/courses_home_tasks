package numbers;

import java.util.Objects;

public class Number {
    public int i;

    public Number(int i) {

        this.i = i;
    }

    public Number() {
    }

    public Number add(Number number) {
        int sum = i + number.i;
        return new Number(sum);
    }

    public Number subtract(Number number) {
        int sub = i - number.i;
        return new Number(sub);
    }

    public Number multiply(Number number) {
        int mult = i * number.i;
        return new Number(mult);
    }

    public Number division(Number number) {
        int div = i / number.i;
        return new Number(div);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        if (i != number.i) return false;
        return i == number.i;
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result;
        return result;
    }

    @Override
    public String toString() {
        return "Number{" +
                "i=" + i +
                '}';
    }
}
