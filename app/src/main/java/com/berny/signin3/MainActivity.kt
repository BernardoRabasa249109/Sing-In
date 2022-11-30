package com.berny.signin3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.berny.signin3.ui.theme.SignIn3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignIn3Theme {
                SignInActivityScreen()
            }
        }
    }
}

@Composable
private fun SignInActivityScreen(){
    SignIn()
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSignIn() {
    SignIn3Theme {
        SignInActivityScreen()
    }
}
