public class MarshmallowAlien extends Alien
{
    public SnakeAlien()
    {
        super();
    }

    public SnakeAlien(String name, int health)
    {
        super (health, name);
    }

    public int getDamage()
    {
        return 10;
    }   
}