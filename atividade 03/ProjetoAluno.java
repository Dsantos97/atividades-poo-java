
public class ProjetoAluno
{
	public static void main(String[] args) {
		Aluno a1 = new Aluno ();
		
		a1.nome = "carlos";
		a1.matricula = "04186437";
		a1.notaAv1 = 7.0;
		a1.notaAv2 = 8.0;
		a1.resultNota = a1.media();
		a1.dados();
		
		System.out.println("A media do aluno " + a1.nome + " è " +a1.resultNota);
		a1.aprovacao();
		
		Aluno a2 = new Aluno ();
		
		a2.nome = "Carla Emanuely das Santos Silva";
		a2.matricula = "04186938";
		a2.notaAv1 = 9.0f;
		a2.notaAv2 = 10.0f;
		a2.resultNota = a2.media();
		a2.dados();
	
		System.out.println("A media da aluna "+a2.nome+" è "+a2.resultNota);
		a2.aprovacao();
		
}
}
