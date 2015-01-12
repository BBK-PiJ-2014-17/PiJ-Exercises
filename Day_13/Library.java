public interface Library {

    /**
     * Get Library name
     * @return name
     */
    String getLibraryName();

    /**
     * Get maximum books allowed per user
     * @return maxBooks
     */
    int getMaxBooksPerUser();

    /**
     * Set maximum books allowed per user
     * @param maxBooksPerUser as maximum books
     */
    void setMaxBooksPerUser(int maxBooksPerUser);

    /**
     * Register user with Library
     * @param u user name
     * @return id for new user
     */
    int register(User u);

    /**
     * Get unique user ID for user name
     * @param u as username
     * @return user unique ID
     */
    int getId(User u);

}