public class OOPCode {

    private int[][] bild;
    private int oopcode = 0;
    public OOPCode(int[][] bild) {
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

    public int berechneOOPCode() {

        int fieldCounter = 1;
        for (int i = 0; i < bild.length; i++) {
            for (int j = 0; j < bild[i].length; j++) {
                if (bild[i][j] == 1) {
                    this.oopcode += Math.pow(2, (bild.length * bild.length)-fieldCounter);
                }
                fieldCounter++;
            }
        }
        return oopcode;
    }
}
