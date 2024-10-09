   fun sortear(view: View){
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        val numero = java.util.Random().nextInt(11)
        textoResultado.setText("número gerado $numero")
    }
}
