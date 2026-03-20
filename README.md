Mi Perfil Interactivo con Kotlin
Aplicacion Android en Kotlin que resuelve la actividad "M5_AE1 - El entorno Kotlin".
Objetivo cumplido
La app permite:

Ingresar nombre y edad.

Seleccionar profesion (Estudiante, Desarrollador/a, Profesor/a).

Generar un perfil con mensaje dinamico segun rango de edad y profesion.

Validar entradas vacias y edad invalida.
Requisitos de la actividad implementados

lateinit: se usa en ActivityMainBinding.

val y var: se usan para capturar datos y construir mensaje.

Condicionales if y when.

Funciones personalizadas: generarPerfil() y obtenerProfesionSeleccionada().

toIntOrNull() para conversion segura de edad.

View Binding habilitado y utilizado.

Eventos multiples desde UI (campos, radio group, boton).
Tecnologias y configuracion
•
Android Gradle Plugin: 9.0.1
•
Gradle Wrapper: 9.2.1
•
compileSdk: 36
•
minSdk: 30
•
targetSdk: 36
•
Dependencias principales:
◦
androidx.core:core-ktx
◦
androidx.appcompat:appcompat
◦
com.google.android.material:material
◦
androidx.constraintlayout:constraintlayout
Estructura principal
•
app/src/main/java/com/talento/miperfilinteractivoconkotlin/MainActivity.kt
•
app/src/main/res/layout/activity_main.xml
•
app/src/main/res/values/strings.xml
•
app/src/main/AndroidManifest.xml
Como compilar
Desde la raiz del proyecto:
.\gradlew.bat assembleDebug
APK generado:
app/build/outputs/apk/debug/app-debug.apk
Instalacion en dispositivo real (ADB)
1.
Verificar equipo conectado:
adb devices -l
2.
Instalar/reinstalar APK:
adb install -r app\build\outputs\apk\debug\app-debug.apk
3.
Abrir app:
adb shell am start -n com.talento.miperfilinteractivoconkotlin/.MainActivity
Validacion ejecutada (real)
Fecha de prueba: 2026-03-04
Dispositivo detectado por ADB:
•
Serial: ZT322BT2LV
•
Modelo: moto_g_20_
Evidencia tecnica
•
Compilacion: BUILD SUCCESSFUL.
•
Instalacion: Success.
•
Lanzamiento: START_SUCCESS y Displayed com.talento.miperfilinteractivoconkotlin/.MainActivity.
•
Logcat: sin FATAL EXCEPTION ni AndroidRuntime asociados al proceso de la app.
Prueba funcional automatizada por ADB
Se ejecuto ingreso de datos en dispositivo:
•
Nombre: Nicole
•
Edad: 33
•
Profesion: Desarrollador/a
•
textResultado: "Hola Nicole, un/a Desarrollador/a en plena formacion."
Esto confirma que la logica condicional y la actualizacion dinamica de interfaz funcionan correctamente.
Comportamiento esperado de validaciones
