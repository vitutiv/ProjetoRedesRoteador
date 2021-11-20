public class PortaDeEntrada extends Porta{
    protected int probabilidadeDeDescarte;
    public PortaDeEntrada(String id, int tamanho, int atrasoDeGeracao, int probabilidadeDeDescarte){
        super(id,tamanho, atrasoDeGeracao);
        if (probabilidadeDeDescarte > 100 || probabilidadeDeDescarte < 0){
            //throw new Exception();
        }
        this.probabilidadeDeDescarte = probabilidadeDeDescarte;
    }
}