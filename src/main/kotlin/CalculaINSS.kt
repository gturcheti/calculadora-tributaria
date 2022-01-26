interface CalculaINSS {

    fun setINSSProLabore(valorBase: Double): Double {

        val lim1: Double = 1212.00
        val lim2: Double = 2427.35
        val lim3: Double = 3641.03
        val lim4: Double = 7087.22
        val al1: Double = .075
        val al2: Double = .09
        val al3: Double = .12
        val al4: Double = .14

        if (valorBase <= lim1)
            return valorBase * al1
        if (valorBase <= lim2)
            return (lim1*al1) + (valorBase-lim1)*al2
        if (valorBase <= lim3)
            return (lim1*al1) + (lim2-lim1)*al2 + (valorBase-lim2)*al3
        if (valorBase <= lim4)
            return (lim1*al1) + (lim2-lim1)*al2 + (lim3-lim2)*al3 + (valorBase-lim3)*al4
        else
            return (lim1*al1) + (lim2-lim1)*al2 + (lim3-lim2)*al3 + (lim4-lim3)*al4

    }

}