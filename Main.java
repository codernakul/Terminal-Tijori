import java.util.*;
public class Main
{
    static String password="";
    static Scanner sc=new Scanner(System.in);
    static void splash()
    {
        System.out.println("      ___                        ___         ___           ___                 ");
        System.out.println("     /\\  \\          ___         /\\  \\       /\\  \\         /\\  \\          ___   ");
        System.out.println("     \\:\\  \\        /\\  \\        \\:\\  \\     /::\\  \\       /::\\  \\        /\\  \\  ");
        System.out.println("      \\:\\  \\       \\:\\  \\   ___ /::\\__\\   /:/\\:\\  \\     /:/\\:\\  \\       \\:\\  \\ ");
        System.out.println("      /::\\  \\      /::\\__\\ /\\  /:/\\/__/  /:/  \\:\\  \\   /::\\~\\:\\  \\      /::\\__\\");
        System.out.println("     /:/\\:\\__\\  __/:/\\/__/ \\:\\/:/  /    /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\  __/:/\\/__/");
        System.out.println("    /:/  \\/__/ /\\/:/  /     \\::/  /     \\:\\  \\ /:/  / \\/_|::\\/:/  / /\\/:/  /   ");
        System.out.println("   /:/  /      \\::/__/       \\/__/       \\:\\  /:/  /     |:|::/  /  \\::/__/    ");
        System.out.println("   \\/__/        \\:\\__\\                    \\:\\/:/  /      |:|\\/__/    \\:\\__\\    ");
        System.out.println("                 \\/__/                     \\::/  /       |:|  |       \\/__/    ");
        System.out.println("                                            \\/__/         \\|__|                ");
    }

    public static void main(String[] args)
    {
        String input;
        
        //System.out.println("``````````````````````````````````````````````````````````````````````");
        System.out.println("```````````````````````````````````````````````````````````````````````````````");
        System.out.println("[Tijori] Namaste!, Mr."+System.getProperty("user.name"));
        System.out.println("         Welcome to TerminalTijori a sub part of Tijori PasswordSuite.");
        System.out.println("```````````````````````````````````````````````````````````````````````````````");
        do
        {
            System.out.print("[Tijori] Enter length of password you want to generate: ");
            input=sc.nextLine();
            if(check(input))
                break;
            else
                System.out.println("[Tijori] Invalid Input! Try again.");
        }while(true);
        int length=Integer.parseInt(input);
        System.out.println("```````````````````````````````````````````````````````````````````````````````");

        System.out.println("[Tijori] Choose from the following types,");
        System.out.println("         (1)Alphanumeric Password - PasSw@rd#N!cE (Recommended)");
        System.out.println("         (2)Character Password    - PasSwOrd");
        System.out.println("         (3)Words Password        - thisispassword");
        System.out.println("         (4)Numeric Password      - 33011729");

        do
        {
            System.out.print("[Tijori] Your Choice: ");
            input=sc.nextLine();
            if(input.equals("1")||input.equals("2")||input.equals("3")||input.equals("4"))
                break;
            else
                System.out.println("         Invalid Input! Try again.");
        }while(true);
        System.out.println("```````````````````````````````````````````````````````````````````````````````");
        
        generate.pass(length,input);
        System.out.println(length+" "+input+" "+password);
        
        System.out.println("```````````````````````````````````````````````````````````````````````````````");
        splash();
    }

    static boolean check(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                return false;
            }	
        }
        return true;
    }
}