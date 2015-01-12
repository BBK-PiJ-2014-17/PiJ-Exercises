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

}