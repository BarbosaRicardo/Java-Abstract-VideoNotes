public class AlienTest
{
    private static final String THE_TOTAL_DAMAGE_FROM_THIE_PACK_IS = "The total damage from this pack is: ";

    public static void main(String[] args) {
        AlienPack pack = new AlienPack(4); // Pack of 4 aliens

        SnakeAlien snakey = new SnakeAlien(100, "Snakey");
        MarshmallowAlien softy = new MarshmallowAlien(10, "Softy");
        MarshmallowAlien lumpy = new MarshmallowAlien(20, "Lumpy");
        OgreAlien grog = new OgreAlien(75, "Grog");

        // add all four of these aliens to the pack
        pack.addAlien(snakey, 0);
        pack.addAlien(softy, 1);
        pack.addAlien(lumpy, 2);
        pack.addAlien(grog, 3);

        // Output info about the alien pack
        System.out.println("The aliens in this pack are: ");
        Alien[] alienArray = pack.getAliens();

        // lets use the for-each loop to iterate through the array of aliens
        for (Alien alien : alienArray) {
            System.out.println(" " + alien.getName() + " with a health of " + alien.getHealth());
        }
            // Output the total damage of the pack
            System.out.println(THE_TOTAL_DAMAGE_FROM_THIE_PACK_IS + pack.calculateDamage());
        
    }
}