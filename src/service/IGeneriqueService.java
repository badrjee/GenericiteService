package service;

import java.util.List;

public interface IGeneriqueService<T> {
	
	public void ajouter (T t);
	public void supprimmer (T t);
	public List<T> findAll();	
	public void modifier (T t);
	public T rechercher (Integer id);
	public void affiche(List<T> liste);

}
