package UserRegistration.validators.result;

public class ValidationResult {

    private boolean resul;
    private String validationMessage;

    public ValidationResult(boolean resul, String validatorMessage) {
        this.resul = resul;
        this.validationMessage = validatorMessage;
    }

    public boolean isResul() {
        return resul;
    }

    public void setResul(boolean resul) {
        this.resul = resul;
    }

    public String getValidatorMessage() {
        return validationMessage;
    }

    public void setValidatorMessage(String validatorMessage) {
        this.validationMessage = validatorMessage;
    }
}
