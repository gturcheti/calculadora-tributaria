interface SimplesNacional {

    fun setProLabore(faturamento:Double) : Double {
    return faturamento*.28
    }

    fun setFatorR(proLabore:Double, faturamento:Double) : Double {
        return proLabore/faturamento
    }

    fun setAnexo(faturamento: Double, proLabore:Double): Int {
        var fatorR = proLabore/faturamento
        if (fatorR >= .28)
            return 3
        else return 5
    }

    fun setFaixa(faturamento: Double): Int {
        when (faturamento*12) {
            in 0.01..180000.00 -> return 1
            in 180000.01..360000.00 -> return 2
            in 360000.01..720000.00 -> return 3
            in 720000.01..1800000.00 -> return 4
            in 1800000.01..3600000.00 -> return 5
            in 3600000.01..4800000.00 -> return 6
            else -> return 0
        }
    }

    fun setAliquotaBasica(anexo: Int, faixa: Int): Double {
        if (anexo == 3) {
            when (faixa) {
                1 -> return .06
                2 -> return .112
                3 -> return .135
                4 -> return .16
                5 -> return .21
                6 -> return .33
                else -> return 0.00
            }
        } else if (anexo ==5 ) {
            when (faixa) {
                1 -> return .155
                2 -> return .18
                3 -> return .195
                4 -> return .205
                5 -> return .23
                6 -> return .305
                else -> return 0.00
            }
        } else return 0.00
    }

    fun setParcelaDeducao(anexo: Int, faixa: Int): Double {
        if (anexo == 3) {
            when (faixa) {
                2 -> return 9360.00
                3 -> return 17640.00
                4 -> return 35640.00
                5 -> return 125640.00
                6 -> return 648000.00
                else -> return 0.00
            }
        } else if (anexo == 5){
            when (faixa) {
                2 -> return 4500.00
                3 -> return 9900.00
                4 -> return 17100.00
                5 -> return 62100.00
                6 -> return 540000.00
                else -> return 0.00
            }
        } else {
            return 0.00
        }
    }

    fun setAliquotaEfetiva(faturamento:Double, aBasica: Double, pDeducao: Double) : Double {
        val rbt12 = faturamento*12
        return (((rbt12 * aBasica) - pDeducao) / rbt12)
    }
}
