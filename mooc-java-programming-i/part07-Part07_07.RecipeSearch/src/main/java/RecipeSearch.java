
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        RecipeManager recipeManager = new RecipeManager();
        recipeManager.readRecipe(fileName);
        while (true) {
            System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
            System.out.print("Enter command: ");
            String userCommand = scanner.nextLine();
            
            switch (userCommand) {
                case "list":
                    recipeManager.listRecipes();
                    break;
                case "find name": 
                    System.out.print("Searched word: ");
                    String nameToSearch = scanner.nextLine();
                    recipeManager.printNames(nameToSearch);
                    System.out.println("");
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int maxCookingTime = scanner.nextInt();
                    recipeManager.printCookingTime(maxCookingTime);
                    System.out.println("");
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    recipeManager.printIngredients(ingredient);
                    System.out.println("");
                    break;
                case "stop":
                    return;
            }
        }
    }  
}

