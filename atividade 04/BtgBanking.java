public class BtgBanking
{
	public static void main(String[] args) {
		System.out.println("CONTA CLIENTE 1");
		
		ContaBancaria c1 = new ContaBancaria ();
		
		c1.numConta = "324774" ;
		c1.titular = "ANDREA FERNANDES DOS SANTOS SILVA";
		c1.saldo = 1000.0;
		c1.consultar();
		c1.sacar(250.00);
		c1.depositar(97.00);
		
		ContaBancaria c2 = new ContaBancaria ();
		
		c2.numConta = "433535";
		c2.titular = "CARLOS JOAQUIM SOUZA DA SILVA";
		c2.saldo = 1000.0;
		c2.consultar();
		c2.sacar(789.00);
		c2.depositar(89.00);
	}
}
