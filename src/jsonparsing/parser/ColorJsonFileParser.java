package jsonparsing.parser;

import jsonparsing.jsonobject.Code;
import jsonparsing.jsonobject.Color;

public class ColorJsonFileParser implements Parser<Color> {

    private final String jsonfile;
    private String[] colorFields;
    private String[] codefilds;

    public ColorJsonFileParser(String jsonfile) {
        this.jsonfile = jsonfile;
        codefilds = jsonfile.split("code");
        colorFields = codefilds[0].split(",");
    }

    @Override
    public Color parse() {


        String color1 = this.selector("color");
        String coolorcategory = this.selector("category");
        String coolortype = this.selector("type");
        CodeJsonFileParser codejson = new CodeJsonFileParser(codefilds[1]);
        Code code = codejson.parse();

        return new Color(color1, coolorcategory, coolortype, code);
    }

    private String selector(String attribute) {
        for (String personField : this.colorFields) {
            if (personField.contains(attribute)) {
                return personField.split(":")[1]
                        .replace("{", "")
                        .replace("}", "")
                        .replace("\"", "")
                        .trim();
            }
        }
        return "";
    }

}
