package jsonparsing.parser;

import jsonparsing.jsonobject.Thumbnail;

public class ThumbnailJsonFileParser implements Parser<Thumbnail> {

    private final String jsonfile;
    private String[] thumbnailFields;

    public ThumbnailJsonFileParser(String jsonfile) {
        this.jsonfile = jsonfile;
        jsonfile=jsonfile.replaceFirst(":","");
        thumbnailFields=jsonfile.split(",");
    }

    @Override
    public Thumbnail parse() {


        String thumbnailurl = this.selector("url");
        int thumbnailwidth = Integer.parseInt(this.selector("width"));
        int thumbnailheight = Integer.parseInt(this.selector("height"));

        return new Thumbnail(thumbnailurl,thumbnailwidth,thumbnailheight);
    }

    private String selector(String attribute) {
        for (String personField : this.thumbnailFields) {
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
