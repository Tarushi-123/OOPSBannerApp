public class uc6 {

    static String[] getOPattern() {
        return new String[]{
            " ******** ",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            " ******** "
        };
    }

    static String[] getPPattern() {
        return new String[]{
            " ******  ",
            "*      * ",
            "*      * ",
            " ******  ",
            "*        ",
            "*        ",
            "*        "
        };
    }

    static String[] getSPattern() {
        return new String[]{
            " ******  ",
            "*      * ",
            "*        ",
            " ******  ",
            "       * ",
            "*      * ",
            " ******  "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

    
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

    
        for (String line : banner) {
            System.out.println(line);
        }
    }
}