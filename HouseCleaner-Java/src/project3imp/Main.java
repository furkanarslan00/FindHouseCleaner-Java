package project3imp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      
    	List<HouseCleaner> h = new ArrayList<>();


        HouseOwner owner1 = new HouseOwner("Furkan","Bursa",2500);
        HouseOwner owner2 = new HouseOwner("Talha","Balıkesir",250);
        HouseOwner owner3 = new HouseOwner("Duru","İstanbul",2000);
        HouseOwner owner4 = new HouseOwner("Leyli","İstanbul",1000);

        HouseCleaner cleaner1 = new HouseCleaner("Kadir", "Ankara", 350);
        HouseCleaner cleaner2 = new HouseCleaner("Gamze", "Antalya", 150);
        HouseCleaner cleaner3 = new HouseCleaner("Umut", "İstanbul", 600);
        HouseCleaner cleaner4 = new HouseCleaner("Pelin", "Bursa", 500);

        h.add(cleaner1);
        h.add(cleaner2);
        h.add(cleaner3);
        h.add(cleaner4);


        List<HouseCleaner> searchResult = owner1.searchCleaner(h);
        for (HouseCleaner cleaner : searchResult) {
        	System.out.println(cleaner.getName());
        }

        owner1.bookCleaner(cleaner1);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}