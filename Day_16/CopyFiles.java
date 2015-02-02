import java.io.*;

public class CopyFiles {

    public static void main(String[] args) {

        CopyFiles cf = new CopyFiles();
        cf.launch(args);

    }

    private void launch(String[] files) {

        if (files.length != 2) {

            System.out.println("\nUsage: enter two file names\n");

        } else {

            String fromFileHandle = files[0];
            String toFileHandle = files[1];

            File fromFile = new File(fromFileHandle);
            File toFile = new File(toFileHandle);

            if (fromFile.exists() && fromFile.isFile()) {

                if (toFile.exists() && toFile.isFile()) {

                    String input;
                    System.out.println("File already exists, do you want to overwrite?");
                    input = System.console().readLine();

                    if (input == "y" || input == "Y" || input == "Yes") {

                        copyFiles(fromFile, toFile);

                    }

                }

                copyFiles(fromFile, toFile);

            }

        }

    }

    private void copyFiles(File from, File to) {

        BufferedReader in = null;
        PrintWriter out = null;

        try {

            in = new BufferedReader(new FileReader(from));
            out = new PrintWriter(to);

            String line;
            while((line = in.readLine()) != null) {

                out.println(line);

            }

        } catch (IOException ex) {

            ex.printStackTrace();

        } finally {

            out.flush();
            out.close();

            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}