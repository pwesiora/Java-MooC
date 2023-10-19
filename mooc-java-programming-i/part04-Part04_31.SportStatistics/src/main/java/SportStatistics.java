
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File: ");
        String file = scanner.nextLine();
        System.out.print("Team: ");
        String team = scanner.nextLine();
        int count = 0, wins = 0, losses = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                if (team.equals(team1) ){
                    count = count + 1;      
                    if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                        wins = wins+1;
                    } else if (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])){
                        losses = losses + 1;
                    }
                }
                 if (team.equals(team2) ){
                    count = count + 1; 
                    if(Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                        wins = wins+1;
                    } else if (Integer.valueOf(parts[3]) < Integer.valueOf(parts[2])){
                        losses = losses + 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}