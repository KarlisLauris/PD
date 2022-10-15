package Exercise4;
import java.io.*;
import java.util.LinkedList;

public class Exercise4 {
    static  String path = "src\\main\\java\\Exercise4\\";
    static LinkedList<String> lines = new LinkedList<>();

    public static void read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path+"Exercise4.java"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                lines.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void write() {
        try {
            StringBuilder stringBuilder = new StringBuilder("Exercise4");
            stringBuilder.reverse();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path + stringBuilder.toString() + ".txt"));
            for (int i = lines.size() - 1; i >= 0; i--) {
                writer.write(lines.get(i));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        read();
        write();
    }
}
