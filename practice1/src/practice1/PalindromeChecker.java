package practice1;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {

        String text = s.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

