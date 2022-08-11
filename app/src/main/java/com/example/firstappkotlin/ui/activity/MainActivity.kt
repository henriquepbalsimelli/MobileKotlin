package com.example.firstappkotlin.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstappkotlin.R
import com.example.firstappkotlin.model.Produto
import com.example.firstappkotlin.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    // Activity pode gerar imcompatibilidade, pois herda sempre do skd mais novo do Android
    // Pra isso usamos o AppCompatActivity, que vem do AndroidX

    override fun onCreate(savedInstanceState: Bundle?) {
        // a partir do R eu consigo acessar tudo que eu tenho na pasta res
        // Abaixo estou me comunicando com a view (bind de views)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "teste",
                descricao = "teste_desc",
                valor = BigDecimal(19.00)
            ),
            Produto(
                nome = "teste1",
                descricao = "teste_desc2",
                valor = BigDecimal(20.00)
            ),Produto(
                nome = "teste1",
                descricao = "teste_desc2",
                valor = BigDecimal(20.00)
            ),Produto(
                nome = "teste1",
                descricao = "teste_desc2",
                valor = BigDecimal(20.00)
            ),
        ))
        // Posso colocar o layout manager aqui ou la no layout com: app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        fab.setOnClickListener{
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
        // Padrão DAO - Data access object

    }
}