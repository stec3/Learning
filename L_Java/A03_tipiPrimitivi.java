public class A03_tipiPrimitivi {
    public static void main(String[] args) {

        short r = 20;
        int e = r;
        // casting (implicito): trasformare la variabile da un tipo ad un altro

        int t = 40;
        short w = (short) t;
        // casting esplicito, quando si cambia una variabile in una che può contenere valori più piccoli della precedente

        float tmp = 2.3f;
        double y = tmp;

        double i = 2.3;
        float q = (float) i;

    }
}