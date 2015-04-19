import java.util.Date;


public class Pelanggan {

	String nama;
	String HP;
	String alamat;
	private int size;
	String ketentuan;
	Boolean sukaDesign;
	int tingkatPuas;
	String komentar;
	Date tglBerkunjung;

	void setSize(int size) {
		this.size = size;
	}

	int getSize() {
		return size;
	}

	void tingkatPuas(int kepuasan){
		try{
		switch (kepuasan){
		case 1: komentar="Kurang Puas"; break;
		case 2: komentar="Cukup Puas"; break;
		case 3: komentar="Sangat Puas"; break;
		}
		} catch (Exception e){
			System.out.println("Terjadi kesalahan. Input tingkat kepuasan:1,2,atau 3.");
		}
	}

	String getKomentar() {
		return komentar;
	}
}