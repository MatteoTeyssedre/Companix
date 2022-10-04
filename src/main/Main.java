package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		try {
			
			boolean end = false;
			Scanner scanner = new Scanner(System.in);
			HashMap<String, Salarie> salaries = new HashMap<String, Salarie>();
			
			while(!end) {		    
				System.out.println("1 -  Ajouter un concepteur");
				System.out.println("2 -  Supprimer un concepteur");
				System.out.println("3 -  Lister les concepteur existant(s)");
				System.out.println("4 -  Ajouter un anaylste");
				System.out.println("5 -  Supprimer un analyste");
				System.out.println("6 -  Lister tout");
				System.out.println("7 -  termine");
				System.out.print("Faite votre choix : ");
				String s = scanner.nextLine();
				
				switch(s) {
				case "1":
					createConcepteur(salaries, scanner);
					break;
				case "2":
					deleteConcepteur(salaries, scanner);
					break;
				case "3":
					showConcepteur(salaries, scanner);
					break;
				case "4":
					createAnalyste(salaries, scanner);
					break;
				case "5":
					deleteAnalyste(salaries, scanner);
					break;
				case "6":
					showAllSalarie(salaries, scanner);
					break;
				case "7":
					end = true;
					break;
				}
			}
			scanner.close();
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	static private void createConcepteur(HashMap<String, Salarie> salaries, Scanner scanner) {
		System.out.println("Saisir le code, nom, prénom, date d’embauche et nombre d’année de développement : ");
		String input = scanner.nextLine();
		String[] array = input.split("-");
		
		if(!salaries.containsKey(array[0])) {
			Concepteur concepteur = new Concepteur(array[0], array[1], array[2], array[3], array[4]);					
			salaries.put(array[0],concepteur);
		}else {
			System.out.println("Le code existe déjà veuillez en renseignez un autre");
		}
	}
	
	static private void deleteConcepteur(HashMap<String, Salarie> salaries, Scanner scanner) {
		System.out.println("Saisir le code : ");
		String code = scanner.nextLine();
		if(salaries.containsKey(code)) {
			salaries.remove(code);					
		}else {
			System.out.println("Le code existe pas veuillez en renseignez un autre");
		}
	}
	
	static private void showConcepteur(HashMap<String, Salarie> salaries, Scanner scanner) {
		Map<String, Salarie> map = new TreeMap<String, Salarie>(salaries); 
		map.entrySet().forEach(entry -> {
			if(entry.getValue() instanceof Concepteur) {
				System.out.println(entry.getValue().toString());								
			}
		});
	}
	
	static private void createAnalyste(HashMap<String, Salarie> salaries, Scanner scanner) {
		System.out.println("Saisir le code, nom, prénom, date d’embauche et nombre de déplacement : ");
		String input = scanner.nextLine();
		String[] array = input.split("-");
		
		if(!salaries.containsKey(array[0])) {
			Analyste analyste = new Analyste(array[0], array[1], array[2], array[3], array[4]);					
			salaries.put(array[0],analyste);
		}else {
			System.out.println("Le code existe déjà veuillez en renseignez un autre");
		}
	}
	
	static private void deleteAnalyste(HashMap<String, Salarie> salaries, Scanner scanner) {
		System.out.println("Saisir le code : ");
		String code = scanner.nextLine();
		if(salaries.containsKey(code)) {
			salaries.remove(code);					
		}else {
			System.out.println("Le code existe pas veuillez en renseignez un autre");
		}
	}
	
	static private void showAllSalarie(HashMap<String, Salarie> salaries, Scanner scanner) {
		Map<String, Salarie> map = new TreeMap<String, Salarie>(salaries);
		map.entrySet().forEach(entry -> {
			String type = entry.getValue() instanceof Analyste ? "Analyste" : "Concepteur";
			System.out.println(entry.getValue().toString() + " ( " + type + " )");				
		});
	}
}
