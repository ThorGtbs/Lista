package devandroi.gabriel.lista.view

import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import control.controller
import devandroi.gabriel.lista.R
import model.Pessoa

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var nome: EditText
    lateinit var sobreNome: EditText
    lateinit var nomeCurso: EditText
    lateinit var telefone: EditText
    lateinit var limpar: Button
    lateinit var salvar: Button
    lateinit var botao3: Button
    lateinit var controlador : controller

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        texto = findViewById(R.id.textView2)
        nome = findViewById(R.id.primeiroNome)
        sobreNome = findViewById(R.id.sobrenome)
        nomeCurso = findViewById(R.id.nomeCurso)
        telefone = findViewById(R.id.telefone)
        limpar = findViewById(R.id.button1)
        salvar = findViewById(R.id.button2)
        botao3 = findViewById(R.id.button3)





        limpar.setOnClickListener(View.OnClickListener {

            nome.setText("")
            sobreNome.setText("")
            nomeCurso.setText("")
            telefone.setText("")
        })

        salvar.setOnClickListener(

            View.OnClickListener {

                var pessoa = Pessoa(
                    nome.text.toString(),
                    sobreNome.text.toString(),
                    nomeCurso.text.toString(),
                    telefone.text.toString()
                )
                controlador.save(pessoa)

                Toast.makeText(this, "" + pessoa.nome, Toast.LENGTH_SHORT).show()

            }
        )


    }


}