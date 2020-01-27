package CheckMemory;

public class Test {

    public static void main(String[] args) {
        Integer [] arr = new Integer[1];
        arr[0] = 5;
        EsimInch esimInch = new EsimInch(arr);
        System.out.println(esimInch.arr1[0]);
        arr[0] = 8;
        System.out.println(esimInch.arr1[0]);
    }
}
