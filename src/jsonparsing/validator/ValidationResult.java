package jsonparsing.validator;

public class ValidationResult {

    private boolean isvalidate;
    private String getmessage;

    public ValidationResult(boolean isvalidate, String getmessage) {
        this.isvalidate = isvalidate;
        this.getmessage = getmessage;
    }

    public boolean isIsvalidate() {
        return isvalidate;
    }

    public void setIsvalidate(boolean isvalidate) {
        this.isvalidate = isvalidate;
    }

    public String getGetmessage() {
        return getmessage;
    }

    public void setGetmessage(String getmessage) {
        this.getmessage = getmessage;
    }
}
