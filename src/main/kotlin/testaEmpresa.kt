fun testaSimples() {


    val lais = Empresa(
        "Lais",
        6000.00,
    )

    println("Considerando o faturamento informado de R$ ${lais.faturamento}:")
    println()
    println("Foi fixada uma pro-labore no valor de R$ ${lais.proLabore}")
    println("INSS: R$ ${lais.inssSimples}")
    println("IRRF: R$ ${lais.irrfProLabore}")
    println("A alíquota do Simples Nacional é de " + (lais.aliquotaSN * 100) + " %")
    println("O Valor do Simples Nacional será R$ ${lais.simplesNacional}")
    println()
    println("O valor total recolhido de impostos no Simples Nacional é de R$ ${lais.totalSimplesNacional}")
    println("O percentual de tributos corresponde a ${lais.percentualTributacao} %")


}