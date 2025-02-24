import java.io.*;
import java.util.*;
class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        new Thread(() -> {
            try {
                pos.write("Hello from writer".getBytes());
            } catch (IOException e) {}
        }).start();
        new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {}
        }).start();
    }
}
