import java.util.Scanner;

public class Console {

    Scanner input = new Scanner(System.in);

    public void printWelcome(){
        System.out.println("" +
                "************************************** \n" +
                "***             Welcome            *** \n" +
                "***             to the             *** \n" +
                "***    ZipCode Inventory Manager   *** \n" +
                "************************************** \n");
    }

    public String printMainMenu(){
        return getStringInput("Please choose from the following options:\n" +
                "1. Create product to add to inventory \n" +
                "2. Read from existing products \n" +
                "3. Update products \n" +
                "4. Delete products \n" +
                "5. Get reports \n" +
                "6. Exit");
    }

    public String getStringInput(String prompt){
        System.out.println(prompt);
        return input.nextLine();
    }
}
