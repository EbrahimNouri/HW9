package menu;

public class Printer {


    public static void firstMenu() {
        System.out.println("""
                1. Patient login
                2. Admin login
                3. exit
                """);
    }

    public static void getMainMenu() {
        final String MAIN_MENU = """
                for exit enter 0 :D
                username and password:
                """;
        System.out.println(MAIN_MENU);
    }

    public static void adminMenuPrinter() {
        System.out.println("""
                1. show all prescription
                2. confirm prescription
                3. drug is exist
                4. prescription check confirm
                """);
    }
}
