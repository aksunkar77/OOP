package pr5.io.app;

import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) { 
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
                for (String w : words) {
                    if (!w.isEmpty()) counts.put(w, counts.getOrDefault(w, 0) + 1); 
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("report.txt"))) {
            counts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> pw.println(e.getKey() + ": " + e.getValue())); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
