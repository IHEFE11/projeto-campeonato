import java.util.ArrayList;
import java.util.Random;

public class timeCasa extends time {
    private int gols;
    private ArrayList<Integer> tempo;

    public timeCasa() {
        this.tempo = new ArrayList<>();
        for(int i=0;i<10;i++){
        tempo.add(i*10);}
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
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
    int numeroSorteado= g.nextInt(10-5);
   if(numeroSorteado==0){
    gols+=1;
    System.out.println("gol aos "+tempo.get(i));
   }
}
    System.out.println("quantidade de gols "+gols);
    }
}
