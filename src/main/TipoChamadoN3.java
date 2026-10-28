package padroescomportamentais.chainofresponsability;

public class TipoChamadoN3 implements TipoChamado{

    private static TipoChamadoN3 tipoChamadoN3 = new TipoChamadoN3();

    private TipoChamadoN3() {};

    public static TipoChamadoN3 getTipoChamadoN3() { return tipoChamadoN3; }
}
