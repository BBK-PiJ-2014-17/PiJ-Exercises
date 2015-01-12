public interface User {

    /**
     * Name Getter
     * @return name
     */
    String getName();

    /**
     * ID Getter
     * @return id
     */
    int getId();

    /**
     * Set ID
     * Unique to each Library
     * @param id user ID
     */
    void setId(int id);

    /**
     * Register user with Library
     * @param l as Library
     * @return user ID of user at new Library
     */
    int register(Library l);

}