package Course2_Module9;

public class MCQ4 {
    public static void main (String args[]) {
        Scientist[] team = new Scientist[2];
        team[0] = new Godel();
        team[1] = new Tesla();

        System.out.println("Scientist list");
        for(Scientist scientist : team){
            scientist.printTheory();
        }
    }
}

class Scientist {
    private String theory = "Science";
    public void printTheory() {
        System.out.println(theory);
    }
}

class Godel extends Scientist {
    private String theory = "Mathematics";
    public void printTheory() {
        System.out.println(theory);
    }
}


class Tesla extends Scientist {
    private String theory = "Physics";
    public void printTheory() {

        System.out.println(theory);
    }
}

