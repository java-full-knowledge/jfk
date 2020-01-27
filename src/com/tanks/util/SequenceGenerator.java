package com.tanks.util;

public final class SequenceGenerator {

    private SequenceGenerator() {
        throw new AssertionError(
                SequenceGenerator.class.getSimpleName() + " : static ONLY!!!"
        );
    }

    private static int value = 0;

    public static int getNext() {
        return ++value;
    }
}
