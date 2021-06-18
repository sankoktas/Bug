public class BugTester 
{

    public static void main(String[] args) 
    {
        Bug bugsy = new Bug(10);
        bugsy.move();
        System.out.println(bugsy.getPosition());
        
        bugsy.turn();
        bugsy.move();
        System.out.println(bugsy.getPosition());
        
    }
}
