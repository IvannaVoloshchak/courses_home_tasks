package numbers;

public class RunProgram {
    public static void main(String[] args) {
        SimpleFraction simpleFraction1 = new SimpleFraction(1, 6);
        SimpleFraction simpleFraction2 = new SimpleFraction(2, 6);

        SimpleFraction plusResult = simpleFraction1.add(simpleFraction2);
        System.out.print(simpleFraction1.toString() + " + " + simpleFraction2.toString() + " = ");
        plusResult.print();

        SimpleFraction minusResult = simpleFraction1.subtract(simpleFraction2);
        System.out.print(simpleFraction1.toString() + " - " + simpleFraction2.toString() + " = ");
        minusResult.print();

        SimpleFraction divideResult = simpleFraction1.division(simpleFraction2);
        System.out.print(simpleFraction1.toString() + " / " + simpleFraction2.toString() + " = ");
        divideResult.print();

        SimpleFraction multiplyResult = simpleFraction1.multiply(simpleFraction2);
        System.out.print(simpleFraction1.toString() + " * " + simpleFraction2.toString() + " = ");
        multiplyResult.print();

        boolean isEquals = simpleFraction1.equals(simpleFraction2);
        System.out.println(simpleFraction1.toString() + " == " + simpleFraction2.toString() + " = " + isEquals);

        System.out.println("Hashcode " + simpleFraction1.hashCode());
        System.out.println("Hashcode " + simpleFraction2.hashCode());
    }
}
