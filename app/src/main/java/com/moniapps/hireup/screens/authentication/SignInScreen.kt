package com.moniapps.hireup.screens.authentication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moniapps.hireup.R
import com.moniapps.hireup.ui.theme.AppTheme
import com.moniapps.hireup.ui.theme.LightBlue
import com.moniapps.hireup.ui.theme.OceanPurple
import com.moniapps.hireup.ui.theme.SalmonPink


@Composable
fun SignInScreen(modifier: Modifier = Modifier) {
    var showPassword by remember { mutableStateOf(false) }
    var checked by remember { mutableStateOf(false) }
    val systemTheme = isSystemInDarkTheme()
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {
            Text(
                modifier = modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 16.dp, vertical = 24.dp),
                text = "Sign in now",
                fontSize = 38.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colorScheme.secondary
            )
            Text(
                modifier = modifier
                    .align(Alignment.Start)
                    .padding(start = 16.dp),
                text = "Welcome back,\nyou have been missed!",
                fontSize = 22.sp,
                color = AppTheme.colorScheme.secondary.copy(alpha = .6f),
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = modifier.height(60.dp))
            OutlinedTextField(
                shape = RoundedCornerShape(10.dp),
                value = "",
                onValueChange = {},
                label = { Text(text = "Enter your email", fontSize = 16.sp) },
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
            Spacer(modifier = modifier.height(28.dp))
            OutlinedTextField(
                shape = RoundedCornerShape(10.dp),
                value = "",
                onValueChange = {},
                label = { Text(text = "Password", fontSize = 16.sp) },
                trailingIcon = {
                    IconButton(
                        modifier = modifier.padding(end = 8.dp), onClick = {
                            showPassword = !showPassword
                        }) {
                        Icon(
                            modifier = modifier.size(25.dp),
                            painter = painterResource(
                                if (showPassword) R.drawable.show
                                else R.drawable.hide
                            ),
                            contentDescription = "show & hide password"
                        )
                    }
                },
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
            Spacer(modifier = modifier.height(20.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 16.dp)
            ) {
                Checkbox(
                    checked = checked,
                    onCheckedChange = {
                        checked = !checked
                    },

                    )
                Text(
                    text = "Remember me",
                    fontSize = 16.sp,
                    color = AppTheme.colorScheme.secondary.copy(alpha = .6f)
                )
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "Forgot password?",
                    fontSize = 16.sp,
                    color = AppTheme.colorScheme.secondary.copy(alpha = .6f)
                )
            }
            Spacer(modifier = modifier.height(40.dp))
            Button(
                onClick = {

                },
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Sign In",
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal
                )
            }
            Spacer(modifier = modifier.height(60.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(20.dp)

            ) {

                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                        .weight(1f)
                ) {
                    drawLine(
                        brush = Brush.linearGradient(
                            start = Offset(0f, 0f),
                            end = Offset(size.width, 0f),
                            colors = if (systemTheme) listOf(
                                Color.Transparent,
                                Color.White
                            ) else listOf(Color.Transparent, Color.Black)
                        ),
                        start = Offset(x = 0f, y = size.height / 2),
                        end = Offset(x = size.width, y = size.height / 2),
                        strokeWidth = 2.dp.toPx()
                    )
                }
                Text(
                    modifier = modifier
                        .padding(horizontal = 8.dp)
                        .weight(1.5f),
                    text = "Or continue with",
                    color = AppTheme.colorScheme.secondary.copy(alpha = .7f),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )

                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .rotate(180f)
                        .height(20.dp)
                        .weight(1f)
                ) {
                    drawLine(
                        brush = Brush.linearGradient(
                            start = Offset(0f, 0f),
                            end = Offset(size.width, 0f),
                            colors = if (systemTheme) listOf(
                                Color.Transparent,
                                Color.White
                            ) else listOf(Color.Transparent, Color.Black)
                        ),
                        start = Offset(x = 0f, y = size.height / 2),
                        end = Offset(x = size.width, y = size.height / 2),
                        strokeWidth = 2.dp.toPx()
                    )
                }
            }
            Spacer(modifier = modifier.height(60.dp))
            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = SalmonPink.copy(alpha = .1f)
                ),
                border = BorderStroke(width = 1.dp /2, color = AppTheme.colorScheme.secondary)
            ) {
                Row(
                    modifier = modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Absolute.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = modifier.padding(end = 20.dp),
                        painter = painterResource(R.drawable.google),
                        contentDescription = "login with google"
                    )
                    Text(
                        modifier = modifier,
                        text = "Sign in with Google",
                        fontSize = 16.sp,
                        color = AppTheme.colorScheme.secondary
                    )
                }
            }
            Spacer(modifier = modifier.height(40.dp))
            Row {
                Text(
                    fontSize = 18.sp,
                    text = "Don't have an account?",
                    color = AppTheme.colorScheme.secondary
                )
                Text(fontSize = 18.sp, text = " Register", color = OceanPurple)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun SignInScreenPreview() {
    SignInScreen()
}