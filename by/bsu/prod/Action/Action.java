package by.bsu.prod.Action;
import by.bsu.prod.Main.Main;
import by.bsu.prod.MyException.MyException;
import by.bsu.prod.Product.Product;
import java.util.*;
import java.util.logging.*;

public class Action {
	private static Logger log = Logger.getLogger(Main.class.getName());
	public void Inform(Product[] m)throws MyException {
		for(int i=0; i<m.length; i++){
			m[i]= new Product();
			Scanner in = new Scanner(System.in);
		    System.out.println(" Input Name ");
		    String name = in.nextLine();
		    System.out.println(" Input Proizv ");
		    String proizv = in.nextLine();
		    System.out.println(" Input Cena ");
		    int cena = in.nextInt();
		    if (cena>=20000){
		    	throw new MyException("Invalid cena");	
		    }
		    assert cena > 0 : "Invalid Cena value";
		    System.out.println(" Input Srok ");
		    int srok = in.nextInt();
		    assert srok > 0 : "Invalid srok value";		
		    System.out.println(" Input Kol ");
		    int kol = in.nextInt();
		    assert kol > 0 : "Invalid kol value";		
			m[i].setName(name);
			m[i].setProizv(proizv);
			m[i].setCena(cena);
			m[i].setSrok(srok);
			m[i].setKol(kol);
			System.out.println(m[i]);}
		}
		
public void SpisName(Product[]m) throws MyException{
	Scanner in = new Scanner(System.in);
	System.out.println("Input NameSearch");
	String NameSearch= in.nextLine();
	for( int i = 0; i <m.length ; i++){
           if(m[i].getName().equals(NameSearch)){
        	  System.out.println(m[i]);
}	 else {
    throw new MyException("Invalid name");
}
          
	}
	}

public void SpisCena(Product[]m){ 
	Scanner in = new Scanner(System.in);
	System.out.println("Input NameSearch");
	String NameSearch= in.nextLine();
	System.out.println(" Input CenaSearch ");
    int CenaSearch = in.nextInt();
    assert CenaSearch > 0 : "Invalid CenaSearch value";
	for( int i = 0; i < m.length; i++){
		if ((m[i].getName().equals(NameSearch))&&(m[i].getCena()<= CenaSearch)){
			System.out.println(m[i]);
}     
	}
	}
public void SpisSrok(Product[]m){
	Scanner in = new Scanner(System.in);
	System.out.println("Input NameSearch");
	String NameSearch= in.nextLine();
	System.out.println(" Input SrokSearch");
    int SrokSearch = in.nextInt();
    assert SrokSearch > 0: "Invalid SrokSearch value";

	for( int i = 0; i < m.length; i++){
           if ((m[i].getName().equals(NameSearch))&&(m[i].getSrok()>SrokSearch)){
        	   System.out.println(m[i]);
}           
}
	}
}

