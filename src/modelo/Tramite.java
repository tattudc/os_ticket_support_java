package modelo;

/**
 *
 * @author Neto
 */
public class Tramite {
    private Integer id;
    private String descricao;
    private String situacao;

    public Tramite(String descricao, String situacao) {
        this.descricao = descricao;
        this.situacao = situacao;
    }
  
    public Integer getId(){
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Tramites{" + "descricao=" + descricao + ", situacao=" + situacao + '}';
    }       
}
