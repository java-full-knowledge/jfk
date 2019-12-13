package jsonparsing.parser;

import jsonparsing.jsonobject.Google_Map;
import jsonparsing.jsonobject.Marker;

public class Google_MapJsonFileParser implements Parser<Google_Map> {
    private final String jsonfile;
    private String[] colorsfilds;

    public Google_MapJsonFileParser(String jsonfile) {
        this.jsonfile = jsonfile;
        jsonfile = jsonfile.replaceFirst(":", "");
        colorsfilds = jsonfile.split("},");
    }

    @Override
    public Google_Map parse() {
        Marker[] colors = new Marker[colorsfilds.length];
        MarkerJsonFileParser markerJsonFileParser;
        for (int i = 0; i < colors.length; i++) {
            markerJsonFileParser = new MarkerJsonFileParser(colorsfilds[i]);
            colors[i] = markerJsonFileParser.parse();
        }
        return new Google_Map(colors);
    }
}
