
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
        
    
    public static void main(String[] args) {
        
        ArrayList<DataRow> rows  = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get("literacy.csv"), "UTF-8")){
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                
                String[] data = row.split(",");
                String gender = data[2].split(" ")[1];
                String country = data[3];
                int year = Integer.valueOf(data[4]);
                float literacy = Float.valueOf(data[5]);
                
                
                DataRow dataRow = new DataRow(country, year, literacy, gender);
                rows.add(dataRow);
            }
        } catch( Exception e ){
            System.out.println(e);
        }
        
        rows.stream().sorted().forEach(d -> System.out.println(d));
    }
}
