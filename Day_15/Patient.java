public class Patient {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * Patient class constructor
     * @param name of patient
     * @param yearOfBirth patient was born
     * @throws IllegalArguementException if age out of bounds 0 - 130
     */
    public Patient(String name, int yearOfBirth) throws IllegalArgumentException {

        age = 2015 - yearOfBirth;

        if (age > 130 || age < 0) {
            throw new IllegalArgumentException("Not a real age!");
        } else {
            this.name = name;
            this.age = age;
        }

    }

}