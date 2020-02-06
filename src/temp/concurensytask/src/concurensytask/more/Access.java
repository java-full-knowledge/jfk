package concurensytask.more;
/**
 * Arman Torosyan
 */

public class Access {

   private static  boolean access = false;

    public static void setTrue() {
        synchronized (Access.class) {
            access = true;
        }
    }
    public static void setFalse() {
        synchronized (Access.class) {
            access = false;
        }
    }

    public static boolean isAccess() {
        return access;
    }
}
