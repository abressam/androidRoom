package br.com.alura.orgs.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.alura.orgs.database.dao.ProdutoDao
import br.com.alura.orgs.model.Produto

@Database(entities = [Produto::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun produtoDao(): ProdutoDao
}