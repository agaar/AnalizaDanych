/**
 * Created by User on 14/12/2016.
 */
public class Biker implements MarkerInterface {
    private int id;
    private String name;
    private int age;
    private String rekord = "?";
    private int parent_id = 0;
    private String city = "?";

    public Biker(String id, String name, String rekord, String age, String parent_id) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.rekord = rekord;
        this.age = Integer.parseInt(age);
        this.parent_id = Integer.parseInt(parent_id);
    }
    public Biker(String id, String name, String age, String city) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.age = Integer.parseInt(age);
        this.city = city;
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
                ", Rekord: " + rekord +
                ", Wiek: " + age +
                ", Miasto: " + city + "]";
    }
}
