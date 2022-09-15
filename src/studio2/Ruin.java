package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Gambler's Ruin! Input starting amount of money: ");
		double startAmount = in.nextDouble();
		System.out.println("Input the probability (0 to 100) that you win: ");
		double winChance = in.nextDouble();
		System.out.println("Input the max amount of money to call it a successful day: ");
		double winLimit = in.nextDouble();
		System.out.println("Input the amount of days you wish to simulate: ");
		int totalSimulations = in.nextInt();
		
		double temp = Math.random();
		boolean money = true;
		
		System.out.println(startAmount);
		
		
		while (startAmount > 0 || startAmount > winLimit) {
			money = temp > (winChance/100);
			if (money == true) {
				startAmount ++;
			}
			else {
				startAmount --;
			}
			System.out.println("current money: $" + startAmount);
		}
		
	}

}
