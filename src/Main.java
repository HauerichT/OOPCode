public class Main {
    public static void main(String[] args) {

        int[][] bild = {{1,0,0}, {0,1,0}, {0,0,1}};
        OOPCode oopCode = new OOPCode(bild);
        System.out.println(oopCode.berechneOOPCode());

    }
}