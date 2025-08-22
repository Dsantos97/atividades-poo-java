public class ContaBancaria {
   
    String numConta;
    String titular;
    double saldo;
    
    
    double depositar (double valor){
       saldo += valor;
       System.out.println("Deposito relizado com sucesso!");
       System.out.println("Seu saldo atual é " +valor);
       return saldo;
        
    }
    double sacar (double valor) {
       if (saldo >= valor) {
           saldo -= valor;
           System.out.println("Saque realizado!");
           System.out.println("Seu saldo atual é :" +valor);
       } else {
           System.out.println("Seu saldo é insuficiente, tente um valor menor!");
            }
            return saldo ;
    }
    void consultar () {
        System.out.println(" O valor atual do seu saldo  é : R$"+this.saldo);
    }
}