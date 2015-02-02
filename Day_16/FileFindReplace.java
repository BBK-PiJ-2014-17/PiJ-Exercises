import java.io.*;

public class FileFindReplace {

    public static void main(String[] args) {

        FileFindReplace ffr = new FileFindReplace();
        ffr.launch(args);

    }

    private void launch(String[] inputs) {

        if (inputs.length != 3) {

            System.out.println("\nUsage: enter a file name and two strings\n");

        } else {

            String fromFileHandle = inputs[0];
            String find = inputs[1];
            String replace = inputs[2];
            StringBuilder sb = new StringBuilder();

            File fromFile = new File(fromFileHandle);

            if (fromFile.exists() && fromFile.isFile()) {

                BufferedReader in = null;

                try {

                    in = new BufferedReader(new FileReader(fromFile));

                    String line;
                    while((line = in.readLine()) != null) {

                        String newLine = line.replaceAll(find, replace);
                        sb.append(newLine);
                        sb.append("\n");

                    }

                } catch (IOException ex) {

                    ex.printStackTrace();

                } finally {

                    try {
                        if (in != null) {
                            in.close();
                        }
                    } catch (IOException ex) {

                        ex.printStackTrace();

                    }

                }

            } else {

                System.out.println("File does not exist");

            }

            System.out.println(sb.toString());

        }

    }


}