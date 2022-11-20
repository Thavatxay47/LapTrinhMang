package file;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {
    public static ArrayList<Float> sort(String input) {
        StringTokenizer stringTokenizer = new StringTokenizer(input," ");
        float tong = 0;
        ArrayList<Float> arrayList = new ArrayList<Float>();
        while (stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            Float value = Float.parseFloat(token);
            arrayList.add(value);
            tong += value;
        }
        Collections.sort(arrayList);
        try {
            FileWriter output = new FileWriter("D:/java/LapTrinhMang/src/file/output.txt");
            output.write("Cac so: " + arrayList.toString().substring(1, arrayList.toString().length()-1) + "\n");
            output.write("Tong so: " + tong);
            System.out.println("Cac so: " + arrayList.toString().substring(1, arrayList.toString().length()-1));
            System.out.println("Tong so: " + tong);
            output.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return arrayList;
    }
    public static void main(String[]ags) throws IOException {
        String input = new String(Files.readAllBytes(Paths.get("D:/java/LapTrinhMang/src/file//input.txt")));
        sort(input);
    }
}