//package JSONPARSING.Parser;
//
//public class PersonJsonFileParser implements Parser<Person> {
//    private final String content;
//    private final String[] personfields;
//
//    public PersonJsonFileParser(String content) {
//        this.content = content;
//        this.personfields=content.split(",");
//
//    }
//
//    @Override
//    public Person parse() {
//        //implement here person specific json validation
//
//        String personName = this.selector("name");
//        String age = this.selector("age");
//        String gender = this.selector("gender");
//
//        return new Person(personName, Integer.parseInt(age), Gender.find(gender));
//    }
//
//    private String selector(String attribute) {
//        for (String personField : this.personFields) {
//            if (personField.contains(attribute)) {
//                return personField.split(":")[1]
//                        .replace("{", "")
//                        .replace("}", "")
//                        .replace("\"", "")
//                        .trim();
//            }
//        }
//        return "";
//    }
//
//}