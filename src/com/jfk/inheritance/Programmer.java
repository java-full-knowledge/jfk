package src.com.jfk.inheritance;

public class Programmer extends Employee {

    private String language;

    public Programmer() {
        super(12.2f);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
