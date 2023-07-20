package br.com.alura.orgs.database.converter

import androidx.room.TypeConverter
import java.math.BigDecimal

class Converters {
    @TypeConverter
    fun deDouble(valor: Double?) : BigDecimal {
        return valor?.let { BigDecimal(valor.toString()) } ?: BigDecimal.ZERO // recebe double e retorna bigDecimal
    }
    @TypeConverter
    fun bigDecimalParaDouble(valor: BigDecimal?) : Double? {
        return valor?.let { valor.toDouble() } // recebe bigDecimal e retorna double
    }
}