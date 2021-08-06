package day0806;

public class Shop0806 {
	
	private String sangpum;
	private int su;
	private int dan;
	private int total;
	
	public Shop0806() {//생성용도로만 쓰일거임

	}

	public Shop0806(String sangpum, int su, int dan) {
		super();
		this.sangpum = sangpum;
		this.su = su;
		this.dan = dan;
		total = su*dan;
	}

	public String getSangpum() {
		return sangpum;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
	
}
