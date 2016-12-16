/**
 * Created by User on 16/12/2016.
 */
public class Biker1 extends Biker {

    private String rekord;
    private int parent_id;


    public Biker1(String id, String name, String rekord, String age, String parent_id) {
        super(id, name, age);
        this.rekord = rekord;
        this.parent_id = Integer.parseInt(parent_id);
    }

    @Override
    public String toString() {
        return "[Id: " + id +
                ", Imię: " + name +
                ", Rekord: " + rekord +
                ", Wiek: " + age +
                ", Parent_id: " + parent_id + "]";
    }
}

