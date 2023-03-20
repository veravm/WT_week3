public abstract class Balsport {
	
	public String sportnaam;
	public String teamname;
	public int teammembers;
	public boolean zaalsport;
	
	public abstract void printScore();
	
	public void printSportnaam() {
		System.out.println(sportnaam);
	}
	
	public void printTeamname() {
		System.out.println(teamname);
	}
	
	public void printTeammembers() {
		System.out.println(teammembers);
	}
	
	public void printZaalsport() {
		System.out.println(zaalsport);
	}

}
