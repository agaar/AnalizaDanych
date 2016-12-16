/**
 * Created by User on 13/12/2016.
 */
public class Dog implements MarkerInterface {
    int id;
    String name;
    int age;


    public Dog(String id, String name, String age) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.age = Integer.parseInt(age);

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
}
