package numbers;

public class RunProgram {
    public static void main(String[] args) {
        SimpleFraction simpleFraction1 = new SimpleFraction(1, 3);
        SimpleFraction simpleFraction2 = new SimpleFraction(1, 4);

        SimpleFraction plusResult = simpleFraction1.add(simpleFraction2);
        System.out.print(simpleFraction1 + " + " + simpleFraction2 + " = ");
        plusResult.print();

        SimpleFraction minusResult = simpleFraction1.subtract(simpleFraction2);
        System.out.print(simpleFraction1 + " - " + simpleFraction2 + " = ");
        minusResult.print();

        SimpleFraction divideResult = simpleFraction1.division(simpleFraction2);
        System.out.print(simpleFraction1 + " / " + simpleFraction2 + " = ");
        divideResult.print();

        SimpleFraction multiplyResult = simpleFraction1.multiply(simpleFraction2);
        System.out.print(simpleFraction1 + " * " + simpleFraction2 + " = ");
        multiplyResult.print();

        boolean isEquals = simpleFraction1.equals(simpleFraction2);
        System.out.println(simpleFraction1 + " == " + simpleFraction2 + " = " + isEquals);

        System.out.println("Hashcode " + simpleFraction1.hashCode());
        System.out.println("Hashcode " + simpleFraction2.hashCode());
    }
}
