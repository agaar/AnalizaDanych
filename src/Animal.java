/**
 * Created by User on 13/12/2016.
 */
public class Animal implements MarkerInterface {
    private int id;
    private String name;
    private int age;
    private char vaccine = '?';
    private int parent_id = 0;
    private String owner = "Unknown";

    public Animal(String id, String name, String age, String vaccine, String parent_id) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.age = Integer.parseInt(age);
        this.vaccine = vaccine.charAt(0);
        this.parent_id = Integer.parseInt(parent_id);
    }
    public Animal(String id, String name ,String age, String owner) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.age = Integer.parseInt(age);
        this.owner = owner;
    }

    @Override
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
        return "[Id: " + id +
                ", Imię: " + name +
                ", Wiek: " + age +
                ", Szczepienia: " + vaccine +
                ", Właściciel: " + owner + "]";
    }
}
