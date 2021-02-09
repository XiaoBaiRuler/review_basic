package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author xiaobai
 * @Date 2021/2/9 12:05
 * @Version 1.0
 */
public class TestRegex {

    private static Pattern pattern = Pattern.compile("xiaobai");
    private static Pattern p = Pattern.compile("(\\s?)(\\d*)(.*)");

    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("xiaobai");
        if (matcher.matches()){
            System.out.println("??");
        }
        Matcher m = p.matcher("1234abc\n");
        if (m.find()){
            for (int i = 0; i < m.groupCount(); i++) {
                System.out.println(m.group(i));
            }
        }
        System.out.println(m.replaceAll("123"));
    }
}
