import java.util.Hashtable;

public class LibraryImpl implements Library {

    String libraryName;
    int maxBooksPerUser;
    Hashtable<String, Integer> users;
    int userCount;

    public String getLibraryName() {
        return this.libraryName;
    }

    public int getMaxBooksPerUser() {
        return this.maxBooksPerUser;
    }

    public void setMaxBooksPerUser(int maxBooksPerUser) {
        this.maxBooksPerUser = maxBooksPerUser;
    }

    public LibraryImpl(String libraryName) {
        this.libraryName = libraryName;
        userCount = 0;
        maxBooksPerUser = 3;
        users = new Hashtable();
    }

    public int register(User u) {

        userCount++;
        users.put(u.getName(),userCount);
        return userCount;
    }

    public int getId(User u) {

        Integer id = users.get(u.getName());

        if (id != null) {
            return id;
        } else {
            return register(u);
        }

    }

}