package com.example.graphs.entidades;

import java.util.Calendar;

import com.example.graphs.uteis.RowGoogleChart;

public class Venda implements RowGoogleChart{
	
	private Calendar data;
	private Float valor;
	
	public Venda(Calendar data, Float valor) {		
		this.data = data;
		this.valor = valor;
	}

	public Calendar getData() {
		return data;
	}	

	public Float getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	@Override
	public String getRow() {
		int mes = data.get(Calendar.MONTH) + 1;
		int ano = data.get(Calendar.YEAR);
		return "['"+mes+"-"+ano+"', "+valor+"],";
	}

	

	
	
	
	
	

}
