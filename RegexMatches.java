import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String args[] ){
        Pattern p = Pattern.compile(".m");
        Matcher m = p.matcher(".am");
        Boolean b = m.matches();

        System.out.println(b);
    }
}
