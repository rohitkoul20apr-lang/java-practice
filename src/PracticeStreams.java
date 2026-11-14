import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeStreams {

    public static void main(String[] args)
    {


        String s="programming";

        Character map=
        s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(ch-> ch, LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(entry-> entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(map);















    }

}
