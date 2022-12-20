public class OOPCode {


    // Instanzvariablen
    private final int[][] bild;

    // Konstruktor
    public OOPCode(int[][] b) {
        // prüft, ob das übergebene Array leer ist
        if (b.length == 0) {
            System.out.println("Leeres Bild übergeben!");
            System.exit(0);
        }

        for (int i = 0; i < b.length; i++) {
            // prüft, ob das Bild im NxN Format ist
            if (b[i].length != b.length) {
                System.out.println("Kein NxN Format!");
                System.exit(0);
            }
            // prüft, ob das Bild nur 0 oder 1 enthält
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] != 0 && b[i][j] != 1) {
                    System.out.println("Bild darf nur {0,1} enthalten!");
                    System.exit(0);
                }
            }
        }

        // setzt die Bildwerte
        this.bild = b;
    }


    // Methode berechnet den aktuellen OOPCode
    public int berechneOOPCode() {
        int fieldCounter = 1;
        int oopCode = 0;
        for (int i = 0; i < bild.length; i++) {
            for (int j = 0; j < bild[i].length; j++) {
                // prüft, welche Werte schwarz bzw. 1 sind
                if (bild[i][j] == 1) {
                    // addiert den Wert des Feldes zum OOPCode
                    oopCode += Math.pow(2, (bild.length * bild.length)-fieldCounter);
                }
                fieldCounter++;
            }
        }
        // gibt den berechneten OOPCode zurück
        return oopCode;
    }


    // Methode gibt das aktuelle Bild auf der Konsole aus
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


    // Methode dreht das aktuelle Bild um 90 Grad
    public void bildDrehen() {
        // speichert die Bildlänge
        int n = bild.length;

        // dreht die Werte im bild-Array um 90 Grad
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = bild[i][j];
                bild[i][j] = bild[j][i];
                bild[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = bild[i][j];
                bild[i][j] = bild[i][n - 1 - j];
                bild[i][n - 1 - j] = temp;
            }
        }
    }

    // Methode berechnet den größten OOPCode
    public void getBiggestOOPCode() {

        int biggestOOPCode = berechneOOPCode();
        int aktOOPCode;
        int rotationen = 0;

        // dreht das Bild um 360 Grad und speichert den größten OOPCode sowie die Rotationen
        for (int i = 0; i < bild.length; i++) {
            aktOOPCode = berechneOOPCode();
            if (aktOOPCode > biggestOOPCode) {
                biggestOOPCode = aktOOPCode;
                rotationen++;
            }
            bildDrehen();
        }

        // dreht das Bild um die benötigten Rotationen, um das Bild des größten OOPCodes auszugeben
        for (int i = 0; i < rotationen; i++) {
            bildDrehen();
        }

        // gibt die Daten des größten OOPCodes aus
        System.out.println("Größte OOPCode Bild:");
        printBild();
        System.out.println("Größte OOPCode: " + biggestOOPCode);
        System.out.println("Rotationen: " + rotationen);

    }


}
