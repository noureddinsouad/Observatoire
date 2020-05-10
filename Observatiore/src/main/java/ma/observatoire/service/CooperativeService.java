package ma.observatoire.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import ma.observatoire.entitie.Cooperative;

public interface CooperativeService {
	List<Cooperative> list();
	
	Cooperative create(Cooperative cooperative);
	
	Cooperative read(long id);
	
	Cooperative update(long id, Cooperative cooperative);
	
	void delete(long id);
	
	public List<Object[]> tets();
	public ArrayList<Object[]> CooperativeParSecteur();
	public List<Object[]> CooperativeParRegion();
	public List<Object[]> CooperativeParBranche();
	
	public List<Object[]> NombreAdherentsParSecteur();
	public List<Object[]> NombreAdherentsParRegion();
	public List<Object[]> NombreAdherentsParBranche();
	
	public List<Object[]> CapitalParSecteur();
	public List<Object[]> CapitalParRegion();
	
	public  List<Object[]> EvolutionCreationParRegion(int year );
	public  List<Object[]> EvolutionCreationParSecteur(int year );
	
	public  List<Object[]> EvolutionCreationParRegion(int year,int month );
	public  List<Object[]> EvolutionCreationParSecteur(int year , int month);
	
	public  List<Object[]> NombreCooperativesParRegion(int  year);
	public  List<Object[]> NombreCooperativesParSecteur(int  year);
	
	public  List<Object[]> NombreCooperativesParRegion(int year,int month );
	public  List<Object[]> NombreCooperativesParSecteur(int year , int month);

}
