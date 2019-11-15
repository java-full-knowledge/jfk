package TaskRecursia;

import java.util.Scanner;

public class NaturalNumberInpute {
    public static void main(String[] args) {
        int number;
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scaner.nextInt();
        NaturalNumberInpute obj = new NaturalNumberInpute();
        System.out.print("Natural numbers till " + number + " : ");
        obj.NaturalNumberInpute(number, 1);


    }

    int NaturalNumberInpute(int number, int i) {
        if (i <= number) {
            System.out.print(i + " ");
            return (NaturalNumberInpute(number, ++i));
        }
        return 1;
    }
}