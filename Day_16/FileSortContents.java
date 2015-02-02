import java.io.*;
import java.util.ArrayList;

// sort not working!

public class FileSortContents {

    public static void main(String[] args) {

        FileSortContents fsc = new FileSortContents();
        fsc.launch(args);

    }

    private void launch(String[] inputs) {

        if (inputs.length != 1) {

            System.out.println("\nUsage: enter a file name\n");

        } else {

            String fromFileHandle = inputs[0];
            StringBuilder sb = new StringBuilder();

            File fromFile = new File(fromFileHandle);

            if (fromFile.exists() && fromFile.isFile()) {

                BufferedReader in = null, tmp = null;
                ArrayList<String> lines = new ArrayList<String>();
                //String[] lines;

                try {

                    in = new BufferedReader(new FileReader(fromFile));
                    tmp = new BufferedReader(new FileReader(fromFile));

                    int count = 0, scan = 0;
                    while (tmp.readLine() != null) count++;

                    //lines = new String[count];

                    String line;
                    while((line = in.readLine()) != null) {

                        //lines[scan] = line;
                        //scan++;
                        lines.add(line);

                    }

                    boolean sorted = false;
                    boolean flagged = false;

                    while(!sorted) {

                        System.out.println("\nCurrent array: " + toString(lines) + "\n");

                        for(int i = 0; i < count; i++) {

                            flagged = false;

                            String currentLine = lines.get(i);

                            for (int j = 0; j < count; j++) {

                                String comparisonLine = lines.get(j);

                                System.out.println(currentLine + " : " + comparisonLine);

                                int comp = currentLine.compareTo(comparisonLine);

                                if (comp > 0 && !flagged) {

                                    System.out.println("Swapping Up: " + comp);

                                    lines.remove(i);
                                    lines.add(j, currentLine);
                                    flagged = true;

                                }

                                if (!flagged)
                                    sorted = true;

                            }

                        }

                    }

                    for(String s : lines) {

                        sb.append(s);
                        sb.append("\n");

                    }

                    System.out.println("\n" + sb.toString());

                } catch (IOException ex) {

                    ex.printStackTrace();

                } finally {

                    try {
                        if (in != null) {
                            in.close();
                        }
                        if (tmp != null) {
                            tmp.close();
                        }
                    } catch (IOException ex) {

                        ex.printStackTrace();

                    }

                }

            } else {

                System.out.println("File does not exist");

            }

        }

    }

    public String toString(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i].toString());
            sb.append(", ");
        }

        if (sb.length() > 2) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    public String toString(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toString());
            sb.append(", ");
        }

        if (sb.length() > 2) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

}