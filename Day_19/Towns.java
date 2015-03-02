import java.util.Arrays;
import java.util.List;

public class Towns {

    public static void main(String[] args) {

        List<String> towns = Arrays.asList("Chelmsford", "Canterbury", "Oxford",
                                            "Cambridge", "Norwich", "Exeter");

//        System.out.println("Found Exeter? " + foundTown(towns, "Exeter"));
//        System.out.println("Found Bath? " + foundTown(towns, "Bath"));

        System.out.println(towns.contains("Exeter"));
        System.out.println(towns.contains("Bath"));

//        System.out.println(towns);
    }

    static boolean foundTown(List<String> towns, String town) {

        boolean found = false;

        for(String t : towns) {
            if (t.equals(town)){
                found = true;
                break;
            }
        }

        return found;

    }

}