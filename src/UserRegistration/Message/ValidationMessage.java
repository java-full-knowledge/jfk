package UserRegistration.Message;

public enum ValidationMessage {
    password("Your passwords not match"), email("Please provide valid email address"),
    phonenumber("Please provide correct phone number");
    private String message;

    ValidationMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
