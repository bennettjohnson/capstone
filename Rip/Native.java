
/**
 * Write a description of class Native here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Native
{
    static{
        System.loadLibrary("cinput");
    }
    public native void helloWorld();
    public static void main(String[] args)
    {
        new Native().helloWorld();
    }
}
