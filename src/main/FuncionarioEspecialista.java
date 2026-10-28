package padroescomportamentais.chainofresponsability;

public class FuncionarioEspecialista extends Funcionario{

    public FuncionarioEspecialista(Funcionario superior) {
        listaChamados.add(TipoChamadoN3.getTipoChamadoN3());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {return "Especialista" ;}
}
