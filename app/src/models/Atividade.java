import java.util.Date;

/**
 * Created by ricardo on 10/04/15.
 */
public class Atividade {
    private String nome;
    private String descricao;
    private String status;
    private Date dataRegistro;
    private Date dataFinal;

    public Atividade(String nome, String descricao, String status, Date dataRegistro, Date dataFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dataRegistro = dataRegistro;
        this.dataFinal = dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
