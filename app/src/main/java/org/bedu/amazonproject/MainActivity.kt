package org.bedu.amazonproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    //Declare login button
    private lateinit var login: Button
    //Declare variables for saving input fields values
    private lateinit var fullName: EditText
    private lateinit var lastName: EditText
    private lateinit var phoneNumber: EditText
    private lateinit var emailAddress: EditText
    //Declare image element
    private lateinit var loginSuccessful: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get elements values
        login = findViewById(R.id.login)
        fullName = findViewById(R.id.full_name)
        lastName = findViewById(R.id.last_name)
        phoneNumber = findViewById(R.id.phone_number)
        emailAddress = findViewById(R.id.email)
        loginSuccessful = findViewById(R.id.login_successful)

        login.setOnClickListener {
            //Check to see if elements are empty
            if (fullName.text.toString().isEmpty() || lastName.text.toString().isEmpty() || phoneNumber.text.toString().isEmpty() || emailAddress.text.toString().isEmpty())
                loginSuccessful.setImageResource(R.drawable.wrong)
            else
                loginSuccessful.setImageResource(R.drawable.correct)
        }
    }
}