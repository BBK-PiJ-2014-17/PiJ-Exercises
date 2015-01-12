import java.util.List;
import java.util.LinkedList;

public class UserImpl implements User {

    private List<Library> libraryList;
    private String name;
    private int id;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public UserImpl(String name) {
        libraryList = new LinkedList<Library>();
        this.name = name;
    }

    public int register(Library l) {

        libraryList.add(l);
        return l.register(this);
    }

}