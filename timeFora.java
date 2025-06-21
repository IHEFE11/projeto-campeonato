import java.util.ArrayList;
import java.util.Random;

public class timeFora extends time {

    private int golsfora;
    private ArrayList<Integer> tempo;

    public timeFora() {
        this.tempo = new ArrayList<>();
        for(int i=0;i<10;i++){
        tempo.add(i*10);}
    }

    public int getgolsfora() {
        return golsfora;
    }

    public void setGols(int golsfora) {
        this.golsfora = golsfora;
    }

    public ArrayList<Integer> getTempo() {
        return tempo;
    }

    public void setTempo(ArrayList<Integer> tempo) {
        this.tempo = tempo;
    }

    @Override
    public void MarcaGol() {
   Random g= new Random();
   for(int i=0;i<tempo.size();i++){
    int numeroSorteado= g.nextInt(10-getQualidade());
   if(numeroSorteado==0){
    golsfora+=1;
    System.out.println("gol do time fora aos "+tempo.get(i));
   }
}
    System.out.println("quantidade de gols "+golsfora);
    }
    public int mostrarGolfora(){
    return getgolsfora();
}
}


