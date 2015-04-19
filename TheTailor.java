import java.util.Calendar;
import java.util.Date;


public class TheTailor {

	static double Pemasukan;
	
	static void setPemasukan(double Pemasukan) {
		Pemasukan += Pemasukan;
	}

	static double getPemasukan() {
		return Pemasukan;
	}
	
	TheTailor(){
		Pemasukan=0;
	}

	public static void main(String[] args) {

		Pelanggan pelanggan1=new Pelanggan();
		pelanggan1.nama="Wulandari";
		pelanggan1.HP="081727111546";
		pelanggan1.alamat="Jl.Suropati No.4, Jakarta";
		Calendar cal1=Calendar.getInstance();
		cal1.set(Calendar.YEAR, 2015);
		cal1.set(Calendar.MONTH, Calendar.APRIL);
		cal1.set(Calendar.DATE, 19);
		pelanggan1.tglBerkunjung=cal1.getTime();
		pelanggan1.setSize(12);
		pelanggan1.ketentuan="Formal dan Simple";
		pelanggan1.sukaDesign=true;

		Designer designer1=new Designer();
		designer1.nama="Hendry Cahyadi";
		designer1.HP="085343522122";
		designer1.alamat="jl.Gatot Subroto No.16, Jakarta";

		Penjahit penjahit1=new Penjahit();
		penjahit1.isDone=true;
		penjahit1.setHP("08820106619");
		penjahit1.setAlamat("Jl.Sudirman No.07");

		while(pelanggan1.sukaDesign){
			if(penjahit1.isDone);
				Jahitan jahitan1=new Jahitan();
				jahitan1.pelanggan=pelanggan1;
				jahitan1.designer=designer1;
				jahitan1.penjahit=penjahit1;
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.YEAR, 2015);
				cal.set(Calendar.MONTH, Calendar.MAY);
				cal.set(Calendar.DATE, 3);
				jahitan1.tglSelesai=cal.getTime();
				Pembayaran payment1=new Pembayaran();
				payment1.jahitan=jahitan1;
				payment1.Bill=875000;
				payment1.setPayment(2);
				setPemasukan(payment1.getBill());
				pelanggan1.tingkatPuas(2);
				return;
		}
		cetakPenghasilanPerHari ();

	}
	
	static void cetakPenghasilanPerHari (){
		System.out.println(getPemasukan());
	}

}
