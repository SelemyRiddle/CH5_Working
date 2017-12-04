
public class Compare3
{
    public static Comparable largest(Comparable c1, Comparable c2){
        if(c1.compareTo(c2)>0){
            return c1;
        }
        else{
            return c2;
        }
    }
}
