package googleCharts;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerarHtml {

	public static void gerarHtml(int[] vetor) throws IOException {
		
		String htmlGera = "<html>\r\n" + 
				"<head>\r\n" + 
				"  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\">\r\n" + 
				"      google.charts.load('current', {'packages':['bar']});\r\n" + 
				"      google.charts.setOnLoadCallback(drawChart);\r\n" + 
				"\r\n" + 
				"    function drawChart() {\r\n" + 
				"\r\n" + 
				"      var data = new google.visualization.DataTable();\r\n" + 
				"      data.addColumn('number', 'Número de partidas');\r\n" + 
				"      data.addColumn('number', 'Número de gols na partida');\r\n" + 

				"\r\n" + 
				"      data.addRows([\r\n" + 	dadosGrafico(vetor) +		"      ]);\r\n" + 
				"\r\n" + 
				"      var options = {\r\n" + 
				"        chart: {\r\n" + 
				"          title: 'Número de gols por partida',\r\n" + 
				"          subtitle: 'Feito por: Caio Luiz Bervian e Vinicius Goulart Almeida'\r\n" + 
				"        },\r\n" + 
				"        width: 900,\r\n" + 
				"        height: 500,\r\n" + 
				"        axes: {\r\n" + 
				"          x: {\r\n" + 
				"            0: {side: 'top'}\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"      };\r\n" + 
				"\r\n" + 
				"      var chart = new google.charts.Bar(document.getElementById('bar_top_x'));\r\n" + 
				"\r\n" + 
				"      chart.draw(data, google.charts.Bar.convertOptions(options));\r\n" + 
				"    }\r\n" + 
				"  </script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"  <div id=\"bar_top_x\"></div>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"";
		
		
		FileWriter arq = new FileWriter("C:\\Users\\caiob\\OneDrive\\Área de Trabalho\\grafico.html");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf(htmlGera);
	    arq.close();
	}
	private static String dadosGrafico(int[] vetor) {
		String dados = "";
		for (int i = 0; i<vetor.length; i++) {
			dados += "[" + String.valueOf(i+1) + ", " + String.valueOf(vetor[i]) +"],\r\n";
		}
		return dados;
	}
}
