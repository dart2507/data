
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "log.txt";

        int error = 0;
        int warning = 0;
        int info = 0;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            boolean empty = true;

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                empty = false;

                if (line.contains("[ERROR]")) {
                    error++;
                } else if (line.contains("[WARNING]")) {
                    warning++;
                } else if (line.contains("[INFO]")) {
                    info++;
                }
            }

            br.close();

            if (empty) {
                System.out.println("Error: Log file not found.");
            } else {
                System.out.println("Total ERROR entries: " + error);
                System.out.println("Total WARNING entries: " + warning);
                System.out.println("Total INFO entries: " + info);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Log file not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read log file.");
        }
    }
}
