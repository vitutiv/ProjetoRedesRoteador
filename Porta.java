public abstract class Porta {
    protected String id;
    protected int tamanho;
    protected int atraso;

    public Porta(String id, int tamanho, int atraso){
        this.id = id;
        this.tamanho = tamanho;
        this.atraso = atraso;
    }
}