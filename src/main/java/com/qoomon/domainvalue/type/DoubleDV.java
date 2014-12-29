package com.qoomon.domainvalue.type;

public abstract class DoubleDV extends ComparableDV<Double> {

    protected DoubleDV(final Double value) {
        super(value);
    }

    /**
     * @param stringValue to wrap
     * @return true if valid, else false
     */
    public static boolean isValid(final String stringValue) {
        try {
            Double.valueOf(stringValue);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

}