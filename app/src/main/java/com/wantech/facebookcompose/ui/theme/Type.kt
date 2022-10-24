package com.wantech.facebookcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.wantech.facebookcompose.R


private val applyFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.helvetica_bold,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.helvetica_light,
            weight = FontWeight.Light,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.helvetica,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.helvetica_rounded_bold,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Normal
        )
    )
)

private val defaultTypography = Typography()


// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = applyFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    h1 = defaultTypography.h1.copy(fontFamily = applyFontFamily),
    h2 = defaultTypography.h2.copy(fontFamily = applyFontFamily),
    h3 = defaultTypography.h3.copy(fontFamily = applyFontFamily),
    h4 = defaultTypography.h4.copy(fontFamily = applyFontFamily),
    h5 = defaultTypography.h5.copy(fontFamily = applyFontFamily),
    h6 = defaultTypography.h6.copy(fontFamily = applyFontFamily),
    subtitle1 = defaultTypography.subtitle1.copy(fontFamily = applyFontFamily),
    subtitle2 = defaultTypography.subtitle2.copy(fontFamily = applyFontFamily),
    body2 = defaultTypography.body2.copy(fontFamily = applyFontFamily),
    button = defaultTypography.button.copy(fontFamily = applyFontFamily),
    caption = defaultTypography.caption.copy(fontFamily = applyFontFamily),
    overline = defaultTypography.overline.copy(fontFamily = applyFontFamily),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

)