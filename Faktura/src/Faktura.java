
public class Faktura {

	String nazwa;
	int ilosc;
	Towar wartosci;
	String data;
	int dni;
	String termin;
	/*String jednostka;
	double nettoj;
	double bruttoj;
	int ilosc;
	double netto;
	double brutto;
	double podatek;*/
	
	public Faktura( String data, int dni, String termin, Towar nazwa, int ilosc ){
		this.data = data;
		this.dni = dni;
		this.termin = termin;
		wartosci = nazwa;
		this.ilosc = ilosc;
	}
	public Faktura( Towar nazwa ){
		data = "2012.10.10";
		dni = 15;
		termin = "2012.10.25";
		wartosci = nazwa;
	}
	
	void nazwa(String nazwa){
		this.nazwa = nazwa;
	}
	
	void ilosc(int ilosc){
		this.ilosc = ilosc;
	}
	
	void data(String data){
		this.data = data;
	}
	
	void dni(int dni){
		this.dni = dni;
	}
	
	void termin(String termin){
		this.termin = termin;
	}
	void wypisz(){
		System.out.println("Data zakupu: " + data + "\nTermin zap³aty: " + dni + " dni, " + termin);
		System.out.println("Nazwa: " + nazwa);
		System.out.println("Jednostka: " + wartosci.jednostka);
		System.out.println("Ilosc: " + ilosc);
		System.out.println("Netto jednostkowe: " + wartosci.nettoj);
		System.out.println("Brutto jednostkowe: " + wartosci.bruttoj);
		System.out.println("Cena netto: " + wartosci.netto);
		System.out.println("Cena brutto: " + wartosci.brutto);
		System.out.println("Podatek: " + wartosci.podatek + "\n");
		
	}
}