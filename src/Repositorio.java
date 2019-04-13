import java.util.ArrayList;

public interface Repositorio{

    public abstract void adicionaUtilizador(Utilizador utilizador);
    public abstract void adicionaTipoUtilizador(TipoUtilizador tipo);
    public abstract void adicionaRequisicao(Requisicao requisicao);
    public abstract void adicionaCopia(Copia copia);
    public abstract void adicionaLivro(Livro livro);
    public abstract void adicionaEmprestimo(Emprestimo emprestimo);
    public abstract void adicionaNotificacao(Notificacao notificacao);
    public abstract void adicionaDevolucao(Devolucao devolucao);
    public abstract void adicionaCoima(Coima coima);
    public abstract void adicionaEncomenda(Encomenda encomenda);
    public abstract void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    public abstract void adicionaPropostaRequisicao(PropostaAquisicao proposta);
    public abstract void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);
    public abstract void adicionaRequisicaoCompraLivro(RequisicaoCompraLivro requisicaoCompraLivro);
    public abstract Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
}
