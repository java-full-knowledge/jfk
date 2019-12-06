package UserRegistration.enums.Message;

public enum ValidationMessage {
    password("Your passwords not match"),
    email("Please provide valid email address"),
    phonenumber("Please provide correct phone number"),
    username("Repeating username...");
    private String message;

    ValidationMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
