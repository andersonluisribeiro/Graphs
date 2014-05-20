package com.example.graphs.daos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.example.graphs.entidades.Venda;
import com.example.graphs.uteis.RowGoogleChart;

public class VendaDao {

	private static VendaDao instancia;
	private static List<RowGoogleChart> vendas = new ArrayList<RowGoogleChart>();
	
	public List<RowGoogleChart> listarVendas(){
		vendas.add(new Venda(Calendar.getInstance(), 123f));
		vendas.add(new Venda(Calendar.getInstance(), 124f));
		vendas.add(new Venda(Calendar.getInstance(), 125f));
		vendas.add(new Venda(Calendar.getInstance(), 126f));
		vendas.add(new Venda(Calendar.getInstance(), 127f));
		vendas.add(new Venda(Calendar.getInstance(), 128f));
		vendas.add(new Venda(Calendar.getInstance(), 129f));
		return vendas;
	}
	
	public static VendaDao getInstancia(){
		if(instancia == null){
			instancia = new VendaDao();
		}
		return instancia;
	}
	
	
	
}
