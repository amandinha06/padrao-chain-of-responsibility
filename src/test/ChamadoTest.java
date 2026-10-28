package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    FuncionarioAssistente assistente;
    FuncionarioAnalista analista;
    FuncionarioEspecialista especialista;

    @BeforeEach
    void setUp() {
        especialista = new FuncionarioEspecialista(null);
        analista = new FuncionarioAnalista(especialista);
        assistente = new FuncionarioAssistente(analista);
    }

    @Test
    void deveRetornarAssistenParaChamadoN1(){
        assertEquals("Assistente", assistente.atenderChamado(new Chamado(TipoChamadoN1.getTipoChamadoN1())));
    }

    @Test
    void deveRetornarAnalistaParaChamadoN2(){
        assertEquals("Analista",assistente.atenderChamado(new Chamado(TipoChamadoN2.getTipoChamadoN2())));
    }

    @Test
    void deveRetornarEspecialistaParaChamadoN3(){
        assertEquals("Especialista", assistente.atenderChamado(new Chamado(TipoChamadoN3.getTipoChamadoN3())));
    }

    @Test
    void deveRetornarNaoPodemosTeAtender(){
        assertEquals("Não podemos te atender!", assistente.atenderChamado(new Chamado(TipoChamadoOutro.getTipoChamadoOutro())));
    }

}