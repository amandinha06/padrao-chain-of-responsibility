package padroescomportamentais.chainofresponsability;

public class FuncionarioAssistente extends Funcionario{

    public FuncionarioAssistente(Funcionario superior) {
        listaChamados.add(TipoChamadoN1.getTipoChamadoN1());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {return "Assistente";}
}
