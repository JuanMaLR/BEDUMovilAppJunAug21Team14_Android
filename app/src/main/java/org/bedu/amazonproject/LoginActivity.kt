package org.bedu.amazonproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    //Get elements reference
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Get elements reference once they have been rendered
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.login_button)

        //Add listener to the login button
        loginButton.setOnClickListener {
            //Verify email address structure
            if (!isEmailValid(email.text.toString()))
                email.error = "Email structure invalid"
            //Verify credentials
        }
    }

    //To check to see if the email structure is valid
    private fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    //To verify the user exists in the system
    

}