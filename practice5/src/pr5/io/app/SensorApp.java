package pr5.io.app;

import java.io.*;

public class SensorApp {
    public static void main(String[] args) {
        String file = "sensor.bin";
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            for (int i = 0; i < 60; i++) dos.writeDouble(20.0 + i); 
            dos.close();

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.seek(29 * 8); 
            raf.writeDouble(999.9);
            raf.close();

            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            double max = 0, sum = 0;
            for (int i = 0; i < 60; i++) {
                double val = dis.readDouble();
                if (val > max) max = val;
                sum += val;
            }
            System.out.println("Average: " + (sum / 60));
            System.out.println("Max (Spike): " + max); 
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
