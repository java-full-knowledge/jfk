package JSONPARSING.Parser;

public class PersonFields {
    private String[] fields;
    private String [] values;

    public PersonFields(String[] fields, String[] values) {
        this.fields = fields;
        this.values = values;
    }

    public String[] getFields() {
        return fields;
    }

    public String[] getValues() {
        return values;
    }
}
