package repetition.transmission;

import repetition.transmission.exeption.DegreeExeption;

public enum Degree {

    nitral(0), first(1), second(2), third(3), fourth(4), fifth(5), reverse(-1);
    private int degree;

    Degree(int degree) {
        this.degree = degree;
    }

    public int getDegree() {
        return degree;
    }

    public static Degree funk(int degree) {
        Degree[] degrees = Degree.values();
        for (Degree deg : degrees)
            if (deg.degree == degree)
                return deg;

        throw new DegreeExeption();
    }
}
