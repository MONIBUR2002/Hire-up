package com.moniapps.hireup.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

private val darkColorScheme = AppColorScheme(
    background = DarkBackground,
    surface = DarkSurface,
    primary = DarkOnPrimary,
    secondary = DarkSecondary,
    onPrimary = DarkOnPrimary,
    notebook = DarkNotebookColor
)
private val lightColorScheme = AppColorScheme(
    background = LightBackground,
    surface = LightSurface,
    primary = LightOnPrimary,
    secondary = LightSecondary,
    onPrimary = LightOnPrimary,
    notebook = LightNotebookColor
)
private val typography = AppTypography(
    titleBold = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Bold,
    ),
    titleMain = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
    ),
    titleNormal = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
    )

)

@Composable
fun AppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkTheme) darkColorScheme else lightColorScheme
    CompositionLocalProvider(
        LocalAppColorScheme provides colorScheme,
        LocalAppTypography provides typography,
        content = content
    )
}

object AppTheme {
    val colorScheme: AppColorScheme
        @Composable
        get() = LocalAppColorScheme.current
    val typography: AppTypography
        @Composable
        get() = LocalAppTypography.current
}