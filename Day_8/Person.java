public class Person {
    String firstName;
    String secondName;
    int age;
    Person next;

    public Person (String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.next = null;
    }

    public Person getNext() {
        return this.next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public String toString() {
        return firstName + " " + secondName + ", " + age;
    }

}