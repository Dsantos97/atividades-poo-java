public class Carro {
    String marca;
    int ano;
    String modelo;
    
    
    void informacoesCarro() {
        System.out.println("marca :"+ marca);
        System.out.println("Ano:"+ ano);
        System.out.println("Modelo :"+ modelo);
    }
    void ligarCarro () {
       System.out.println("O carro está ligando"); 
    }
    void mudancaCarro (String novaMarca, String novoModelo) {
     marca = novaMarca;
     modelo = novoModelo;
     System.out.println("A marca e modelo do carro foram mudadas para: "+marca+" e "+modelo);
    
    }
}