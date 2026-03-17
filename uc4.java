public class uc4 {

    public static void main(String[] args) {

        // Each letter (O, O, P, S) is defined as a 7-element String array
        String[] letterO = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] letterP = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] letterS = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        // Combine all letters into banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = letterO[i] + "  " + letterO[i] + "  " + letterP[i] + "  " + letterS[i];
        }

        // Print banner
        System.out.println("\n===== OOPS BANNER =====\n");

        for (String line : banner) {
            System.out.println(line);
        }

        System.out.println("\n=======================\n");
    }
}