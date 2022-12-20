public class OOPCodeTest {
    public static void main(String[] args) {

        // N=4
        int[][] bild4 = {{0,0,0,0}, {1,0,1,0}, {0,1,0,1}, {0,0,0,1}};
        OOPCode oopCode4 = new OOPCode(bild4);
        oopCode4.getBiggestOOPCode();

        System.out.println("\n-----------\n");

        // N=3
        int[][] bild3 = {{0,0,0}, {0,1,0}, {0,0,1}};
        OOPCode oopCode3 = new OOPCode(bild3);
        oopCode3.getBiggestOOPCode();

    }
}