fun testaSimples() {


    val lais = Empresa(
        "Lais",
        16000.00,
    )

    println("Considerando o faturamento informado de R$ ${lais.faturamento}:")
    println()
    println("Foi fixada uma pro-labore no valor de R$ ${lais.proLabore}")
    println("A alíquota do Simples Nacional é de " + (lais.aliquotaSN * 100) + " %")
    println("O Valor do Simples Nacional será R$ ${lais.simplesNacional}")


}