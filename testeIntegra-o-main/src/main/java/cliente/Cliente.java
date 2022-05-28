package cliente;

public class Cliente {

    private int idade;
    private boolean compra;
    private float qtdCliente;

    public Cliente(int idade, boolean compra) {
        this.idade = idade;
        this.compra = compra;
    }

    public Cliente(float qtdCliente){
       this.qtdCliente =  qtdCliente;
    }


    public int getIdade() {
        return idade;
    }
    public boolean getCompra() {
        return compra;
    }
    public float getQtdCliente() {
        return qtdCliente;
    }

    public boolean comprar(){
        if (getCompra() == true){
            return true;
        }else {
            return false;
        }
    }



}