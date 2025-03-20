package lab_10.webProject;

public class PersonFactory {
    public static Person createDefaultPerson() {
        Person person = new Person();
        person.setName("Asilbek Axmadjonov");
        person.setAge(19);
        person.setAddress("Yunosobod 14, Sevinch Street");
        return person;
    }
}
