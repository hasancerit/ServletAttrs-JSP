package attrp;

public class Kisi {
	private String isim,soyisim,yas;
	
	public Kisi(String isim,String soyisim,String yas) {
		this.isim = isim;
		this.yas = yas;
		this.soyisim = soyisim;
	}
	


	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
}
