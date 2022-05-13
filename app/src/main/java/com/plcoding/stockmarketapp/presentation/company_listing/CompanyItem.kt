package com.plcoding.stockmarketapp.presentation.company_listing

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.stockmarketapp.domain.model.CompanyListing


@Composable
fun CompanyItem(
    company: CompanyListing,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
    )
}