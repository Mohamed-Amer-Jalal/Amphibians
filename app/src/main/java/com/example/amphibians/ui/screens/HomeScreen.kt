package com.example.amphibians.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.amphibians.R

@Composable
fun AmphibiansList() {
            AmphibianItem()

}

@Composable
fun AmphibianItem() {
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            painter =
            painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .padding(end = 16.dp),
            contentScale = ContentScale.Crop
        )
        Row {
            Text(text = "AMER")
        }
    }
}

@Preview
@Composable
fun AmphibiansListPreview() {
    AmphibiansList()
}