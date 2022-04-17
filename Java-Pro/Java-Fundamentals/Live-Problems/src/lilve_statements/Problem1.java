package lilve_statements;

import java.util.Random;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		int head = 0, tail = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to flip a coin");

		int coin = in.nextInt();

		Random random = new Random(2);
		// rand = Math.floor(Math.random() * 10) % 2;

		while (coin < 10) {
			if (random.equals(1)) {
				System.out.println("Head Wins");
				head++;
			} else {
				System.out.println("Tail Wins");
				tail++;
			}
			coin++;

		}

		System.out.println("Number of Heads " + (head / coin) * 100 + " %");
		System.out.println("Number of tails " + (tail / coin) * 100 + " %");
		in.close();
	}
}
/*
 * 1. Flip Coin and print percentage of Heads and Tails a. I/P -> The number of
 * times to Flip Coin. Ensure it is a positive integer. b. Logic -> Use Random
 * Function to get value between 0 and 1. If < 0.5 then tails or heads c. O/P ->
 * Percentage of Head vs Tails
 */