package com.rd.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehical {
	
    @Autowired
	@Qualifier("e")
    private Engine engg;
//
//	//setter Injection
//    @Autowired(required=true)
//	public void setEngg(Engine engg) {
//		this.engg = engg;
//	}


	//constructor injection
//	@Autowired
// public Vehical(Engine engg) {
//		super();
//		this.engg = engg;
//		}
////	
//	//arbitory method
//	@Autowired
//  public void assign(Engine engg)
//	{
//		this.engg=engg;
//		
//	}

	@Override
	public String toString() {
		return "Vehical [engg=" + engg + "]";
	}

}
