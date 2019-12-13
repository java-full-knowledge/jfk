package jsonparsing.Applications;

import jsonparsing.jsonobject.Colors;
import jsonparsing.parser.ColorsJsonFilePasrer;
import jsonparsing.validator.JsonContentValidator;
import jsonparsing.validator.ValidationResult;
import jsonparsing.validator.colorsvalidators.colorvalidator.ColorValidator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ColorsApplication implements Parsingproces<Colors> {

    private String filestring;

    public ColorsApplication(String filestring) {
        this.filestring = filestring;
    }

    @Override
    public Colors parsing() throws IOException {
        File file = new File(filestring);
        FileInputStream fileInputStream = new FileInputStream(file);
        boolean t = true;
        String colorstring = "";
        int data = fileInputStream.read();
        while (data != -1) {
            colorstring += (char) data;
            data = fileInputStream.read();
        }
        JsonContentValidator jsonContentValidator = new JsonContentValidator();
        ValidationResult[] validationResults = jsonContentValidator.validate(colorstring);
        for (ValidationResult val : validationResults)
            if (!val.isIsvalidate()) {
                System.out.println(val.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        t = true;
        ColorValidator colorvalidator = new ColorValidator();
        validationResults = colorvalidator.validate(colorstring);
        for (ValidationResult validationResult : validationResults)
            if (!validationResult.isIsvalidate()) {
                System.out.println(validationResult.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        ColorsJsonFilePasrer colorsJsonFilePasrer = new ColorsJsonFilePasrer(colorstring);
        return colorsJsonFilePasrer.parse();

    }
}
