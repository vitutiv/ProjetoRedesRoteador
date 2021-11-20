public class Pacote {
    protected String porta;
    protected int ordem;
    protected DateTime tempo;

    public Pacote(String porta, int ordem, DateTime tempo){
        this.porta = porta;
        this.ordem = ordem;
        this.tempo = tempo;
    }

    public override String toString(){
        return porta + " " + ordem  + " " + tempo.toString();
    }

    public void atualizarMarcador(DateTime novoTempo){
        tempo = novoTempo;
    }
}