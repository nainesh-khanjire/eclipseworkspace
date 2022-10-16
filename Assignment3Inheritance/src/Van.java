import java.util.Scanner;

public class Van extends Vehicle {

	int doors = 3;
	double load;
	int numberofboxes = 10;

	void loadVan() {

		Scanner sc = new Scanner(System.in);

	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public double getLoad() {
		return load;
	}

	public void setLoad(double load) {
		this.load = load;
	}

	public int getNumberofboxes() {
		return numberofboxes;
	}

	public void setNumberofboxes(int numberofboxes) {
		this.numberofboxes = numberofboxes;
	}
}
