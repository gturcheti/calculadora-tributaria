interface CalculaIRRF {
}

fun setIRRFProLabore(valorBase: Double): Double {

    val lim1: Double = 1903.98
    val lim2: Double = 2826.65
    val lim3: Double = 3751.05
    val lim4: Double = 4664.68
    val al1: Double = .075
    val al2: Double = .15
    val al3: Double = .225
    val al4: Double = .275

    if (valorBase <= lim1)
        return 0.00
    if (valorBase <= lim2)
        return (valorBase-lim1)*al1
    if (valorBase <= lim3)
        return (lim2-lim1)*al1 + (valorBase-lim2)*al2
    if (valorBase <= lim4)
        return (lim2-lim1)*al1 + (lim3-lim2)*al2 + (valorBase-lim3)*al3
    else
        return (lim2-lim1)*al1 + (lim3-lim2)*al2 + (lim4-lim3)*al3 + (valorBase-lim4)*al4
}