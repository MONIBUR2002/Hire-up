package com.moniapps.hireup.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

data class AppColorScheme(
    val primary: Color,
    val secondary: Color,
    val onPrimary: Color,
    val background: Color,
    val surface: Color,
    val notebook: Color
)
data class AppTypography(
    val titleBold: TextStyle,
    val titleMain: TextStyle,
    val titleNormal: TextStyle,

)
val LocalAppColorScheme = staticCompositionLocalOf {
    AppColorScheme(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        onPrimary = Color.Unspecified,
        background = Color.Unspecified,
        surface = Color.Unspecified,
        notebook = Color.Unspecified
    )
}
val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        titleBold = TextStyle.Default,
        titleMain = TextStyle.Default,
        titleNormal = TextStyle.Default,

    )
}