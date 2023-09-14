package com.example.myapplication.ui.theme.homescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.homescreen.ui.theme.MyApplicationTheme


class homescreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            home()

        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun home (){

    Image(painter = painterResource(id = R.drawable.back), contentDescription = null)
    Column(

        modifier = Modifier
//            .background(Color.Black)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){

        Text(text = "Login Here",
            color = Color.White,
            fontSize = 30.sp)

        var usernamee by remember {
            mutableStateOf(TextFieldValue(""))

        }
        var password by remember {
            mutableStateOf(TextFieldValue(""))

        }

        TextField(
            value = usernamee,
            label = { Text("username",color= Color.Black) },
            leadingIcon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "emailIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
                usernamee= it
            })

        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value = password,
            label = { Text("", color = Color.Black) },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {
                password= it
            })

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = password,
            label = { Text("password", color = Color.Black) },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {
                password= it
            })


        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.DarkGray)

        ) {
            Text(text = "Login")
        }

        Text(
            text = "Dont have an account ? sign up ",
           modifier = Modifier
               .padding(4.dp)
               .clickable {

               },

        )



    }
}