import services.CoffeeService;
import services.CroissantService;

public class App {

    private CoffeeService coffeeService = new CoffeeService();
    private CroissantService croissantService = new CroissantService();
    private Console console = new Console();

    public static void main(String[] args) {
        App application = new App();
        application.init();

    }

    public void init(){
        console.printWelcome();
        console.printMainMenu();
    }
}
