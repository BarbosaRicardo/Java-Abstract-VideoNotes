public class OgreAlien extends Alien
{
    public OgreAlien()
    {
        super();
    }

    public OgreAlien(int health, String name)
    {
        super (health, name);
    }

    public int getDamage()
    {
        return 6;
    }   
}