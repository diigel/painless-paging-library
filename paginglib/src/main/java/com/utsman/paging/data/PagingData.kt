package com.utsman.paging.data

import com.utsman.paging.datasource.PagingDataSource

data class PagingData<T>(
    @JvmField
    internal var dataSource: PagingDataSource<T>? = null,
    @JvmField
    internal var items: List<T> = emptyList(),
    @JvmField
    internal var throwable: Throwable? = null
)