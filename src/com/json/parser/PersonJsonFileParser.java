package com.json.parser;

import com.json.jsonobject.Gender;
import com.json.jsonobject.Person;
import com.json.validator.ValidationService;
import com.json.validator.ValidationStrategy;

public class PersonJsonFileParser implements Parser<Person> {

    private final String content;
    private String[] personFields;
    private ValidationStrategy<PersonFields, Boolean>[] strategies;
    private ValidationService validationService = new PersonContentValidationService();

    public PersonJsonFileParser(String content) {
        this.content = content;
        this.personFields = content.split(",");
        strategies = new ValidationStrategy[2];
        this.strategies[0] = new NameFieldRequiredValidationStrategy();
        this.strategies[1] = new PersonFieldsCountValidationStrategy();

    }

    @Override
    public Person parse() {
//        Validation[] validate = validationService.validate(this.strategies);
//        for (ValidationStrategy strategy : this.strategies) {
//        }

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
