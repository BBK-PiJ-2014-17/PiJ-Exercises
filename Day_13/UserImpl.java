public class UserImpl implements User {

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
        this.name = name;
    }

}