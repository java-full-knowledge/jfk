package TaskRecursia;

public class NaturalNumber {
    public static void main(String[] args) {
        NaturalNumber obj = new NaturalNumber();
        System.out.print("Natural numbers till " + 10 + " : ");
        obj.NaturalNumber(10, 1);
    }

    int NaturalNumber(int number, int i) {
        if (i <= number) {
            System.out.print(i + " ");
            return (NaturalNumber(number, ++i));
        }
        return 1;
    }
}
