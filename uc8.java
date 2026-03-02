import java.util.HashMap;
import java.util.Map;

public class uc8 {

    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();


        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            " ******",
            "*     *",
            "*     *",
            " ******",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ******"
        });

        map.put(' ', new String[]{
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        });

        return map;
    }

    public static void printBanner(String message, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = createCharacterPatterns();

        printBanner("OOPS", patterns);
    }
}