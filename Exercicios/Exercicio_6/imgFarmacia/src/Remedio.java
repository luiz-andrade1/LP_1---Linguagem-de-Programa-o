import java.util.LinkedList;
import java.util.List;

public class Remedio {

    private String nomeRemedio = "Paracetamol";
    private String posologia = "Comprimido";
    private Integer quantidade = 19;
    private String efeitoColateral = "Sonolencia";

    public String getNomeRemedio() {
        return nomeRemedio;
    }
    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public String getPosologia() {
        return posologia;
    }
    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getEfeitoColateral() {
        return efeitoColateral;
    }
    public void setEfeitoColateral(String efeitoColateral) {
        this.efeitoColateral = efeitoColateral;
    }

    public Remedio(){}

    public void callPosologia() {
        System.out.println("O remédio é do tipo: "+posologia);
    }
    public void callQuantidade() {
        System.out.println("Restam em estoque: "+quantidade+" caixas.");
    }
    public void callEfeitos(){
        System.out.println("Os efeitos colaterais incluem: "+efeitoColateral);
    }
}




