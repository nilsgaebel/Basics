package loops;

import java.util.Scanner;

public class Sinus {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Eingabe:");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		int t = 0;
		int sinuscount = -40;
		int z;

		// X-Achse
		z = (int) (a + b * Math.sin(t / c * 2 * Math.PI));

		for (int i = 0; i < 80; i++) {

			if (sinuscount == z) {
				System.out.print("*");
			} else {

				if (i == 40) {
					System.out.print("0");
				}

				else {
					if ((i % 5) == 0) {
						System.out.print("+");
					} else {
						System.out.print("-");

					}
				}
			}

			sinuscount++;

		}

		System.out.println();

		// Y-Achse

		sinuscount = -40;
		t = 1;

		while (t < 40) {

			z = (int) (a + b * Math.sin(t / c * 2 * Math.PI));

			for (int i = 0; i < 80; i++) {

				if (z == sinuscount) {
					System.out.print("*");
				} else {

					if (i == 40) {

						if ((t % 5) == 0) {
							System.out.print("+");
						} else {

							System.out.print("|");
						}

					} else {
						System.out.print(" ");
					}
				}

				sinuscount++;

			}

			t++;
			System.out.println();
			sinuscount = -40;
		}

	}

}
