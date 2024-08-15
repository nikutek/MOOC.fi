
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        System.out.println("File: ");
        String file = scan.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Team: ");
        String team = scan.nextLine();
        int numberOfGames = 0;
        int numberOfWins = 0;
        int numberOfLosses = 0;
        
        for (Game game : games) {
            if (game.getTeams().contains(team)) {
                numberOfGames++;
                if (game.getWinner().equals(team)){
                    numberOfWins++;
                } else if (game.getWinner().equals("Draw")){
                    return;
                } else {
                    numberOfLosses++;
                }
            }
        }
        System.out.println("Games: "+numberOfGames );
        System.out.println("Wins: "+numberOfWins);
        System.out.println("Losses: "+numberOfLosses);
    }

}
