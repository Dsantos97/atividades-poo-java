public class Livro{
    String autor;
    String genero;
    String nome;
    int numeroPaginas;
    double tamanho;
    double preco;
    boolean novo;
    
    void status() {
        System.out.println("O nome do autor é "+this.autor );
        System.out.println("O livro pertençe ao gênero "+this.genero );
        System.out.println("O nome do livro é "+this.nome );
        System.out.println("O livro tem um total de "+this.numeroPaginas);
        System.out.println("O preço do livro  "+this.preco );
    }
    
    void abrir(){
        this.novo = true;
    }
    void serLido () {
        this.novo = false;
    }
    void mostrarImagens () {
        
    }
    
    
    
}