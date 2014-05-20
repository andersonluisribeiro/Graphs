package com.example.graphs;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

import com.example.graphs.daos.VendaDao;
import com.example.graphs.entidades.DadosGrafico;
import com.example.graphs.entidades.Grafico;
import com.example.graphs.uteis.RowGoogleChart;

public class MainActivity extends Activity {
	
	WebView webview;
    String strURL;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List<RowGoogleChart> dados = VendaDao.getInstancia().listarVendas();
				
		Grafico grafico = new Grafico(DadosGrafico.CABECALHO, dados, DadosGrafico.RODAPE);		
		String conteudo = grafico.plotar();
		
		webview = (WebView) findViewById(R.id.wvGrafico);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.requestFocusFromTouch();
        webview.loadDataWithBaseURL( "file:///android_asset/", conteudo, "text/html", "utf-8", null );
	        	 
	        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
