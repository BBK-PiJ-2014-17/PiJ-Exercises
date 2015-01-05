public class Person {

    private String firstName;
    private String secondName;

    public Person() {

    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getName() {
        return firstName + " " + secondName;
    }

    public static String getInitials(String fullName) {

        if (fullName == null) {
            return null;
        } else {
            String result = "";
            String[] words = fullName.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 0){
                    String nextInitial = "" + words[i].charAt(0);
                    result = result + nextInitial.toUpperCase();
                }
            }
            return result;
        }

    }
}