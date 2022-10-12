import java.util.ArrayList;
import java.util.List;

public class generics {
    public static void main(String[] args){
        List<? extends Integer> x = new ArrayList<Integer>();
        x.add(1);
        List<? super Integer> y = new ArrayList<Integer>();
        y.add(1);


    }
    
}


/*
listExtendsInteger_ListInteger.add(3);
error - can't add Integer to *possible* List<X> that is only allowed to hold X's
List<? extends Integer> listExtendsInteger_ListInteger = new ArrayList<Integer>();


 */