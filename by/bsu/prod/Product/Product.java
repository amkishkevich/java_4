package by.bsu.prod.Product;
public class Product {

	private String Name;
	private String Proizv;
	private int Cena;
	private int Srok;
	private int Kol;
	public Product(){
	}
	public String getName(){
		return Name;
	}
	public int getCena(){
		return Cena;
	}
	public int getSrok(){
		return Srok;
	}
	public String getProizv(){
		return Proizv;
	}
	public int getKol(){
		return Kol;
	}
	public void setName(String Name){
		if(Name != null) this.Name = Name;
		else this.Name = "unknown";
	}
	
	public void setProizv(String Proizv){
		
		if(Proizv != null) this.Proizv = Proizv;
		else this.Proizv = "unknown";
	}
	
	public void setCena(int Cena){
		if(Cena > 0) this.Cena = Cena;
		else this.Cena = 0;
	}
	public void setSrok(int Srok){
		if(Srok > 0) this.Srok = Srok;
		else this.Srok = 0;
	}
	
	public void setKol(int Kol){
		if(Kol > 0) this.Kol = Kol;
		else this.Kol = 0;
	}
	public String toString(){
		return "Name=" +this.getName()+"\t Cena="+this.getCena()+"\t Srok="+this.getSrok()+"\t Kol="+this.getKol()+"\t Proizv="+this.getProizv()+"\n";
	}


}

