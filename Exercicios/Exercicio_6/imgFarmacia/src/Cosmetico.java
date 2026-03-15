public class Cosmetico {

    private String nomeCosmetico = "Creme facial";
    private String aplicacao = "Pele, rosto";
    private Integer quantidade = 5;
    private Double dosagem = 10.5;

    public String getNomeCosmetico(){
        return nomeCosmetico;
    }
    public void setNomeCosmetico(){this.nomeCosmetico = nomeCosmetico;}

    public String getAplicacao() {
        return aplicacao;
    }
    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDosagem() {
        return dosagem;
    }
    public void setDosagem(Double dosagem) {this.dosagem = dosagem;}

    public Cosmetico(){}

    public void callAplicacao(){
        System.out.println("Aplicação recomendada: "+aplicacao);
    }
    public void callQuantidade(){
        System.out.println("Restam em estoque: "+quantidade+" potes");
    }
    public void callDosagem(){
        System.out.println("Dosagem recomendada: "+dosagem+"mg");
    }

}
