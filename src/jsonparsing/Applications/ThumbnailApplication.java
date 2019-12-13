package jsonparsing.Applications;

import jsonparsing.jsonobject.Thumbnail;
import jsonparsing.parser.ThumbnailJsonFileParser;
import jsonparsing.validator.JsonContentValidator;
import jsonparsing.validator.ValidationResult;
import jsonparsing.validator.thumbnailvalidators.ThumbnailValidator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThumbnailApplication implements Parsingproces<Thumbnail> {
    private String filestring;

    public ThumbnailApplication(String filestring) {
        this.filestring = filestring;
    }

    @Override
    public Thumbnail parsing() throws IOException {
        File file = new File(filestring);
        FileInputStream fileInputStream = new FileInputStream(file);
        String thumbnailstring = "";
        boolean t = true;
        int data = fileInputStream.read();
        while (data != -1) {
            thumbnailstring += (char) data;
            data = fileInputStream.read();
        }
        JsonContentValidator jsonContentValidator = new JsonContentValidator();
        ValidationResult[] validationResults = jsonContentValidator.validate(thumbnailstring);
        for (ValidationResult val : validationResults)
            if (!val.isIsvalidate()) {
                System.out.println(val.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        t = true;
        ThumbnailValidator thumbnailValidator = new ThumbnailValidator();
        validationResults = thumbnailValidator.validate(thumbnailstring);
        for (ValidationResult validationResult : validationResults)
            if (!validationResult.isIsvalidate()) {
                System.out.println(validationResult.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        ThumbnailJsonFileParser thumbnailJsonFileParser = new ThumbnailJsonFileParser(thumbnailstring);
        return thumbnailJsonFileParser.parse();
    }
}
