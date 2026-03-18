package problem5;

import java.util.Scanner;
import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int top = -1;

        for (int i = 0; i < kidnapped.size(); i++) {
            Person cur = kidnapped.get(i);

            if (top >= 0) {
                Person last = kidnapped.get(top);
                if (last.getGender() == gender.BOY && cur.getGender() == gender.GIRL) {
                    top--;
                    continue;
                }
            }

            top++;
            kidnapped.set(top, cur);
        }

        kidnapped.setSize(top + 1);
        return top >= 0;
    }

    public Vector<Person> getRemainingLine() {
        return kidnapped;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().toUpperCase();

        DragonLaunch dl = new DragonLaunch();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            gender g = (c == 'B') ? gender.BOY : gender.GIRL;
            dl.kidnap(new Person("P" + (i + 1), g));
        }

        boolean eat = dl.willDragonEatOrNot();
        System.out.println(eat ? "YES" : "NO");
        System.out.println(dl.getRemainingLine());

        sc.close();
    }
}

