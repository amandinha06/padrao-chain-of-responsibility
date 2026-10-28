package padroescomportamentais.chainofresponsability;

public class TipoChamadoOutro implements TipoChamado{

    private static TipoChamadoOutro tipoChamadoOutro = new TipoChamadoOutro();

    private TipoChamadoOutro() {};

    public static TipoChamadoOutro getTipoChamadoOutro() { return tipoChamadoOutro;}
}
