import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/degu/alpha.txt"));

        String line=reader.readLine();
        String[] splitted = line.split(",");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (String num : splitted){
            numbers.add(Integer.parseInt(num));
        }
        reader.close();
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

    }
}
