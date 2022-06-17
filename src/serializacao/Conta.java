package serializacao;

public class Conta implements java.io.Serializable {

    private String cliente;
    private double saldo;
    
    public String getCliente(){
        return this.cliente;
    }
    
    public void setCliente(String cl){
        this.cliente = cl;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double sld){
        this.saldo = sld;
    }
    
    public Conta(){};
    
    public Conta(String cliente, double saldo ){
       this.cliente = cliente;
       this.saldo = saldo;
    };
    
    public void exibeSaldo(){
    System.out.println(cliente + " seu saldo é " +saldo);
}

    public void sacar(double valor){
        saldo -= valor;
    }
    public void deposita(double valor){
        saldo += valor;
    }
    public void tranferePara(Conta destino, double valor ){
        this.sacar(valor);
        destino.deposita(valor);
    }

}
