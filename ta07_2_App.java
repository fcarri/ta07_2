package project7;

import java.util.*;

import javax.swing.JOptionPane;

public class ta07_2_App {
	public static void main(String args[]){
		
		int idProd = 0;
		double preu = 0;
		double preuFinal = 0;
		double pagat = 0;
		double retornat = 0;
		int qu = 0;
		double iva = 0;
		boolean fi = false;
	
		Scanner sc = new Scanner(System.in);
				
		Hashtable<Integer,Double> stock = new Hashtable<Integer,Double>();  
			
		while (fi == false) {
									
			System.out.println("id : ");
			String nl = sc.nextLine();
			idProd = Integer.parseInt(nl);																			
			
			System.out.println("Preu : ");
			String nl2 = sc.nextLine();
			preu = Double.parseDouble(nl2);
			
			//afegim producte i preu a la llista
			stock.put(idProd, preu);
									
			System.out.println("Fi de la compra(s/n): ");
			String nlf = sc.nextLine();				
			
			qu++;
			
			if (nlf.equals("s")) {				
				fi = true;
			}
						
		}
		JOptionPane.showMessageDialog(null, "Stock = "+stock);	
		preu = 0;
		
		Enumeration <Double> enumeration = stock.elements();
		
		while(enumeration.hasMoreElements()) {									
			preu = preu + enumeration.nextElement();	
			
		}
			
		System.out.println("IVA aplicat(21% o 4%): ");
		String nl = sc.nextLine();
		iva = Double.parseDouble(nl);
		
		System.out.println("Quantitat pagada: ");
		String nl3 = sc.nextLine();
		pagat = Double.parseDouble(nl3);	
		
		preuFinal = preu * (iva/100) + preu;
		retornat = pagat - preuFinal;
		
		System.out.println("Quantitat de productes: "+qu);
		System.out.println("Preu sense IVA: "+preu);		
		System.out.println("Preu amb IVA: "+preuFinal);													
		System.out.println("Retornat: "+retornat);				
				
		sc.close();
		
	}
}
