public class OOPCode {

    private int[][] bild;
    private int oopcode = 0;

    public OOPCode(int[][] bild) {

        if (bild.length == 0) {
            System.out.println("Leeres Bild übergeben!");
            System.exit(0);
        }

        for (int i = 0; i < bild.length; i++) {
            if (bild[i].length != bild.length) {
                System.out.println("Kein NxN Format!");
                System.exit(0);
            }
            for (int j = 0; j < bild[i].length; j++) {
                if (bild[i][j] != 0 && bild[i][j] != 1) {
                    System.out.println("Bild darf nur {0,1} enthalten!");
                    System.exit(0);
                }
            }
        }
        this.bild = bild;
    }

    public void berechneOOPCode() {
        int fieldCounter = 1;
        for (int i = 0; i < bild.length; i++) {
            for (int j = 0; j < bild[i].length; j++) {
                if (bild[i][j] == 1) {
                    this.oopcode += Math.pow(2, (bild.length * bild.length)-fieldCounter);
                }
                fieldCounter++;
            }
        }
        System.out.println("OOPCode = " + this.oopcode);
        oopcode = 0;
    }

    public void printBild() {
        for (int i = 0; i < bild.length; i++) {
            for (int j = 0; j < bild[i].length; j++) {
                if (j == (bild[i].length)-1) {
                    System.out.print(bild[i][j]);
                }
                else {
                    System.out.print(bild[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    public void bildDrehen() {
        int n = bild.length;


        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = bild[i][j];
                bild[i][j] = bild[j][i];
                bild[j][i] = temp;
            }
        }
        // Reihenfolge der Zeilen vertauschen
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = bild[i][j];
                bild[i][j] = bild[i][n - 1 - j];
                bild[i][n - 1 - j] = temp;
            }
        }
    }


}
