public class Aluno {
    String nome;
    String matricula;
    double notaAv1;
    double notaAv2;
    double resultNota;
    
    void dados () {
       System.out.println("O nome do aluno(a) é "+ this.nome);
       System.out.println("A matrícula do aluno(a) é "+ this.matricula); 
       System.out.println("A primeira nota é : "+ this.notaAv1); 
       System.out.println("A segunda nota  é "+ this.notaAv2); 
    }
    
    double media () {
        
        double mediaArit = (this.notaAv1+this.notaAv2) / 2;
        
        return mediaArit ; 
    }
    
    void aprovacao () {
        if (this.resultNota >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}