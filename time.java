
public class  time {
    private String nome;
    private int qualidade;
    private time equipe;

    
    public time(String nome, int qualidade) {
        this.nome = nome;
        this.qualidade = qualidade;
    }
    public time getEquipe() {
        return equipe;
    }
    public void setEquipe(int i) {
        this.equipe = equipe.escolher(i);
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
        public time escolher(int i){
        time t[]=new time[8];
        t[0]= new time("Brasil", 5);
        t[1]= new time("Inglaterra", 4);
        t[2]= new time("Equador", 3);
        t[3]= new time("Alemanha", 4);
        t[4]= new time("Bolivia", 2);
        t[5]= new time("Japao", 2);
        t[6]= new time("Argentina", 5);
        t[7]= new time("Franca", 5);
        return t[i];
         }
    @Override
    public String toString() {
        return nome;
    }

}