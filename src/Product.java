
public class Product {
	
	public String name;
	public int voorraad;
	public boolean aanbieding;
	public double prijs;
	public String categorie;
	
	public void printIets() {
		System.out.println("Naam is " + name);
	}
	
	public void printVoorraad() {
		System.out.println("Voorraad is " + voorraad);
	}
	
	public void printAanbieding() {
		System.out.println("Aanbieding " + aanbieding);
	}
	
	public void StelNaamIn(String name) {
		this.name = name;
	}
	
	public void StelVoorraadIn(int voorraad) {
		this.voorraad = voorraad;
	}
	
	public void StelAanbiedingIn(boolean aanbieding) {
		this.aanbieding = aanbieding;
	}
	
	public String watIsJouwNaam() {
		return name;
	}
	
	public int watIsJouwVoorraad() {
		return voorraad;
	}
	
	public boolean benJijInDeAanbieding() {
		return aanbieding;
	}
	
	
}
