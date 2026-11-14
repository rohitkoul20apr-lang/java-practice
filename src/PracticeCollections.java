import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PracticeCollections {

    public static void main(String[] args)
    {
        List<String> list= new ArrayList<>();
        list.add("Rohit");
        list.add("Raghav");
        list.add("Raman");

        ListIterator<String> itr = list.listIterator();

        while (itr.hasNext()) {

            String value = itr.next();

  if(value.equals("Raghav"))
{
   itr.add("Ronit");

}

}
        System.out.println(list);}}