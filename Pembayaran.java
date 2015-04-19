
public class Pembayaran {
	double Bill;
	Jahitan jahitan;
	String jnsPayment;

	void setPayment(int jns){
		switch (jns){
		case 1: jnsPayment="cash"; break;
		case 2: jnsPayment="credit"; break;
		default: jnsPayment="cash"; break;
		}
	}

	String jnsPayment(){
		return jnsPayment;
	}

	double getBill(){
		return Bill;
	}

}




