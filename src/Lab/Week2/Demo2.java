import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SubwaySurferGame {
    private int score;
    private int coins;
    private List<String> availableCharacters = new ArrayList<>() ;
    private int currentCharacterId;


    public SubwaySurferGame() {
        this.score = 0;
        this.coins = 0;
        this.availableCharacters.add("Jake");
        this.currentCharacterId = 0;
    }

    public void updateScore(int points) {
        this.score += points;
        System.out.println("Score updated! Current Score: " + this.score);
    }

    public void catchCoins(int numCoins) {
        this.coins += numCoins;
        System.out.println("Coins collected! Total Coins: " + this.coins);
    }

    public void displayDetails() {
        System.out.println("\nGame Details:");
        System.out.println("Score: " + this.score);
        System.out.println("Coins: " + this.coins);
        System.out.println("Available Characters: " + this.availableCharacters);
        System.out.println("Current Character: " + this.availableCharacters.get(currentCharacterId));
    }

    public void addNewCharacter(String character){
        availableCharacters.add(character);
        System.out.println("New Character Added: " + character);
    }

    public void changeCharacter(int newCharacterId){
        if(newCharacterId >= 0 && newCharacterId < availableCharacters.size()){
            this.currentCharacterId = newCharacterId;
            System.out.println("Character changed to: " + availableCharacters.get(currentCharacterId));
        } else {
            System.out.println("Invalid Character Id!!!");
        }
    }
}


public class Demo2 {
    public static void main(String[] args) {
        SubwaySurferGame game = new SubwaySurferGame();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Update Score\n2. Catch Coins\n3. Display Details\n4. Add New Character\n5. Change Character\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter points to add: ");
                    int points = sc.nextInt();
                    game.updateScore(points);
                    break;

                case 2:
                    System.out.print("Enter number of coins collected: ");
                    int coins = sc.nextInt();
                    game.catchCoins(coins);
                    break;

                case 3:
                    game.displayDetails();
                    break;

                case 4:
                    System.out.print("Enter new character name: ");
                    sc.nextLine();
                    String newCharacter = sc.nextLine();
                    game.addNewCharacter(newCharacter);
                    break;

                case 5:
                    System.out.println("Enter valid characterId: ");
                    int newCharacterId = sc.nextInt();
                    game.changeCharacter(newCharacterId);
                    break;

                case 6:
                    System.out.println("Exiting game...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
