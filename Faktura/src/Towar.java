
public class Towar {

	//Faktura nazwa;
	String jednostka;
	double nettoj;
	double bruttoj;
	//Faktura ilosc;
	double netto;
	double brutto;
	double podatek;
	
	public Towar( String jednostka, int ilosc, double nettoj ){
		this.jednostka = jednostka;
		this.nettoj = nettoj;
		bruttoj = nettoj * 0.22 + nettoj;
		netto = nettoj * ilosc;
		brutto = netto * 0.22 + netto;
		podatek = netto * 0.22;
		
	}
	public Towar( String nazwa, int ilosc ){
		if( nazwa.equals("Jab³ko") ){
			
			jednostka = "kg";
			nettoj = 2;
			bruttoj = 2 * 0.22 + 2;
			netto = ilosc * nettoj;
			brutto = netto * 0.22 + netto;
			podatek = netto * 0.22;
		}
		
		else if( nazwa.equals("Dywan") ){
			jednostka = "metry";
			nettoj = 30;
			bruttoj = 30 * 0.22 + 30;
			netto = ilosc * nettoj;
			brutto = netto * 0.22 + netto;
			podatek = netto * 0.22;
		}
		
		else if( nazwa.equals("Bateria") ){
			jednostka = "sztuki";
			nettoj = 0.35;
			bruttoj = 0.35 * 0.22 + 0.35;
			netto = ilosc * nettoj;
			brutto = netto * 0.22 + netto;
			podatek = netto * 0.22;
		}
	}
	
	public void wartosci(String nazwa, int ilosc){
		
		if( nazwa.equals("Jab³ko") ){
			jednostka = "kg";
			nettoj = 2;
			bruttoj = 2 * 0.22 + 2;
			netto = ilosc * nettoj;
			brutto = netto * 0.22 + netto;
			podatek = netto * 0.22;
		}
		
		else if( nazwa.equals("Dywan") ){
			jednostka = "metry";
			nettoj = 30;
			bruttoj = 30 * 0.22 + 30;
			netto = ilosc * nettoj;
			brutto = netto * 0.22 + netto;
			podatek = netto * 0.22;
		}
		
		else if( nazwa.equals("Bateria") ){
			jednostka = "sztuki";
			nettoj = 0.35;
			bruttoj = 0.35 * 0.22 + 0.35;
			netto = ilosc * nettoj;
			brutto = netto * 0.22 + netto;
			podatek = netto * 0.22;
		}
	}

	
	
	
	
	
	
	/*void jednostka(String jednostka){
		this.jednostka = jednostka;
	}
	
	void nettoj(double nettoj){
		this.nettoj = nettoj;
	}
	
	void bruttoj(double bruttoj){
		this.bruttoj = bruttoj;
	}
	
	void ilosc(int ilosc){
		this.ilosc = ilosc;
	}
	
	void netto(double netto){
		this.netto = netto;
	}
	
	void brutto(double brutto){
		this.brutto = brutto;
	}
	
	void podatek(double podatek){
		this.podatek = podatek;
	}*/
}
