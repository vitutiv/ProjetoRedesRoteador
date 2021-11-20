public class PortaDeSaida extends Porta{
    protected int probabilidadeDeRetransmissao;
    protected int probabilidadeDeEncaminhamento;
    
    public PortaDeSaida(String id, int tamanho, int atrasoDeRetransmissao, int probabilidadeDeRetransmissao, int probabilidadeDeEncaminhamento){
        super(id,tamanho, atrasoDeRetransmissao);
        if (probabilidadeDeEncaminhamento > 100 || probabilidadeDeRetransmissao > 100 || probabilidadeDeEncaminhamento < 0 || probabilidadeDeRetransmissao < 0){
            //throw new Exception();
        }
        this.probabilidadeDeRetransmissao = probabilidadeDeRetransmissao;
        this.probabilidadeDeEncaminhamento = probabilidadeDeEncaminhamento;
    }
}