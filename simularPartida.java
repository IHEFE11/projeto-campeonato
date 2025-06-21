
public class simularPartida extends time {
    public simularPartida(String nome, int qualidade) {
        super(nome, qualidade);
    }
 
    public void comecarPartida(){
        timeCasa c= new timeCasa();
        c.MarcaGol();
        timeFora f= new timeFora();
        f.MarcaGol();
        System.out.print("placar "+e1+" "+c.mostrarGolcasa()+" X "+f.mostrarGolfora()+" "+e7);
    }

}
       