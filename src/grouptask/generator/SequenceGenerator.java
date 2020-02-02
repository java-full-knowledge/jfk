package grouptask.generator;

public abstract class SequenceGenerator {
    private SequenceGenerator() {
        throw new AssertionError(
                SequenceGenerator.class.getSimpleName() + " : static ONLY!!!"
        );
    }

    private static int count = 0;

    public static int getNext() {
        return ++count;
    }

}
