package jsonparsing.parser;

import jsonparsing.jsonobject.Color;
import jsonparsing.jsonobject.Colors;

public class ColorsJsonFilePasrer implements Parser<Colors> {
    private final String jsonfile;
    private String[] colorsfilds;

    public ColorsJsonFilePasrer(String jsonfile) {
        this.jsonfile = jsonfile;
        jsonfile=jsonfile.replaceFirst(":","");
        colorsfilds=jsonfile.split("},");
    }

    @Override
    public Colors parse() {
        Color [] colors=new Color[colorsfilds.length-1];
        ColorJsonFileParser colorJsonFileParser;
        for (int i = 0; i <colors.length ; i++) {
            colorJsonFileParser=new ColorJsonFileParser(colorsfilds[i]);
            colors[i]=colorJsonFileParser.parse();
        }
        return new Colors(colors);
    }

}
