package pr5.io.app;

import java.io.*;
import java.util.*;

public class MathParser {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("math.txt"));
             PrintWriter resWriter = new PrintWriter(new FileWriter("results.txt"));
             PrintWriter logWriter = new PrintWriter(new FileWriter("log.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    StringTokenizer st = new StringTokenizer(line, "+-*/", true);
                    if (st.countTokens() < 3) throw new NoSuchElementException("Missing operand"); 

                    double n1 = Double.parseDouble(st.nextToken().trim()); 
                    String op = st.nextToken().trim();
                    double n2 = Double.parseDouble(st.nextToken().trim());

                    double result;
                    switch (op) {
                        case "+": result = n1 + n2; break;
                        case "-": result = n1 - n2; break;
                        case "*": result = n1 * n2; break;
                        case "/": 
                            if (n2 == 0) throw new ArithmeticException("Zero division");
                            result = n1 / n2; 
                            break;
                        default: throw new UnsupportedOperationException("Operator " + op + " not supported"); 
                    }
                    resWriter.println(line + " = " + result);
                } catch (NoSuchElementException | NumberFormatException | UnsupportedOperationException | ArithmeticException e) {
                    logWriter.println("Error processing [" + line + "]: " + e.getMessage()); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}