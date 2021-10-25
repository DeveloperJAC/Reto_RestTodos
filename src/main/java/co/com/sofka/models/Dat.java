package co.com.sofka.models;

import java.util.List;

public class Dat {
	private List<Todos> dat;

	public void setDat(List<Todos> dat){
		this.dat = dat;
	}

	public List<Todos> getData(){
		return dat;
	}
}