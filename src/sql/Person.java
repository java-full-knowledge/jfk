package sql;

public class Person {
    public int personId;
    public String name;
    public String surname;
    public int age;
    public String City;

    public Person() {
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "{" +
                "userid=" + personId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", City='" + City + '\'' +
                '}';
    }
}
