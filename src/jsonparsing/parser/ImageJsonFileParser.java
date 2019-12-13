package jsonparsing.parser;

import jsonparsing.jsonobject.Image;

public class ImageJsonFileParser implements Parser<Image> {

    private final String jsonfile;
    private String[] imageFields;

    public ImageJsonFileParser(String jsonfile) {
        this.jsonfile = jsonfile;
        jsonfile = jsonfile.replaceFirst(":", "");
        imageFields = jsonfile.split(",");
    }

    @Override
    public Image parse() {


        String imageurl = this.selector("url");
        int imagewidth = Integer.parseInt(this.selector("width"));
        int imageheight = Integer.parseInt(this.selector("height"));

        return new Image(imageurl, imagewidth, imageheight);
    }

    private String selector(String attribute) {
        for (String personField : this.imageFields) {
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
