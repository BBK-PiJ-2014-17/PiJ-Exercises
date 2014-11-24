public interface IntSet {

    /**
     * adds a new int to the set; if it is there already, nothing happens
     */
    void add(int element);

    /**
     * returns true if the number is in the set, false otherwise
     */
    boolean contains(int key);

    /**
     * returns the same values as the former method, but for every element
     * this is checked prints its value on screen
     */
    boolean containsVerbose(int key);

    /**
     * returns a string with the values of the elements in the set separated
     * by commas
     */
    String toString();

}