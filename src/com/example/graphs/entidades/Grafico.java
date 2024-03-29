package com.example.graphs.entidades;

import java.util.List;

import com.example.graphs.uteis.RowGoogleChart;

public class Grafico {
	
	private DadosGrafico CABECALHO;
	private List<RowGoogleChart> rows;
	private DadosGrafico RODAPE;
	
	public Grafico(DadosGrafico CABECALHO, List<RowGoogleChart> rows,
			DadosGrafico RODAPE) {
		this.CABECALHO = CABECALHO;
		this.rows = rows;
		this.RODAPE = RODAPE;
	}

	public String plotar(){
		String dados = "";
		for(RowGoogleChart row : rows){
			dados += row.getRow();
		}
		dados = dados.substring(0, dados.length()-1);
		return CABECALHO.getConteudo() + dados + RODAPE.getConteudo();
	}

}
