import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		int x,y;

		for (int i=0; i<5; i++) {
			System.out.print("Enter request: ");
			x = sc.nextInt();

			if (x==1) {
				System.out.print("Enter integer: ");
				y = sc.nextInt();
				array.add(y);
			}

			else if (x==2) {
				System.out.print("Enter integer: ");
				y = sc.nextInt();
				if (array.contains(y)) {
					for (int j=0; j<array.size(); j++) {
						if (array.get(j).equals(y)) {
							array.remove(j);
						}
					}
				}
			}

			else if (x==3) {
				System.out.println(array.size());
			}

			else {
				System.out.println("Invalid input");
			}
			System.out.println(array);
		}
	}
}
