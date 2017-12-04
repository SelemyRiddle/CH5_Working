import java.util.Scanner;
public class LargestDriver
{
    public static Scanner scan = new Scanner(System.in);
   
    public static void test()
    {
        boolean again = true;
       
        while (again) {
        System.out.println("Enter two strings for comparison: ");
        System.out.println("String #1: ");
        String s1 = scan.next();
       
        System.out.println("String #2: ");
        String s2 = scan.next();
        System.out.println("___________________________________________________");
        System.out.println("Result using the Compare1 class: " + Compare1.largest(s1, s2) + " lexiographically follows when comparing " + s1 + " and " + s2);
        System.out.println("Result using the Compare3 class: " + Compare3.largest(s1, s2) + " lexiographically follows when comparing " + s1 + " and " + s2);
       
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println("Enter two Integers for comparison: ");
        System.out.println("Integer #1: ");
        Integer i1 = new Integer(scan.nextInt());
       
        System.out.println("Integer #2: ");
        Integer i2 = new Integer(scan.nextInt());
        System.out.println();
        System.out.println("Result using the Compare2 class: " + Compare2.largest(i1, i2) + " is the larger of " + i1 + " and " + i2);
        System.out.println("Result using the Compare3 class: " + Compare3.largest(i1, i2) + " is the larger of " + i1 + " and " + i2);
        System.out.println();
        System.out.println("Continue?  Y/N");
        if (!scan.next().equals("Y")) {again = false;}
        System.out.println("___________________________________________________");
        System.out.println();
       }
       System.out.println();
       System.out.println("Goodbye...");
       
    }
}
