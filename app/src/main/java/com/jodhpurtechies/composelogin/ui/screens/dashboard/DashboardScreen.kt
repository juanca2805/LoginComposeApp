package com.jodhpurtechies.composelogin.ui.screens.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.jodhpurtechies.composelogin.R
import com.jodhpurtechies.composelogin.ui.common.customComposableViews.TitleText

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleText(
            text = stringResource(id = R.string.dashboard_title_welcome_user), style = TextStyle(
                fontSize = 24.sp, // Cambia este valor al tamaño que desees
                textAlign = TextAlign.Center // Centra el texto
            )
        )
    }
}