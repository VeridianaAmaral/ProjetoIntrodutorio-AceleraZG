import java.util.Date;


public class Tarefa implements Comparable<Tarefa> {
    private String Nome, Descricao, Categoria,Status;
    private Date DataTermino;
    private int Prioridade;


    public Tarefa() {

    }

    public Tarefa(String nome, String descricao, String categoria, Date dataTermino, int prioridade, String status) {
        this.Nome = nome;
        this.Descricao = descricao;
        this.Categoria = categoria;
        this.DataTermino = dataTermino;
        this.Prioridade = prioridade;
        this.Status = status;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Date getDataTermino() {
        return DataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        DataTermino = dataTermino;
    }

    public int getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(int prioridade) {
        Prioridade = prioridade;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "Nome='" + Nome + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", Categoria='" + Categoria + '\'' +
                ", DataTermino=" + DataTermino +
                ", Prioridade=" + Prioridade +
                ", Status=" + Status +
                '}';
    }


    @Override
    public int compareTo(Tarefa o) {
        if(Prioridade > o.Prioridade){
            return 1;
        }
        if(Prioridade< o.Prioridade){
            return -1;
        }
        else{
            return 0;
        }
    }
}
