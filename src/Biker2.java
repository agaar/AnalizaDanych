/**
 * Created by User on 16/12/2016.
 */
public class Biker2 extends Biker {

    private String city;

    public Biker2(String id, String name, String age, String city) {
        super(id, name, age);
        this.city = city;
    }

    @Override
    public String toString() {
        return "[Id: " + id +
                ", Imię: " + name +
                ", Wiek: " + age +
                ", Miasto: " + city + "]";
    }
}
