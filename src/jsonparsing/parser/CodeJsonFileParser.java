package jsonparsing.parser;

import jsonparsing.jsonobject.Code;

public class CodeJsonFileParser implements Parser<Code> {

    private final String jsonfile;
    private String[] imageFields;

    public CodeJsonFileParser(String jsonfile) {
        this.jsonfile = jsonfile;
        jsonfile=jsonfile.replaceFirst(":","");
        imageFields=jsonfile.split("],");
    }
    @Override
    public  Code parse() {


        int [] codergba=this.selectorarray();
        String codehex=this.selector("hex");

        return new Code(codergba,codehex);
    }

    private int[] selectorarray() {
        String temp=selector("rgba").replace("[","").replace("]","");
        String [] arr=temp.split(",");
        int [] array=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            array[i]=Integer.parseInt(arr[i]);
        }
        return array;
    }

    private String selector(String attribute) {
        for (String personField : this.imageFields) {
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
