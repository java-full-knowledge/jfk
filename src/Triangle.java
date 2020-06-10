public class Triangle {

    public static void main(String[] args) {

        int columns = 10;
        int rows = 10;
        int buf = (rows - 1) / 2;
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                System.out.print(i);
                System.out.print(k + " ");
                //System.out.print("I" + i);
                //System.out.print("K" + k + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < (buf * 2) + 1; k++) {
                //if (i + k == buf || buf == k || k == i + buf || buf == i || (i <= buf && k > buf * 2 && buf == i)) {
                if (i + k == buf || k - i == buf || buf == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        int m=3;
        int count,temp;
        if(m%2!=0)
            temp=m/2;
        else
            temp=(m-1)/2;
        count=temp;
        for(int i=0;i<=temp;i++) {
            for(int k=0;k<m;k++)
                if(k<count || k>=count+(2*i+1))
                    System.err.print("  ");
                else
                    System.err.print("* ");
            count--;
            System.err.println();
        }
        /*for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((k >= i)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (k <= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((columns - 1 >= i + k)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((columns - 1 <= i + k)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (k == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (columns - 1 == i + k) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();*/








        /*for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((columns - 1 >= i + k)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (k >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();*/


        /*for (int i = 0; i < columns; i++) {
            for (int k = 0; k <= i; k++) {

                System.out.print(" * ");

            }
            System.out.println();
        }*/
    }
}