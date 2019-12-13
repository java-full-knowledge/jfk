package jsonparsing.parser;

import jsonparsing.jsonobject.Marker;

public class MarkerJsonFileParser implements Parser<Marker> {
    private final String jsonfile;
    private String[] markerFields;

    public MarkerJsonFileParser(String jsonfile) {
        this.jsonfile = jsonfile;
        markerFields=jsonfile.split("\",");
    }
    @Override
    public Marker parse() {

        String name=this.selector("name");
        double [] position=this.selectorarray();


        return new Marker(name,position);
    }

    private double[] selectorarray() {
        String temp=selector("position").replace("[","").replace("]","");
        String [] arr=temp.split(",");
        double [] array=new double[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            array[i]=Double.parseDouble(arr[i]);
        }
        return array;
    }

    private String selector(String attribute) {
        for (String personField : this.markerFields) {
            if (personField.contains(attribute)) {
                return personField.split(":")[1]
                        .replace("{", "")
                        .replace("}", "")
                        .replace("\"", "")
                        .replace("\n" ,"")
                        .replace(" ","")
                        .trim();
            }
        }
        return "";
    }
}
