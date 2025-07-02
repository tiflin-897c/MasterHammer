# 📚 Master Hammer - Companion App para Warhammer Fantasy 4ª Edición


**Master Hammer** es una aplicación móvil desarrollada en **Kotlin + Android Studio** que sirve como herramienta de apoyo para jugadores y directores de juego de **Warhammer Fantasy 4ª Edición**. Esta app permite consultar armas, reglas, tiradas, trasfondo del mundo, y hasta generar contenido aleatorio para improvisar aventuras.
![master_hammer](https://github.com/user-attachments/assets/2efdd02e-430f-4008-99f2-cea1295f43f2)

## 🎯 Objetivo

Modernizar el acceso a la información del manual de Warhammer Fantasy y facilitar la experiencia de juego desde un dispositivo móvil, tanto para jugadores novatos como veteranos.

---

## 🧩 Funcionalidades

- 🔪 **Armas**: Consultar todas las armas del juego (cuerpo a cuerpo, distancia y munición) almacenadas en SQLite con filtros por tipo. Cada arma incluye sus cualidades.
- 📜 **Normas**: Acceso a resúmenes de reglas en HTML. Secciones: *Creación de personajes, Combate, Destino y resiliencia, Estados*.
- 🎲 **Tiradas**: Dado virtual 1d100 que compara el resultado con el nivel de habilidad introducido. Muestra éxito o fracaso.
- 🌍 **El Mundo**: Información organizada por *Geografía, Trasfondo, Caos* y *Facciones*.
- 🌱 **Semillas**: Generador aleatorio de ideas de partida, PNJ, enemigos y poblaciones.
- ⚔️ **Cualidades y Defectos**: Consulta completa de todas las cualidades de armas del juego.

---

## 🖥️ Tecnologías utilizadas

- **Kotlin** - Lógica de programación.
- **Android Studio** - IDE de desarrollo.
- **SQLite** - Almacenamiento local de armas y cualidades.
- **HTML/CSS** - Formato de visualización de texto.
- **RecyclerView + Spinners** - Visualización dinámica de listas.
- **Google Drive** (planeado) - Enlazar fichas y diarios de campaña en futuras versiones.

---

## 🧪 Pruebas realizadas

- Validación de navegación entre Activities y comportamiento del botón volver.
- Testeo de tiradas y comparación con habilidad (entre 1 y 100).
- Pruebas de spinner (tablas y tipos de armas).
- Visualización de cualidades de armas correctamente vinculadas.
- Comprobación en múltiples dispositivos Android:

  - Google Pixel 6  
  - Samsung Galaxy S21  
  - Xiaomi Redmi Note 12 Pro  
  - Samsung Galaxy Tab S6  
  - DOOGEE T40

---

## 📲 Instalación

### Requisitos

- Android OS (mínimo API 21 o superior)
- ~30 MB de espacio disponible

### Pasos

1. Clona o descarga este repositorio.
2. Abre el proyecto en Android Studio.
3. Ejecuta en emulador o dispositivo físico (modo desarrollador activado).
4. La app no necesita conexión a internet.

---

## 🧠 Estructura del proyecto

com.example.masterhammer/
- MainActivity.kt
- Armas/
  - Armas.kt
  - ArmasAdapter.kt
  - DbHelper-BBDD-Armas.kt
  - Arma.kt
- normas/
  - Normas.kt
  - Combate.kt
  - ...
- elmundo/
  - ElMundo.kt
  - Caos.kt
  - ...



---

## 📌 Vías futuras

- 📄 Visualización de fichas PDF desde Google Drive.
- 📖 Diario de aventuras enlazado con Google Docs.
- 🔊 Ambientación sonora integrada en la app.

---

## 👤 Autor

**David Muñoz García**  
Proyecto desarrollado como parte del del grando de Desarrollo de Aplicaciones Multiplataforma (DAM)  
📅 Entregado: 24/04/2025  

---



