public class uc4 {
    public static void main(String[] args) {

        String[] banner = new String[7];

        banner[0] = String.join(" ",
                " *****  ", " *****  ", " ****** ", " *****  ");
        banner[1] = String.join(" ",
                "*     * ", "*     * ", "*     * ", "*     * ");
        banner[2] = String.join(" ",
                "*     * ", "*     * ", "*     * ", "*       ");
        banner[3] = String.join(" ",
                "*     * ", "*     * ", " ****** ", " *****  ");
        banner[4] = String.join(" ",
                "*     * ", "*     * ", "*       ", "      * ");
        banner[5] = String.join(" ",
                "*     * ", "*     * ", "*       ", "*     * ");
        banner[6] = String.join(" ",
                " *****  ", " *****  ", "*       ", " *****  ");

        // Print banner using loop
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
            } 
        }
    }
