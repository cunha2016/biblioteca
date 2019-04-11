import com.sun.tools.corba.se.idl.constExpr.Not;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RepositorioMem implements Repositorio{
    private  ArrayList<Utilizador>  utilizadores = new ArrayList<>();
    private  ArrayList<TipoUtilizador>  tiposUtilizador = new ArrayList<>();
    private  ArrayList<Requisicao>  requisicoes = new ArrayList<>();
    private  ArrayList<Copia>  copias = new ArrayList<>();
    private  ArrayList<Livro>  livros = new ArrayList<>();
    private  ArrayList<Emprestimo>  emprestimos = new ArrayList<>();
    private  ArrayList<Notificacao>  notificacoes = new ArrayList<>();
    private  ArrayList<Devolucao>  devolucoes = new ArrayList<>();
    private  ArrayList<Coima>  coimas = new ArrayList<>();

    private ArrayList<PropostaAquisicao> propostasAquisicao = new ArrayList<>();
    private ArrayList<RequisicaoCompra> requisicoesCompra = new ArrayList<>();
    private ArrayList<Encomenda> encomendas = new ArrayList<>();
    private ArrayList<EntradaNovoLivro> entradasNovosLivros = new ArrayList<>();

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta){
        this.propostasAquisicao.add(proposta);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){
        this.requisicoesCompra.add(requisicaoCompra);
    }

    public void adicionaEncomenda(Encomenda encomenda){
        this.encomendas.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){
        this.entradasNovosLivros.add(entradaNovoLivro);
    }

    public  void adicionaUtilizador(Utilizador utilizador){
        utilizadores.add(utilizador);
    }

    public  void adicionaTipoUtilizador(TipoUtilizador tipo){
        tiposUtilizador.add(tipo);
    }

    public  void adicionaRequisicao(Requisicao requisicao){
        requisicoes.add(requisicao);
    }

    public  void adicionaCopia(Copia copia){
        copias.add(copia);
    }

    public  void adicionaLivro(Livro livro){
        livros.add(livro);
    }

    public  void adicionaEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public  void adicionaNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);
    }

    public  void adicionaDevolucao(Devolucao devolucao){
        devolucoes.add(devolucao);
    }

    public  void adicionaCoima(Coima coima){
        coimas.add(coima);
    }

    /**
     * Devolve o empréstimo a partir de uma Requisicao
     * @param r recebe a requisicao a pesquisar
     * @return Emprestimo associado à Requisicao pesquisada ou null caso esteja registada.
     */
    public  Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        for(Emprestimo e: emprestimos)
            if(r == e.getRequisicao()) return e;

        return null;
    }
}
