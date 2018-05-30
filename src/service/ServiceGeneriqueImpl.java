package service;

import java.util.List;
import java.util.Vector;

public class ServiceGeneriqueImpl <T> implements IGeneriqueService<T> {
	
	private List<T> ListT = new Vector<T>();

	@Override
	public void ajouter(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimmer(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifier(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T rechercher(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void affiche(List<T> liste) {
		// TODO Auto-generated method stub
		
	}

}