package com.json;

import com.json.jsonobject.Person;
import com.json.parser.Parser;
import com.json.parser.PersonJsonFileParser;
import com.json.validator.JsonContentValidator;
import com.json.validator.JsonValidator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JsonApplication {


    public static void main(String[] args) throws IOException {
        File personJson = new File("C:\\Users\\User\\IdeaProjects\\jfk\\src\\com\\json\\person.json");
        FileInputStream inputStream = new FileInputStream(personJson);
        byte[] bytes = inputStream.readAllBytes();
        String content = new String(bytes);
        JsonValidator validator = new JsonContentValidator();
        validator.validate(content);
        Parser<Person> parser = new PersonJsonFileParser(content);
        Person person = parser.parse();
        System.out.println(person);
    }
}
