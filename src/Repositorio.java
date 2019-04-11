public interface Repositorio {
    public void adicionaPropostaRequisicao(PropostaAquisicao proposta);

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

    public void adicionaEncomenda(Encomenda encomenda);

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

    public  void adicionaUtilizador(Utilizador utilizador);

    public  void adicionaTipoUtilizador(TipoUtilizador tipo);

    public  void adicionaRequisicao(Requisicao requisicao);

    public  void adicionaCopia(Copia copia);

    public  void adicionaLivro(Livro livro);

    public  void adicionaEmprestimo(Emprestimo emprestimo);

    public  void adicionaNotificacao(Notificacao notificacao);

    public  void adicionaDevolucao(Devolucao devolucao);

    public  void adicionaCoima(Coima coima);

    public  Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);

}
