/**
 * Created by User on 16/12/2016.
 */
public class Dog2 extends Dog {
    private char vaccine = '?';
    private int parent_id = 0;


    public Dog2(String id, String name, String age, String vaccine, String parent_id) {
        super(id, name, age);
        this.vaccine = vaccine.charAt(0);
        this.parent_id = Integer.parseInt(parent_id);
    }

    @Override
    public String toString() {
        return "[Id: " + id +
                ", Imię: " + name +
                ", Wiek: " + age +
                ", Szczepienia: " + vaccine + "]";
    }
}

