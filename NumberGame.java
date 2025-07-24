import java.util.*;

public class NumberGame {
    int num, count, score = 0;

    public NumberGame(int n) {
        num = n;
    }

    public int guess() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Guess the number of your choice: ");
        return sn.nextInt();
    }

    public boolean check() {
        count = 0;
        while (count < 5) {
            int x = guess();
            if (x == num) {
                System.out.println("You guessed the correct number!");
                return true;
            } else if (x < num) {
                System.out.println("Number entered is too low!");
            } else {
                System.out.println("Number entered is too high!");
            }
            count++;
        }
        System.out.println("\nOOPS!! You lost.");
        System.out.println("Correct number was " + num);
        System.out.println("Please Try Again Later!!");
        System.out.println("Thanks for playing!!");
        return false;
    }

    public int scorecalc() {
        if (count == 1)
            score = 25;
        else
            score = 5 * (5 - count + 1);
        return score;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int tr = 0, rw = 0, ts = 0;
        boolean pg = true;

        while (pg) {
            int y = (int) (Math.random() * 100) + 1;
            NumberGame ob = new NumberGame(y);
            System.out.println("Round " + (tr + 1));
            System.out.println("Guess a number between 1 and 100.");
            tr++;
            
            if (ob.check()) {
                int rs = ob.scorecalc();
                ts += rs;
                rw++;
                System.out.println("Congrats! You won " + rs + " points.");
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            String ch = sn.next().toLowerCase().trim();
            pg = ch.equals("yes");
        }

        System.out.println("\nGame Over!!");
        System.out.println("Thanks for playing");
        System.out.println("Hope you have enjoyed!! Come back Soon!!");
        System.out.println("Total Rounds Played: " + tr);
        System.out.println("Rounds Won: " + rw);
        System.out.println("Final Score: " + ts + " points");
    }
}
