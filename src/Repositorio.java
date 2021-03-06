import java.util.ArrayList;

public interface Repositorio{

    public void adicionaUtilizador(Utilizador utilizador);
    public void adicionaTipoUtilizador(TipoUtilizador tipo);
    public void adicionaRequisicao(Requisicao requisicao);
    public void adicionaCopia(Copia copia);
    public void adicionaLivro(Livro livro);
    public void adicionaEmprestimo(Emprestimo emprestimo);
    public void adicionaNotificacao(Notificacao notificacao);
    public void adicionaDevolucao(Devolucao devolucao);
    public void adicionaCoima(Coima coima);
    public void adicionaEncomenda(Encomenda encomenda);
    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    public void adicionaPropostaRequisicao(PropostaAquisicao proposta);
    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);
    public void adicionaRequisicaoCompraLivro(RequisicaoCompraLivro requisicaoCompraLivro);
    public void adicionaFuncionario(Funcionário funcionario);
    public void adicionaOrçamentos(Orçamento orçamento);
    public void adicionaReparadores(Reparador reparador);
    public void adicionaResponsavelReparaçao(ResponsávelReparação responsável_Reparação);
    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
}
