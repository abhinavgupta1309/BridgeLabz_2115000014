public class CompareStringBufferStringBuilder {
    public static void main(String[] args) {
        long startTime, endTime;

        StringBuffer sbf = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            sbf.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime));

        StringBuilder sbd = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            sbd.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime));
    }
}
