

public class Main {

	public static void main(String[] args){
		
		Towar jablko = new Towar("Jab³ko", 1);
		Faktura produkt = new Faktura(jablko);
		produkt.nazwa = "Dywan";
		produkt.ilosc = 5;
		//Towar jablko = new Towar(jablko.nazwa, jablko.ilosc);
		//Towar jablko1 = new Towar();


		jablko.wartosci(produkt.nazwa, produkt.ilosc);
		produkt.wypisz();
		
		Towar gruszka = new Towar( "kg", 5, 3.50 );
		Faktura produkt2 = new Faktura("2005.05.10", 15, "2005.05.25", gruszka, 5);
		produkt2.nazwa = "Gruszka";
		produkt2.wypisz();
		
		Towar dywan = new Towar("Dywan", 3);
		Faktura produkt3 = new Faktura(dywan);
		produkt3.wypisz();
		//jablko1.produkty();
	}
}
