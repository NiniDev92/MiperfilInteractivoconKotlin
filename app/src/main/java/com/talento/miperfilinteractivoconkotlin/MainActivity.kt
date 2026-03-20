package com.talento.miperfilinteractivoconkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.talento.miperfilinteractivoconkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonPerfil.setOnClickListener {
            generarPerfil()
        }
    }

    private fun generarPerfil() {
        val nombre = binding.editNombre.text.toString().trim()
        val edadTexto = binding.editEdad.text.toString().trim()

        if (nombre.isEmpty() || edadTexto.isEmpty()) {
            binding.textResultado.text = getString(R.string.error_campos_obligatorios)
            return
        }

        val edad = edadTexto.toIntOrNull()
        if (edad == null || edad <= 0) {
            binding.textResultado.text = getString(R.string.error_edad_invalida)
            return
        }

        val profesion = obtenerProfesionSeleccionada()
        var mensajePerfil = getString(R.string.mensaje_experiencia, nombre, profesion)
        if (edad < 18) {
            mensajePerfil = getString(R.string.mensaje_joven, nombre, profesion)
        } else if (edad in 18..25) {
            mensajePerfil = getString(R.string.mensaje_formacion, nombre, profesion)
        } else if (edad in 26..40) {
            mensajePerfil = getString(R.string.mensaje_activo, nombre, profesion)
        }

        binding.textResultado.text = mensajePerfil
    }

    private fun obtenerProfesionSeleccionada(): String {
        return when (binding.radioGrupoProfesion.checkedRadioButtonId) {
            R.id.radioEstudiante -> getString(R.string.profesion_estudiante)
            R.id.radioDesarrollador -> getString(R.string.profesion_desarrollador)
            R.id.radioProfesor -> getString(R.string.profesion_profesor)
            else -> getString(R.string.profesion_sin_especificar)
        }
    }
}
