package padroescomportamentais.chainofresponsability;

public class TipoChamadoN2 implements TipoChamado{

    private static TipoChamadoN2 tipoChamadoN2 = new TipoChamadoN2();

    private TipoChamadoN2() {};

    public static TipoChamadoN2 getTipoChamadoN2() { return tipoChamadoN2; }
}
