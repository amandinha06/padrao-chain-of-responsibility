package padroescomportamentais.chainofresponsability;

public class TipoChamadoN1 implements TipoChamado{

    private static TipoChamadoN1 tipoChamadoN1 = new TipoChamadoN1();

    private TipoChamadoN1() {};

    public static TipoChamadoN1 getTipoChamadoN1() { return tipoChamadoN1; }

}
