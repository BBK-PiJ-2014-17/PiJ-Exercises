public class PatientTest {

    public static void main(String[] args) {

        PatientTest pt = new PatientTest();
        pt.launch();

    }

    private void launch() {

        Patient p = new Patient("Basil", 140);

        System.out.println("Patient Name: " + p.getName());
        System.out.println("Patient Age: " + p.getAge());

    }

}