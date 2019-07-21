import java.io.Console;

public class test11 {
    public static void main(String[] args)
    {
        Console cons = System.console();
        cons = System.console();
        if(cons != null){
            String username = cons.readLine("User name: ");
            char[] passwd = cons.readPassword("Password: ");
        }

    }
}
