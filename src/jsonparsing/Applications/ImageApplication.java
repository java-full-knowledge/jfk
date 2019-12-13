package jsonparsing.Applications;

import jsonparsing.jsonobject.Image;
import jsonparsing.parser.ImageJsonFileParser;
import jsonparsing.validator.JsonContentValidator;
import jsonparsing.validator.ValidationResult;
import jsonparsing.validator.imagevalidators.ImageValidator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageApplication implements Parsingproces<Image> {

    private String filestring;

    public ImageApplication(String filestring) {
        this.filestring = filestring;
    }

    @Override
    public Image parsing() throws IOException {
        File file = new File(filestring);
        FileInputStream fileInputStream = new FileInputStream(file);
        String imagestring = "";
        boolean t = true;
        int data = fileInputStream.read();
        while (data != -1) {
            imagestring += (char) data;
            data = fileInputStream.read();
        }
        JsonContentValidator jsonContentValidator = new JsonContentValidator();
        ValidationResult[] validationResults = jsonContentValidator.validate(imagestring);
        for (ValidationResult val : validationResults) {
            if (!val.isIsvalidate()) {
                System.out.println(val.getGetmessage());
                t = false;
            }
        }
        if (!t)
            return null;
        t = true;
        ImageValidator imageValidator = new ImageValidator();
        validationResults = imageValidator.validate(imagestring);
        for (ValidationResult validationResult : validationResults)
            if (!validationResult.isIsvalidate()) {
                System.out.println(validationResult.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        ImageJsonFileParser imageJsonFileParser = new ImageJsonFileParser(imagestring);
        return imageJsonFileParser.parse();
    }
}
