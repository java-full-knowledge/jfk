package jsonparsing.Applications;

import jsonparsing.jsonobject.Google_Map;
import jsonparsing.parser.Google_MapJsonFileParser;
import jsonparsing.validator.JsonContentValidator;
import jsonparsing.validator.ValidationResult;
import jsonparsing.validator.google_mapvalidators.Google_MapValidator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Google_MapApplication implements Parsingproces<Google_Map> {

    private String filestring;

    public Google_MapApplication(String filestring) {
        this.filestring = filestring;
    }

    @Override
    public Google_Map parsing() throws IOException {
        File file = new File(filestring);
        FileInputStream fileInputStream = new FileInputStream(file);
        boolean t = true;
        String google_mapstring = "";
        int data = fileInputStream.read();
        while (data != -1) {
            google_mapstring += (char) data;
            data = fileInputStream.read();
        }
        JsonContentValidator jsonContentValidator = new JsonContentValidator();
        ValidationResult[] validationResults = jsonContentValidator.validate(google_mapstring);
        for (ValidationResult val : validationResults)
            if (!val.isIsvalidate()) {
                System.out.println(val.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        t = true;
        Google_MapValidator google_mapValidator = new Google_MapValidator();
        validationResults = google_mapValidator.validate(google_mapstring);
        for (ValidationResult validationResult : validationResults)
            if (!validationResult.isIsvalidate()) {
                System.out.println(validationResult.getGetmessage());
                t = false;
            }
        if (!t)
            return null;
        Google_MapJsonFileParser google_mapJsonFileParser = new Google_MapJsonFileParser(google_mapstring);
        return google_mapJsonFileParser.parse();

    }
}
