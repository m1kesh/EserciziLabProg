/*
    Scrivere un metodo che, dati due array monodimensionali a, b, ed un intero k che
    restituisce true, se tutti gli elementi di a compaiono almeno k volte in b, altrimenti
    restituisce false.

*/

public class Main {

    public static void main(String[] args) {

	    int []a = {2, 3, 5};
        int []b = {5, 2, 5, 2, 3, 3};
        int k = 2;

        System.out.print(elementiArray(a, b, k));

    }
    public static boolean elementiArray (int []a, int []b, int k) {

        int trovato = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    trovato++;
                    if (trovato == k)
                        i++;
                }
            }
            if (trovato / a.length == k) return true;
        }
        return false;
    }
}
