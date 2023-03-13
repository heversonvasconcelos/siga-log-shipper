package siga;

public enum Acao {

    VISUALIZAR(1, "V_isualizar", "/sigaex/app/arquivo/exibir"),
    VER_DOCUMENTO_COMPLETO(2, "_Ver Documento Completo", "/sigaex/app/expediente/doc/exibirProcesso"),

    HTML(500, "HTML", "/sigaex/app/expediente/doc/registrar_requisicao_usuario"),
    PDF(501, "PDF", "/sigaex/app/expediente/doc/registrar_requisicao_usuario"),
    PDF_SEM_MARCAS(502, "PDF Sem Marcas", "/sigaex/app/expediente/doc/registrar_requisicao_usuario"),
    TELA_CHEIA(503, "Tela Cheia", "/sigaex/app/expediente/doc/registrar_requisicao_usuario"),

    IMPRIMIR(1000, "Imprimir", "/sigaex/app/expediente/doc/registrar_requisicao_usuario"),
    DOWNLOAD(1001, "Download", "/sigaex/app/expediente/doc/registrar_requisicao_usuario"),

    DOCUMENTOS_SIGLA_GET(2000, "DocumentosSiglaGet", "/sigaex/api/v1/documentos/"),
    DOCUMENTOS_SIGLA_ARQUIVO_GET(2001, "DocumentosSiglaArquivoGet"),
    DOCUMENTOS_SIGLA_ARQUIVO_PRODUZIR_GET(2002, "DocumentosSiglaArquivoProduzirGet"),
    DOCUMENTOS_SIGLA_HTML_GET(2003, "DocumentosSiglaHtmlGet"),
    DOCUMENTOS_SIGLA_PDF_COMPLETO_GET(2004, "DocumentosSiglaPdfCompletoGet");

    private int id;
    private String descricao;

    private String uri;

    Acao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    Acao(int id, String descricao, String uri) {
        this.id = id;
        this.descricao = descricao;
        this.uri = uri;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUri() {
        return uri;
    }
}
