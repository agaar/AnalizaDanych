/**
 * Created by User on 13/12/2016.
 */
public class Person implements MarkerInterface{
    private int id;
    private String name;
    private String surname;
    private int age;
    private String city;
    private int parent_id;

    public Person(String id, String name, String surname, String age, String city, String parent_id) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.surname = surname;
        this.age = Integer.parseInt(age);
        this.city = city;
        this.parent_id = Integer.parseInt(parent_id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "[Id: " + id +
                ", Imię: " + name +
                ", Nazwisko: " + surname +
                ", Wiek: " + age +
                ", Miasto: " + city + "]";
    }
}
