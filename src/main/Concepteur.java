package main;

public class Concepteur extends Salarie {
	
	private String nbrAnnee;

	public Concepteur(String code, String nom, String prenom,String date, String nbrAnnee) {
		// TODO Auto-generated constructor stub
		super(code, nom, prenom, date);
		this.nbrAnnee = nbrAnnee;
	}

	public String getNbrAnnee() {
		return nbrAnnee;
	}

	public void setNbrAnnee(String nbrAnnee) {
		this.nbrAnnee = nbrAnnee;
	}

	@Override
	public String toString() {
		return "code : " + this.getCode() + " Nom : " + this.getNom() + " Prenom : " + this.getPrenom() + " Date : " + this.getDateEmbauche() + " nbrAnnee : " + this.nbrAnnee;
		
	}
}
