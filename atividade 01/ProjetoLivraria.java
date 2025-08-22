
public class ProjetoLivraria
{
	public static void main(String[] args) {
		Livro l1 = new Livro();
		l1.autor = "Aldous Huxley";
		l1.genero = "Distopia";
		l1.nome = "Admirável mundo novo";
		l1.numeroPaginas = 367;
		l1.tamanho = 20.00f;
		l1.preco = 50.00f;
		l1.novo = true;
		l1.abrir();
		l1.serLido();
		l1.mostrarImagens();
		l1.status();
		
		
		Livro l2 = new Livro();
		l2.autor = "George Orwell";
		l2.genero = "Distopia";
		l2.nome = "1984";
		l2.numeroPaginas = 367;
		l2.tamanho = 30.00f;
		l2.preco = 54.99f;
		l2.novo = false;
		l2.abrir();
		l2.serLido();
		l2.mostrarImagens();
		l2.status();
	}
}
