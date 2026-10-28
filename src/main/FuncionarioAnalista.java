package padroescomportamentais.chainofresponsability;

public class FuncionarioAnalista extends Funcionario{

    public FuncionarioAnalista(Funcionario superior){
        listaChamados.add(TipoChamadoN2.getTipoChamadoN2());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo(){return "Analista"; }
}
