public class SnakeAlien extends Alien
{
    public SnakeAlien()
    {
        super();
    }

    public SnakeAlien(int health, String name)
    {
        super (health, name);
    }

    public int getDamage()
    {
        return 10;
    }   
}