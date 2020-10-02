public class Tests {

    public static void main(String[] args){

        //CREATE A CREATURE
        System.out.println();
        System.out.print("Should announce a creature: ");
        Creature a = new Creature("Hockey Player");
        System.out.println();

        //CHECK CREATURE'S HEALTH
        System.out.print("Health should be set to 100 by default: ");
        System.out.println(a.health() == 100);
        System.out.println();

        //CHECK CREATURE'S TREASURE
        System.out.print("Creature should have no default treasure: ");
        System.out.println(a.getTreasure() == null);
        System.out.println();

        //BUILD A TREASURE
        System.out.print("\nTreasure's name is Golden Hockeystick: ");
        Treasure gh = new Treasure("Golden Hockeystick");
        System.out.println(gh.title().equals("Golden Hockeystick"));
        System.out.println();
    }
    
}
