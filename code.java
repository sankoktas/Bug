public class Bug 
{
    private int pos;
    private int x = 1;

    public Bug(int pos)
    {
        this.pos = pos;
    }

    public void turn()
    {
        if(x == 1)
        {
            x = -1;
        } 
        else 
        {
            x = 1;
        }
    }

    public void move()
    {
        pos += x;
    }

    public int getPosition()
    {
        return pos;
    }  
}
