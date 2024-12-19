public class CharacterCard {
    String name;
    int lifePoints;
    String specialAction;

    public CharacterCard(String name, int lifePoints, String specialAction) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.specialAction = specialAction;
    }

    @Override
    public String toString() {
        String output = "Name: " + this.name + "\nLife Points: " + this.lifePoints;
        output += "\nSpecial Action: " + this.specialAction;
        return output;
    }
}
