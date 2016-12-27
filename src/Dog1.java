/**
 * Created by User on 16/12/2016.
 */
public class Dog1 extends Dog {
    private String owner;

    public Dog1(String id, String name , String age, String owner) {
        super(id, name, age);
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "[Id: " + id +
                ", Imię: " + name +
                ", Wiek: " + age +
                ", Właściciel: " + owner + "]";
    }
}
