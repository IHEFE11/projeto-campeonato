
public class  time {
    private String nome;
    private int qualidade;

    public time(String nome, int qualidade) {
        this.nome = nome;
        this.qualidade = qualidade;
    }
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
    static time e1= new time("Brasil", 5);
    static time e2= new time("Inglaterra", 4);
    static time e3= new time("Equador", 3);
    static time e4= new time("Alemanha", 4);
    static time e5= new time("Bolivia", 2);
    static time e6= new time("Japao", 2);
    static time e7= new time("Argentina", 5);
    static time e8= new time("Franca", 5);
    
    static time[] listaTimes= {e1,e2,e3,e4,e5,e6,e7,e8};

    @Override
    public String toString() {
        return nome;
    }

}