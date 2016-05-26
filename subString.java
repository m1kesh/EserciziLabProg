/*
    Scrivere un metodo che date due stringhe s1, s2 ed un intero k, restituisce true se
    nella sottostringa s1 esistono almeno k sottostringhe di s2.

*/

public class Main {

    public static void main(String[] args) {
        String s1 = "aabbbbccdaabbbc";
        String s2 = "bb";
        int k = 4;

        System.out.println(sottoStr(s1, s2, k));

    }

    public static boolean sottoStr(String s1, String s2, int k) {

        int c = 0, s3 = s2.length();

        if (k <= 0) {
            return false;
        }

        for (int i = 0; i < s1.length()-s3; i++) {
            if (s2.equals(s1.substring(i, i+s3))) {
                c++;
            }
            if (c == k) {
                return true;
            }
        }
        return false;
    }
}
