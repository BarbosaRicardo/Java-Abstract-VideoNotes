public class AlienPack
{
    private Alien[] aliens;

    /**
     * Constructor 
     * @return new aliens object
     */
    public AlienPack (int numAliens)
    {
        aliens = new Alien[numAliens];
    }

    /**
     * adds a new alien
     * @param newAlien
     * @param index
     */
    public void addAlien(Alien newAlien, int index)
    {
        aliens[index] = newAlien;
    }

    /**
     * acccessor 
     * @return aliens
     */
    public Alien[] getAliens()
    {
        return aliens;
    }
    
    public int calculateDamage()
    {
        int damage = 0;
        for (int i=0; i < aliens.length; i++)
        {
            damage += aliens[i].getDamage();
        }
        return damage;
    }
}