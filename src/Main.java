public class Main {
    public static void main(String[] args) {

        int[][] bild = {{0,0,0,1}, {0,1,1,0}, {0,0,1,1}, {0,0,1,1}};
        OOPCode oopCode = new OOPCode(bild);
        oopCode.printBild();
        oopCode.berechneOOPCode();

        System.out.println();

        oopCode.bildDrehen();
        oopCode.printBild();
        oopCode.berechneOOPCode();

        System.out.println();

        oopCode.bildDrehen();
        oopCode.printBild();
        oopCode.berechneOOPCode();

        System.out.println();

        oopCode.bildDrehen();
        oopCode.printBild();
        oopCode.berechneOOPCode();

    }
}