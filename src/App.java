
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n");
        
        // Greet user

        // Instantiate your objects
        // Create our role cards
        RoleCard sheriff = new RoleCard(true, "Sheriff");
        RoleCard outlaw1 = new RoleCard(false, "Outlaw");
        RoleCard deputy = new RoleCard(false, "Deputy");
        RoleCard renegade = new RoleCard(false, "Renegade");

        // Create a character card
        String description =  "each time he is required to \"draw!\"" +
            ", he flips the top two\n\tcards from the deck, and chooses" +
            " the result he prefers. Discard both\n\tcards afterwards.";
        CharacterCard luckyDuke = new CharacterCard(
            "Lucky Duck", 4, description);

        // Print your objects
        System.out.println("The four main types of role cards are:");
        System.out.println(sheriff);
        System.out.println(outlaw1);
        System.out.println(deputy);
        System.out.println(renegade);
        System.out.println();
        System.out.println("Character Cards");
        System.out.println(luckyDuke);
    }
}
