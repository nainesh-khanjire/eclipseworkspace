
public class Truck extends Vehicle {

	int doors =2;
	double load  = 2;
	String sizeofcontainers = "XL" ;
	
	
	void loadContainer() {
		
		
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


	public String getSizeofcontainers() {
		return sizeofcontainers;
	}


	public void setSizeofcontainers(String sizeofcontainers) {
		this.sizeofcontainers = sizeofcontainers;
	}
}
