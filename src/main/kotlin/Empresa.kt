open class Empresa (
    val nome:String,
    val faturamento:Double,
) : SimplesNacional, CalculaINSS, CalculaIRRF {

    var proLabore = setProLabore(faturamento)
    //    var fatorR = setFatorR(proLabore, faturamento)

    var anexo = setAnexo(faturamento, proLabore)
    // armazena a tabela de tributação - Anexo 1 a 5

    var faixaFaturamento = setFaixa(faturamento)
    // armazena a faixa de faturamento que determinará a aliquota básica e a parcela a deduzir

    var aliquotaBasica = setAliquotaBasica(anexo, faixaFaturamento)
    // armazena a aliquota básica considerando o anexo e a faixa de faturamento

    var parcelaDeducao = setParcelaDeducao(anexo, faixaFaturamento)
    // armazena a parcela de dedução considerando o anexo e a faixa de faturamento

    var aliquotaSN = setAliquotaEfetiva(faturamento, aliquotaBasica, parcelaDeducao)
    // armazena a alíquota efetiva a ser aplicada sobre o faturamento

    var simplesNacional = aliquotaSN*faturamento
    // armazena o valor do simples nacional a pagar

    var inssSimples = setINSSProLabore(proLabore)

    var baseIRRF = proLabore - inssSimples

    var irrfProLabore = setIRRFProLabore(baseIRRF)

    var totalSimplesNacional = simplesNacional + inssSimples + irrfProLabore

    var percentualTributacao = (totalSimplesNacional/faturamento)*100


}