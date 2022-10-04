package main;

public class Analyste extends Salarie {
	
	private String nbrDeplacement;

	public Analyste(String code, String nom, String prenom,String date, String nbrDeplacement) {
		// TODO Auto-generated constructor stub
		super(code, nom, prenom, date);
		this.nbrDeplacement = nbrDeplacement;
	}

	public String getNbrDeplacement() {
		return nbrDeplacement;
	}

	public void setNbrDeplacement(String nbrDeplacement) {
		this.nbrDeplacement = nbrDeplacement;
	}
	
	@Override
	public String toString() {
		return "code : " + this.getCode() + " Nom : " + this.getNom() + " Prenom : " + this.getPrenom() + " Date : " + this.getDateEmbauche() + " nbrDeplacement : " + this.nbrDeplacement;
		
	}

}
