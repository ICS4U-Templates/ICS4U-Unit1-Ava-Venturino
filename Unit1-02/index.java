/*
 * This is a program that calculates the amount of energy produced when given the mass.
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-02-20
 */

import java.util.Scanner;
class EnergyCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.print("Enter the mass of an object in kilograms: ");
		double mass;

		try {
			mass = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid input.");
			System.out.println("\nDone.");
			return;
		}

		// Error checking
		if (mass < 0) {
			System.out.println("Invalid input.");
			System.out.println("\nDone.");
			return;
		}

		final double speedOfLight = 299792458; // meters per second

		// Process
		double energy = mass * Math.pow(speedOfLight, 2);

		// Output
		System.out.printf("%.2f kg of mass would produce %.3e J of energy.\n", mass, energy);
		System.out.println("\nDone.");
	}
}
