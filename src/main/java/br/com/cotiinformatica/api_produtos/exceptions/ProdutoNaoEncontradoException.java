package br.com.cotiinformatica.api_produtos.exceptions;

public class ProdutoNaoEncontradoException extends RuntimeException {

    //Implementar o método para retornar a mensagem de erro

    //Retornar a mensagem de erro

    @Override
    public String getMessage() {
        return "Produto não encontrado. Verifique o ID informado.";
    }
}
