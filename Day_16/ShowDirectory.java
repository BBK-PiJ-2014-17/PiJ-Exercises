import java.io.File;

public class ShowDirectory {

    public static void main(String[] args) {

        ShowDirectory sd = new ShowDirectory();
        sd.launch(args);

    }

    private void launch(String[] directories){

        if (directories.length == 0) {

            System.out.println("\nUsage: enter a directory\n");

        } else {

            for(String s : directories) {

                File file = new File(s);

                if (file.exists()) {

                    System.out.println("\nContents of " + s + ":\n");

                    String[] ls = file.list();

                    for (String fh : ls) {

                        File f = new File(fh);
                        System.out.println(f.toString());

                    }

                } else {

                    System.out.println("\nDirectory does not exist!\n");

                }

            }

        }

    }

}