package ingressos;

import cliente.Cliente;

public class Ingresso {

    private boolean ingresso;
    private String corPulseira;
    private String maiorIdade;
    private String areaCliente;

    public Ingresso() {
    }

    public boolean getIngresso() {
        return ingresso;
    }
    public String getMaiorIdade() {
        return maiorIdade;
    }
    public String getCorPulseira() {
        return corPulseira;
    }
    public String getAreaCliente() {
        return areaCliente;
    }


    public boolean verificarCompra(Cliente compra){
        if (compra.comprar() == true){
            this.ingresso = true;
            return true;
        }else{
            this.ingresso = false;
            return false;
        }

    }


    public String verIdade(Cliente idade){
        if (idade.getIdade() >= 18){
            this.maiorIdade = "É de maior";
            return "É de maior";
        }else {
            this.maiorIdade = "É de menor";
            return "É de menor";
        }
    }

    public String pegarPulseira(Cliente idade,Cliente compra){
        if (verificarCompra(compra) == true && verIdade(idade) =="É de maior"){
            this.corPulseira = "Pulseira Verde";
            return "Pulseira Verde";
        }else{
            return "Sem pulseira";
        }
    }

    public String verificarArea(Cliente cliente, LugarDisponivel lugar){
        if (lugar.getLugarLivre() >= 1  && cliente.comprar() == true){
            this.areaCliente = "Front";
            return "Front";
        }else {
            return "Sem Pulseira";
        }
    }


}
