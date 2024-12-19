public class RoleCard {
    boolean isVisible;
    String role;
    String goal;

    public RoleCard(boolean visible, String role) {
        this.isVisible = visible;
        this.role = role;
        if (role.equals("Sheriff")) {
            this.goal = "must eliminate all the Outlaws and the " +
                "Renegade, to\n\tprotect law and order. ";
        }
        else if (role.equals("Deputy")) {
            this.goal = "must help and protect the Sheriff, and share " +
                "his same\n\tgoal, at all costs!";
        }
        else if (role.equals("Outlaw")) {
            this.goal = "would like to kill the Sheriff, but they have " +
                "no scruples\n\tabout eliminating each other to gain rewards!";
        }
        else {
            this.role = "Renegade";
            this.goal = "wants to be the new Sheriff; his goal is to " +
                "be the\n\tlast character in play.";
        }
    }

    @Override
    public String toString() {
        return "The " + this.role + " " + this.goal;
    }

}
