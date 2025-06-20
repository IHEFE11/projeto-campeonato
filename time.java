public abstract class  time {
    private String nome;
    private int qualidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQualidade() {
        return qualidade;
    }
    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public abstract void MarcaGol();
}