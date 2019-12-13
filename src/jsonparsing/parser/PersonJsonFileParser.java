package jsonparsing.parser;

import jsonparsing.jsonobject.Gender;
import jsonparsing.jsonobject.Person;

public class PersonJsonFileParser implements Parser<Person> {

    private final String jsonfile;
    private String[] personFields;

    public PersonJsonFileParser(String jsonfile) {
        this.jsonfile = jsonfile;
        personFields=jsonfile.split(",");
    }

    @Override
    public Person parse() {


        String personName = this.selector("name");
        String age = this.selector("age");
        String gender = this.selector("gender");

        return new Person(personName, Integer.parseInt(age), Gender.find(gender));
    }

    private String selector(String attribute) {
        for (String personField : this.personFields) {
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
