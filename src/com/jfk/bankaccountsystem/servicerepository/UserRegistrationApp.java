package com.jfk.bankaccountsystem.servicerepository;

public class UserRegistrationApp {

    public static void main(String[] args) {
        int maxNumberCount = 3;
        int userRowCount = 10;
        Schema userSchema = new UserSchema(userRowCount);
        Schema phoneNumberSchema = new PhoneNumberSchema(maxNumberCount * userRowCount);
        Schema[] schemas = new Schema[2];
        schemas[0] = userSchema;
        schemas[1] = phoneNumberSchema;

        Database oracleDatabase = new OracleDatabase(schemas);

        BasicOperationService phoneNumberService = new PhoneNumberOperationService(oracleDatabase);
        BasicOperationService userService = new UserOperationService(oracleDatabase);

        PhoneNumber firstNumber = (PhoneNumber)phoneNumberService.create(new PhoneNumber(10, "093642574"));
        PhoneNumber secondNumber = (PhoneNumber) phoneNumberService.create(new PhoneNumber(2, "091642574"));
        PhoneNumber [] numbers = new PhoneNumber[2];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;

        User user = new User(320, "Armen", numbers);
        userService.create(user);
    }
}
