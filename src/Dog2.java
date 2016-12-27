/**
 * Created by User on 16/12/2016.
 */
public class Dog2 extends Dog implements ParentIdInterface{
    private char vaccine;
    private int parentId = 0;

    public int getParentId() {
        return parentId;
    }

    public Dog2(String id, String name, String age, String vaccine, String parentId) {
        super(id, name, age);
        this.vaccine = vaccine.charAt(0);
        this.parentId = Integer.parseInt(parentId);
    }

    @Override
    public String toString() {
        return "[Id: " + id +
                ", Imię: " + name +
                ", Wiek: " + age +
                ", Szczepienia: " + vaccine + "]";
    }
}

