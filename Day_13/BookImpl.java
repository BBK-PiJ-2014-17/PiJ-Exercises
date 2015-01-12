public class BookImpl implements Book {

    private String author;
    private String title;

    /**
     * Author Getter
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Title Getter
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Book Constructor
     * @param author
     * @param title
     */
    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }

}