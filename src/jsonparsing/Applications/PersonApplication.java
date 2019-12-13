package jsonparsing.Applications;

import jsonparsing.jsonobject.Person;
import jsonparsing.parser.PersonJsonFileParser;
import jsonparsing.validator.JsonContentValidator;
import jsonparsing.validator.ValidationResult;
import jsonparsing.validator.personvalidators.PersonValidator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PersonApplication implements Parsingproces<Person> {

    private String filestring;

    public PersonApplication(String filestring) {
        this.filestring = filestring;
    }

    @Override
    public Person parsing() throws IOException {
        File file = new File(filestring);
        FileInputStream fileInputStream = new FileInputStream(file);
        String perosnstring = "";
        boolean t = true;
        int data = fileInputStream.read();
        while (data != -1) {
            perosnstring += (char) data;
            data = fileInputStream.read();
        }
        JsonContentValidator jsonContentValidator = new JsonContentValidator();
        ValidationResult[] validationResults = jsonContentValidator.validate(perosnstring);
        for (ValidationResult val : validationResults)
            if (!val.isIsvalidate()) {
                System.out.println(val.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        t = true;
        PersonValidator personValidator = new PersonValidator();
        validationResults = personValidator.validate(perosnstring);
        for (ValidationResult validationResult : validationResults)
            if (!validationResult.isIsvalidate()) {
                System.out.println(validationResult.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        PersonJsonFileParser personJsonFileParser = new PersonJsonFileParser(perosnstring);
        return personJsonFileParser.parse();

    }
}
