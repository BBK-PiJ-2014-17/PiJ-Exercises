import java.io.File;

public class ListFiles {

    public static void main(String[] args) {

        ListFiles lf = new ListFiles();
        lf.launch();

    }

    private void launch() {

        String fileHandle = ".";
        File file = new File(fileHandle);

        String[] ls = file.list();

        for (String fh : ls) {

            File f = new File(fh);

            System.out.println(f.toString());

        }

    }

}