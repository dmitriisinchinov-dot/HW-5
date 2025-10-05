import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] winner = new int[3];
        winner[0] = 1;
        winner[1] = 2;
        winner[2] = 3;
        int Russia = winner[0];
        int German = winner[1];
        int Italy = winner[2];
        float[] second = {1.57f, 7.654f, 9.986f};
        int[] kg = new int[3];
        kg[0] = 90;
        kg[1] = 55;
        kg[2] = 70;
        int dad = kg[0];
        int mom = kg[1];
        int son = kg[2];
        //Task 2
        System.out.println("Task 2");
        for (int i = 0; i < winner.length; i++) {
            if (i == winner.length - 1) {
                System.out.print(winner[i]);
                break;
            }
            System.out.print(winner[i] + ", ");
        }
        System.out.println();
        for (int r = 0; r < second.length; r++) {
            if (r == second.length - 1) {
                System.out.print(second[r]);
                break;
            }
            System.out.print(second[r] + ", ");
        }
        System.out.println();
        System.out.println(dad + ", " + mom + ", " + son);
        //Task 3
        System.out.println("Task 3");
        for (int w = 2; w <= winner.length; w--) {
            if (w == 0) {
                System.out.print(winner[w]);
                break;
            }
            System.out.print(winner[w] + ", ");
        }
        System.out.println();
        for (int s = 2; s <= second.length; s--) {
            if (s == 0) {
                System.out.print(second[s]);
                break;
            }
            System.out.print(second[s] + ", ");
        }
        System.out.println();
        System.out.println(son + ", " + mom + ", " + dad);
//Task 4
        System.out.println("Task 4");
        for (int f = 0; f < winner.length; f++) {
            if (winner[f] % 2 != 0) {
                winner[f] += 1;
            }
            if (f > 0) {
                System.out.print(", ");
            }
            System.out.print(winner[f]);
        }
    }
}

