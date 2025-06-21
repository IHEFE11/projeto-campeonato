
public class simularPartida {
    public timeCasa casa;
    public timeFora fora;

    public void comecarPartida(){
        timeCasa c= new timeCasa();
        c.MarcaGol();
        timeFora f= new timeFora();
        f.MarcaGol();
        System.out.print("placar CASA "+c.mostrarGolcasa()+" X "+f.mostrarGolfora()+" FORA");
    }

}
       