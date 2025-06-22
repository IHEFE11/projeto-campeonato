public class simularPartida {

    private timeCasa casa;
    private timeFora fora;

    public void comecarPartida(int c, int f) {
        time lista = new time("Dummy", 0);
        time t1 = lista.escolher(c);  
        time t2 = lista.escolher(f);  

        casa = new timeCasa(t1.getNome(), t1.getQualidade());
        fora = new timeFora(t2.getNome(), t2.getQualidade());

        casa.MarcaGol();
        fora.MarcaGol();

        System.out.println("Placar: " + casa + " " + casa.mostrarGolcasa() + " X " +
                fora.mostrarGolfora() + " " + fora);
    }
}
       