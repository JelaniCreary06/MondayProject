public class WordScramble {
    public static void main(String[] args) {
        System.out.println(hasPattern("TAN"));
        System.out.println(hasPattern("AARDVARK"));
        System.out.println(hasPattern("ABABAB"));
        System.out.println(hasPattern("BOZO"));

        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("ABABAB"));
        System.out.println(scrambleWord("BOZO"));
    }

    public static boolean hasPattern(String word) {
        word = word.toUpperCase();

        boolean pattern = false;

        for (int i = 0; !pattern && i < word.length(); i++) {
            char fc = word.charAt(i), sc = 'b';
            if ( i + 1 < word.length() ) sc = word.charAt(i + 1);

            if (sc != 'b' && (fc == 'A' && sc != 'A' )) pattern = true;
        }

        return pattern;
    }

    public static String scrambleWord(String word) {
        StringBuilder changeString = new StringBuilder(word.toUpperCase());

        for (int i = 0; i < word.length(); i++) {
            char fc = changeString.charAt(i), sc = 'b';

            if ( i+1 < changeString.length()) sc = changeString.charAt(i+1);

            if (( fc == 'A') && (sc != 'A' && sc != 'b')) {;
                changeString.setCharAt(i, sc); changeString.setCharAt(i+1, fc);;
            }

        }
        return changeString.toString();
    }
}
