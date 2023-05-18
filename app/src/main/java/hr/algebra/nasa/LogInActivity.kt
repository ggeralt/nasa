package hr.algebra.nasa

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import hr.algebra.nasa.databinding.ActivityLoginScreenBinding

class LogInActivity : AppCompatActivity() {
    private val fileName = "login.txt"
    private lateinit var binding: ActivityLoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = binding.usernameInput.text
        val password = binding.passwordInput.text

        binding.buttonSignUp.setOnClickListener {
            if (username.isNotEmpty() && password.isNotEmpty()) {
                writeCredentials()
                //File(fileName).writeText(username.toString())
                //Toast.makeText(this, "All good.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Auth criteria not met.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun writeCredentials() {

    }
}