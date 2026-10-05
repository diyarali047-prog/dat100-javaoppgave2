package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {

        String tekst = "";

        for (int[] rad : matrise) {
            for (int i = 0; i < rad.length; i++) {
                tekst += rad[i];

                if (i < rad.length - 1) {
                    tekst += " ";
                }
            }

            tekst += "\n";
        }

        return tekst;
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        int[][] resultat = new int[matrise.length][];

        for (int i = 0; i < matrise.length; i++) {
            resultat[i] = new int[matrise[i].length];

            for (int j = 0; j < matrise[i].length; j++) {
                resultat[i][j] = matrise[i][j] * tall;
            }
        }

        return resultat;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i].length != b[i].length) {
                return false;
            }

            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        int n = matrise.length;
        int[][] resultat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultat[j][i] = matrise[i][j];
            }
        }

        return resultat;
    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        int[][] resultat = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {

                for (int k = 0; k < b.length; k++) {
                    resultat[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultat;
    }
}
