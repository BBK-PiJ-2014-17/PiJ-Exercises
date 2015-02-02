import java.io.File;

public class MakeDirectory {

    public static void main(String[] args) {

        MakeDirectory md = new MakeDirectory();
        md.launch(args);

    }

    private void launch(String[] directories) {

        for(String s : directories) {

            File file = new File(s);
            file.mkdir();

        }

    }

}