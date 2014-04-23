package by.bsu.prod.Main;


import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import by.bsu.prod.Product.Product;
import by.bsu.prod.Action.Action;


public class Main {
	   private static Logger log = Logger.getLogger(Main.class.getName());
	   public static void main(String[] args){
		 //try {
         //    LogManager.getLogManager().readConfiguration(
        //             Main.class.getResourceAsStream("/logging.properties"));
        // } catch (IOException e) {
        //     System.err.println("Could not setup logger configuration: " + e.toString());
       // }
	try{	 
		 Scanner in = new Scanner(System.in);
		System.out.println("Input Kol-vo Product");
		int k= in.nextInt();
		 assert k > 0 : "Invalid kol value";
		    
		Product m[]= new Product[k];
			
		Action inf= new Action();  
		
		inf.Inform(m);
		inf.SpisName(m);
		inf.SpisCena(m);
		inf.SpisSrok(m);
    }catch(Exception e)
			{
	            log.log(Level.SEVERE, "We have catched exception here: ", e);
	        }
}
	   }