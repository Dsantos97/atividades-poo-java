
public class Concessionaria
{
	public static void main(String[] args) {
		Carro c1 = new Carro ();
		
		c1.marca = "Fiat";
		c1.ano = 2025;
		c1.modelo = "Kicks";
		c1.informacoesCarro();
		c1.ligarCarro();
		c1.mudancaCarro("fiat","grand siena");
		
			Carro c2 = new Carro ();
		
		c2.marca = "Hyundai";
		c2.ano = 2023;
		c2.modelo = "Hb20";
		c2.informacoesCarro();
		c2.ligarCarro();
		c2.mudancaCarro("fiat","palio");
	}
}
