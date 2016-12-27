/**
 * Created by User on 16/12/2016.
 */
public class Biker1 extends Biker implements ParentIdInterface{

    private String rekord;
    private int parentId;

    public Biker1(String id, String name, String rekord, String age, String parentId) {
        super(id, name, age);
        this.rekord = rekord;
        this.parentId = Integer.parseInt(parentId);
    }

    @Override
    public String toString() {
        return "[Id: " + id +
                ", Imię: " + name +
                ", Rekord: " + rekord +
                ", Wiek: " + age +
                ", Parent_id: " + parentId + "]";
    }

    public int getParentId() {
        return parentId;
    }
}

