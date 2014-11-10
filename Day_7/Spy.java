public class Spy {

    // class & instance variables

    private static int spyCount = 0;
    private int spyID;

    // constructor

    public Spy(int spyID) {

        spyCount++;
        this.spyID = spyID;

        System.out.println("Spy ID: " + this.spyID);
        System.out.println("Total # Spys: " + spyCount);

    }

    // main

    public static void main(String[] args) {

        // create spies

        Spy s1 = new Spy(4);
        Spy s2 = new Spy(10);
        Spy s3 = new Spy(25);
        Spy s4 = new Spy(19);
        Spy s5 = new Spy(2);
        Spy s6 = new Spy(34);

        // kill spies

        s2.die();
        s4.die();

    }

    // class methods

    public void die() {

        System.out.println("Spy " + this.spyID + " has been detected and eliminated");
        spyCount--;
        System.out.println("Total # Spys: " + spyCount);

    }


}