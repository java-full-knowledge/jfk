package jsonparsing;

import jsonparsing.Applications.*;
import jsonparsing.jsonobject.*;

import java.io.IOException;

public class JsonApplication {
    public static void main(String[] args) throws IOException {
        String personstring = "C:\\Java\\jfk\\src\\jsonparsing\\jsonfiles\\person.json",
                colorstring = "C:\\Java\\jfk\\src\\jsonparsing\\jsonfiles\\colors.json",
                imagestring = "C:\\Java\\jfk\\src\\jsonparsing\\jsonfiles\\image.json",
                thumbnailstring = "C:\\Java\\jfk\\src\\jsonparsing\\jsonfiles\\thumbnail.json",
                google_mapstring="C:\\Java\\jfk\\src\\jsonparsing\\jsonfiles\\google_map.json";

        PersonApplication personApplication = new PersonApplication(personstring);
        ImageApplication imageApplication = new ImageApplication(imagestring);
        ColorsApplication colorsApplication = new ColorsApplication(colorstring);
        ThumbnailApplication thumbnailApplication = new ThumbnailApplication(thumbnailstring);
        Google_MapApplication google_mapApplication=new Google_MapApplication(google_mapstring);

        Person person = personApplication.parsing();
        Image image = imageApplication.parsing();
        Colors colors = colorsApplication.parsing();
        Thumbnail thumbnail = thumbnailApplication.parsing();
        Google_Map google_map=google_mapApplication.parsing();

        System.out.println(person);
        System.out.println();
        System.out.println(image);
        System.out.println();
        System.out.println(thumbnail);
        System.out.println();
        System.out.println(colors);
        System.out.println(google_map);


    }
}
