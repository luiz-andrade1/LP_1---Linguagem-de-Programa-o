public class Alimento {

    private String nomeAliemnto = "Barra de cereal";
    private String sabor = "Doce";
    private String tipo = "Sólido";
    private Integer quantidade = 0;

    public String getNomeAliemnto() {
        return nomeAliemnto;
    }
    public void setNomeAliemnto(String nomeAliemnto) {
        this.nomeAliemnto = nomeAliemnto;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Alimento(){}

    public void callSabor(){
        System.out.println("O sabor predominante é: "+sabor);
    }
    public void callTipo(){
        System.out.println("O alimento é do tipo: "+tipo);
    }
    public void callQuantidade(){
        System.out.println("Restam em estoque: "+quantidade+" barras.");
    }

}

