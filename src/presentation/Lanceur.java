package presentation;

import domaine.Login;
import domaine.Personne;
import service.LoginImpl;
import service.PersonneImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p = new Personne(1, "ZEC", "union", 20);
		PersonneImpl pi = new PersonneImpl();
		
		pi.ajouter(p);
		pi.affiche(pi.findAll());
		
		Login g = new Login("TOTO","Tata");
		LoginImpl gi = new LoginImpl();

		gi.ajouter(g);
		gi.affiche(gi.findAll());
		
		
	}

}
