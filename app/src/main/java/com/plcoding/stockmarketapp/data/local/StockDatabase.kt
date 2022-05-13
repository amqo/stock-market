package com.plcoding.stockmarketapp.data.local

import androidx.room.Database
import com.plcoding.stockmarketapp.data.remote.dto.StockDao

@Database(
    entities = [CompanyListingEntity::class],
    version = 1
)
abstract class StockDatabase {

    abstract val dao: StockDao
}