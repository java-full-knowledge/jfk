package UserRegistration.validators.validator;

public enum Phonetypes {
    a("055"), b("077"), c("093"),
    d("094"), e("095"), f("096"),
    h("097"), g("098"), j("099");

    private String num;

    Phonetypes(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

}
