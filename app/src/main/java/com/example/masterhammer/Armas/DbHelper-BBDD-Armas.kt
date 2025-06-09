package com.example.masterhammer.Armas


import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.Context


class `DbHelper-BBDD-Armas`(context: Context) : SQLiteOpenHelper(context, "base_de_datos", null, 1) {


    override fun onCreate(db: SQLiteDatabase) {
        // Tabla de armas cuerpo a cuerpo
        db.execSQL(
            "CREATE TABLE ArmasCuerpoACuerpo (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nombre TEXT, " +
                    "tipo TEXT, " +
                    "precio TEXT, " +
                    "impedimenta INTEGER, " +
                    "disponibilidad TEXT, " +
                    "alcance TEXT, " +
                    "daño TEXT, " +
                    "cualidades TEXT)"
        )

        // Tabla de armas a distancia
        db.execSQL(
            "CREATE TABLE ArmasDistancia (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nombre TEXT, " +
                    "tipo TEXT, " +
                    "precio TEXT, " +
                    "impedimenta INTEGER, " +
                    "disponibilidad TEXT, " +
                    "alcance TEXT, " +
                    "daño TEXT, " +
                    "cualidades TEXT)"
        )

        // Tabla de munición
        db.execSQL(
            "CREATE TABLE Municion (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nombre TEXT, " +
                    "tipo TEXT, " +
                    "precio TEXT, " +
                    "impedimenta INTEGER, " +
                    "disponibilidad TEXT, " +
                    "alcance TEXT, " +
                    "daño TEXT, " +
                    "cualidades TEXT)"
        )

        db.execSQL(
            "CREATE TABLE Cualidades (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nombre TEXT, " +
                    "descripcion TEXT )"
        )

        db.execSQL(
            "CREATE TABLE Relacion_Municion_cualidades (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "arma_id INTEGER, " +
                    "cualidad_id INTEGER, " +
                    "FOREIGN KEY(arma_id) REFERENCES Municion(id), " +
                    "FOREIGN KEY(cualidad_id) REFERENCES Cualidades(id))"
        )

        db.execSQL(
            "CREATE TABLE Relacion_ArmasCuerpoACuerpo_cualidades (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "arma_id INTEGER, " +
                    "cualidad_id INTEGER, " +
                    "FOREIGN KEY(arma_id) REFERENCES ArmasCuerpoACuerpo(id), " +
                    "FOREIGN KEY(cualidad_id) REFERENCES Cualidades(id))"
        )

        db.execSQL(
            "CREATE TABLE Relacion_ArmasDistancia_cualidades (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "arma_id INTEGER, " +
                    "cualidad_id INTEGER, " +
                    "FOREIGN KEY(arma_id) REFERENCES ArmasDistancia(id), " +
                    "FOREIGN KEY(cualidad_id) REFERENCES Cualidades(id))"
        )

        insertarDatosPorDefecto(db)
    }


    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Implementar la lógica de actualización de la base de datos si es necesario
    }


    // Insertar datos en las tablas
    private fun insertarDatosPorDefecto(db: SQLiteDatabase) {
        // ArmasCuerpoACuerpo
        db.execSQL("INSERT INTO ArmasCuerpoACuerpo (nombre, tipo, precio, impedimenta, disponibilidad, alcance, daño, cualidades) VALUES" +
                "('Espada bastarda', 'A dos manos', '8 co', 3, 'Escaso', 'Larga', '+BF+5', 'Dañina, Defensiva')," +
                "('Gran hacha', 'A dos manos', '4 co', 3, 'Escaso', 'Larga', '+BF+6', 'Traspasante, Impactante, Fatigante')," +
                "('Pico', 'A dos manos', '3 co', 3, 'Común', 'Normal', '+BF+3', 'Dañina, Emplante')," +
                "('Martillo de guerra', 'A dos manos', '3 co', 3, 'Común', 'Normal', '+BF+6', 'Dañina, Contundente, Lenta')," +
                "('Zweihänder (mandoble)', 'A dos manos', '10 co', 3, 'Escaso', 'Larga', '+BF+5', 'Dañina, Traspasante')," +
                "('Alabarda', 'Armas de asta', '2 co', 3, 'Común', 'Larga', '+BF+4', 'Defensiva, Traspasante, Emplante')," +
                "('Lanza', 'Armas de asta', '15 cp', 2, 'Común', 'Muy larga', '+BF+4', 'Emplante')," +
                "('Pica', 'Armas de asta', '18 cp', 4, 'Raro', 'Enorme', '+BF+4', 'Emplante, Lenta')," +
                "('Bastón', 'Armas de asta', '3 cp', 2, 'Común', 'Larga', '+BF+4', 'Defensiva, Contundente')," +
                "('Arma de mano', 'Básicas', '1 co', 1, 'Común', 'Normal', '+BF+4', '-')," +
                "('Arma improvisada', 'Básicas', 'N/A', -1, 'N/A', 'Variable', '+BF+1', 'Inofensiva')," +
                "('Daga', 'Básicas', '16 cp', 0, 'Común', 'Muy corta', '+BF+2', '-')," +
                "('Cuchillo', 'Básicas', '8 cp', 0, 'Común', 'Muy corta', '+BF+1', 'Inofensiva')," +
                "('Escudo (rodela)', 'Básicas', '18 cp/2 p', 0, 'Común', 'Personal', 'Escudo 1', 'Defensiva, Inofensiva')," +
                "('Escudo', 'Básicas', '2 co', 1, 'Común', 'Muy corta', 'Escudo 2', 'Defensiva, Inofensiva')," +
                "('Escudo (grande)', 'Básicas', '3 co', 3, 'Común', 'Muy corta', 'Escudo 3', 'Defensiva, Inofensiva')," +
                "('Martillo de caballería', 'De caballería', '3 co', 3, 'Escaso', 'Larga', '+BF+5', 'Contundente')," +
                "('Lanza', 'De caballería','1 co' ,'Raro', 3, 'Muy larga', '+BF+6', 'Impactante, Emplante')," +
                "('Florete', 'De esgrima', '5 co', 1, 'Escaso', 'Normal', '+BF+3', 'Rápida, Emplante, Precisa, Inofensiva')," +
                "('Espada ropera', 'De esgrima', '5 co', 1, 'Escaso', 'Larga', '+BF+4', 'Rápida, Emplante')," +
                "('Daga de guardamano', 'De parada', '1 co', 4, 'Raro', 'Muy corta', '+BF+2', 'Defensiva')," +
                "('Rompeespadas', 'De parada', '1 co/2 cp/6 p', 1, 'Raro', 'Corta', '+BF+3', 'Defensiva, Atrapapegas')," +
                "('Mayal para grano', 'Mayales', '10 cp', 1, 'Común', 'Normal', '+BF+3', 'Molesta, Imprecisa, Envolvente')," +
                "('Mayal', 'Mayales', '2 cp', 1, 'Escaso', 'Normal', '+BF+5', 'Molesta, Envolvente')," +
                "('Mayal militar', 'Mayales', '3 co', 4, 'Raro', 'Larga', '+BF+6', 'Molesta, Impactante, Fatigante, Envolvente')," +
                "('Sin armas', 'Pelea', 'N/A', 0, 'Común', 'Personal', '+BF+0', 'Inofensiva')," +
                "('Puño americano', 'Pelea', '2 cp/6 p', 0, 'Común', 'Personal', '+BF+2', '-')")


        // ArmasDistancia
        db.execSQL("INSERT INTO ArmasDistancia (nombre, tipo, precio, impedimenta, disponibilidad, alcance, daño, cualidades) VALUES" +
                "('Arco élfico', 'Arcos', '10 co', 2, 'Exótico', '150', '+BF+4', 'Dañina, Precisa')," +
                "('Arco largo', 'Arcos', '5 co', 3, 'Escaso', '100', '+BF+4', 'Dañina')," +
                "('Arco', 'Arcos', '4 co', 2, 'Común', '50', '+BF+3', '')," +
                "('Arco corto', 'Arcos', '3 co', 1, 'Común', '20', '+BF+2', '')," +
                "('Boleadoras', 'Arrojadizas', '10 cp', 0, 'Raro', 'BFx3', '+BF', 'Enmarañante')," +
                "('Dardo', 'Arrojadizas', '2 cp', 0, 'Escaso', 'BFx2', '+BF+1', 'Emplante')," +
                "('Jabalina', 'Arrojadizas', '10 cp/6 p', 1, 'Escaso', 'BFx3', '+BF+3', 'Emplante')," +
                "('Piedra', 'Arrojadizas', '0', 0, 'Común', 'BFx3', '+BF', '')," +
                "('Hacha arrojadiza', 'Arrojadizas', '1 co', 1, 'Común', 'BFx2', '+BF+3', 'Traspasante')," +
                "('Cuchillo arrojadizo', 'Arrojadizas', '18 cp', 0, 'Común', 'BFx2', '+BF+2', '')," +
                "('Pistola ballesta', 'Ballestas', '6 co', 0, 'Raro', '10', '+7', 'Pistola')," +
                "('Ballesta pesada', 'Ballestas', '7 co', 3, 'Raro', '100', '+9', 'Dañina, Recarga 2')," +
                "('Ballesta', 'Ballestas', '5 co', 2, 'Común', '60', '+9', 'Recarga 1')," +
                "('Arma corta de repetición', 'Ingeniería', '10 co', 3, 'Raro', '30', '+9', 'Peligrosa, Recarga 5, Repetidora 4')," +
                "('Pistola de repetición', 'Ingeniería', '15 co', 1, 'Raro', '10', '+8', 'Peligrosa, Pistola, Recarga 4, Repetidora 4')," +
                "('Trabuco', 'Pólvora Negra', '2 co', 1, 'Escaso', '20', '+8', 'Explosiva 3, Peligrosa, Recarga 2')," +
                "('Fusil largo de Hochland', 'Pólvora Negra', '100 co', 3, 'Exótico', '100', '+9', 'Certera, Precisa, Recarga 4')," +
                "('Arcabuz', 'Pólvora Negra', '4 co', 2, 'Escaso', '50', '+9', 'Peligrosa, Recarga 3')," +
                "('Pistola', 'Pólvora Negra', '8 co', 1, 'Raro', '20', '+8', 'Pistola, Recarga 1')," +
                "('Lazo', 'Enmarañantes', '6 cp', 0, 'Común', 'BFx2', '', 'Enmarañante')," +
                "('Látigo', 'Enmarañantes', '5 cp', 0, 'Común', '6', '+BF+2', 'Enmarañante')," +
                "('Bomba', 'Explosivas', '3 co', 0, 'Raro', 'BF', '+12', 'Explosiva 5, Peligrosa, Impactante')," +
                "('Incendiaria', 'Explosivas', '1 co', 0, 'Escaso', 'BF', 'Especial', 'Explosiva 4, Peligrosa')," +
                "('Honda', 'Hondas', '1 cp', 0, 'Común', '10', '+6', '')," +
                "('Bastón honda', 'Hondas', '4 co', 2, 'Común', '100', '+7', '')");




        // Municion
        db.execSQL("INSERT INTO Municion (nombre, tipo, precio, impedimenta, disponibilidad, alcance, daño, cualidades) VALUES" +
                "('Flecha (12)', 'De arco', '5 cp', 0, 'Común', 'Según arma', '', 'Emplante')," +
                "('Flecha élfica', 'De arco', '6 cp', 0, 'Exótico', '+50', '+1', 'Precisa, Emplante, Perforante')," +
                "('Virote (12)', 'De ballesta', '5 cp', 0, 'Común', 'Según arma', '', 'Emplante')," +
                "('Bala de plomo (12)', 'De honda', '4 p', 0, 'Común', '-10', '+1', 'Contundente')," +
                "('Bala de piedra (12)', 'De honda', '2 p', 0, 'Común', 'Según arma', '', 'Contundente')," +
                "('Balas y pólvora (12)', 'De pólvora negra e ingeniería', '3 cp/3 p', 0, 'Común', 'Según arma', '+1', 'Emplante, Perforante')," +
                "('Munición improvisada y pólvora', 'De pólvora negra e ingeniería', '3 p', 0, 'Común', 'Mitad del arma', '', '')," +
                "('Balas pequeñas y pólvora (12)', 'De pólvora negra e ingeniería', '3 cp/3 p', 0, 'Común', 'Según arma', '', 'Explosión +1')")


        db.execSQL("INSERT INTO Cualidades (nombre, descripcion) VALUES" +
                "('Atrapaespadas', 'Algunas armas han sido diseñadas para atrapar otras armas, y a veces incluso romperlas. Si consigues un crítico cuando defiendes contra un ataque de un arma de filo, puedes elegir atraparla en lugar de infligir el Impacto crítico.')," +
                "('Certera', 'Con este arma es fácil acertar al objetivo. Obtienes un bonificador de +1 NE a cualquier Chequeo con éxito cuando atacas con este arma.')," +
                "('Contundente', 'Las armas Contundentes son especialmente buenas para apalear a un enemigo hasta que se somete. Si consigues un impacto en la Cabeza con un arma Contundente, intenta un Chequeo Enfrentado de Fuerza/Aguante contra ese oponente. Si ganas el Chequeo, tu oponente sufre 1 Estado de Aturdido.')," +
                "('Dañina', 'Un arma puede utilizar la cifra mayor, o bien del dado de las unidades, o bien del NE, para determinar el Daño causado por un impacto. Un arma Inofensiva nunca puede ser a la vez Dañina (Inofensiva tiene precedencia).')," +
                "('De Pólvora negra', 'La detonación de un arma de fuego, seguida por nubes de humo y por la confusión puede ser aterradora. Si eres el objetivo de un arma de Pólvora negra, debes superar un Chequeo Normal (+20) de Frialdad o sufrir 1 Estado de Quebrantado, incluso si el disparo falla.')," +
                "('Defensiva', 'Las armas Defensivas están diseñadas para detener ataques. Si estás empuñando una de estas armas, obtienes un Bonificador de +1 NE a cualquier Chequeo de Cuerpo a cuerpo cuando te opones a un ataque.')," +
                "('Empalante', 'Las armas Empalantes pueden matar de un solo y certero golpe. Estas armas causan un impacto crítico con cualquier número divisible exactamente por 10, así como con los dobles si se saca un resultado igual o menor que el objetivo en un Chequeo apropiado de combate.')," +
                "('Enmarañante', 'Tu arma se enreda alrededor de tus oponentes, enmarañándolos. Todo oponente a quien acierta tu arma sufre 1 Estado de Enmarañado.')," +
                "('Explosiva', 'Todos los Personajes que están a una distancia igual o menor en yardas que la potencia del punto objetivo impactado sufren NE + Daño por arma, y cualquier Estado que el arma inflige.')," +
                "('Impactante', 'Algunas armas son enormes o causan un daño terrible debido a su peso o diseño. Con un impacto, suma el resultado del dado de las unidades de la tirada de ataque a cualquier Daño causado.')," +
                "('Irrompible', 'El arma está exquisitamente bien hecha o construida con un material especialmente fuerte. En casi todas las circunstancias, este arma ni se romperá, ni se oxidará, ni perderá su filo.')," +
                "('Molesta', 'Las armas Molestas se pueden utilizar para hacer retroceder a un oponente. En lugar de causar Daño, un ataque con éxito puede obligar a un oponente a retirarse 1 yarda por cada NE.')," +
                "('Perforante', 'El arma es altamente efectiva a la hora de perforar la armadura. Los puntos de Armadura no metálicos se ignoran, así como el primer punto de todos los demás tipos de armadura.')," +
                "('Pistola', 'Puedes utilizar este arma para atacar en Combate cerrado.')," +
                "('Precisa', 'El arma es Precisa y es fácil acertar con ella. Obtienes un bonificador +10 a cualquier Chequeo cuando disparas este arma.')," +
                "('Rápida', 'Las armas Rápidas están diseñadas para atacar con tal velocidad que no dan opción a parada. Puedes atacar fuera de la secuencia normal de Iniciativa.')," +
                "('Repetidora', 'Tu arma contiene tantos disparos como la cifra indicada en el cargador, recargándose de forma automática cada vez que disparas.')," +
                "('Traspasante', 'Las armas Traspasantes están provistas de una hoja pesada que puede atravesar la armadura. Si impactas a un oponente, infliges 1 punto de Daño a una pieza de armadura o un escudo.')")




        db.execSQL("INSERT INTO Relacion_Municion_cualidades (arma_id, cualidad_id) VALUES" +
                "('1', '3')," +
                "('2', '2')," +
                "('2', '7')," +
                "('2', '13')," +
                "('3', '3')," +
                "('4', '13')," +
                "('5', '13')," +
                "('6', '13')," +
                "('7', '13')")
        db.execSQL("INSERT INTO Relacion_ArmasCuerpoACuerpo_cualidades (arma_id, cualidad_id) VALUES" +
                "('1', '4')," +
                "('1', '6')," +
                "('2', '7')," +
                "('2', '10')," +
                "('2', '8')," +
                "('2', '12')," +
                "('3', '4')," +
                "('3', '7')," +
                "('4', '4')," +
                "('4', '3')," +
                "('4', '12')," +
                "('5', '4')," +
                "('5', '18')," +
                "('6', '6')," +
                "('6', '7')," +
                "('6', '18')," +
                "('7', '7')," +
                "('8', '7')," +
                "('8', '12')," +
                "('9', '6')," +
                "('9', '3')," +
                "('10', '6')," +
                "('10', '3')," +
                "('11', '4')," +
                "('12', '7')," +
                "('13', '6')," +
                "('13', '3')," +
                "('14', '3')," +
                "('15', '7')," +
                "('15', '16')," +
                "('15', '7')," +
                "('16', '3')," +
                "('16', '6')," +
                "('16', '18')," +
                "('17', '10')," +
                "('17', '7')," +
                "('17', '3')," +
                "('18', '6')," +
                "('18', '3')," +
                "('19', '7')," +
                "('19', '16')," +
                "('20', '6')," +
                "('20', '18')," +
                "('21', '7')," +
                "('21', '16')," +
                "('21', '6')," +
                "('22', '6')," +
                "('22', '3')," +
                "('23', '6')," +
                "('23', '3')," +
                "('24', '6')," +
                "('24', '18')," +
                "('24', '3')," +
                "('25', '6')," +
                "('25', '7')," +
                "('26', '6')," +
                "('26', '3')," +
                "('27', '6')," +
                "('27', '3')," +
                "('28', '6')," +
                "('28', '18')," +
                "('29', '6')," +
                "('29', '7')," +
                "('29', '16')")

        db.execSQL("INSERT INTO Relacion_ArmasDistancia_cualidades (arma_id, cualidad_id) VALUES" +
                "('1', '4')," +
                "('1', '15')," +
                "('2', '4')," +
                "('3', '4')," +
                "('4', '4')," +
                "('5', '8')," +
                "('6', '7')," +
                "('7', '7')," +
                "('8', '7')," +
                "('9', '18')," +
                "('10', '18')," +
                "('11', '5')," +
                "('11', '14')," +
                "('11', '16')," +
                "('12', '4')," +
                "('12', '17')," +
                "('13', '4')," +
                "('13', '17')," +
                "('14', '1')," +
                "('14', '5')," +
                "('14', '16')," +
                "('14', '17')," +
                "('15', '1')," +
                "('15', '5')," +
                "('15', '16')," +
                "('15', '17')," +
                "('16', '9')," +
                "('16', '1')," +
                "('16', '5')," +
                "('16', '16')," +
                "('16', '17')," +
                "('17', '4')," +
                "('17', '1')," +
                "('17', '5')," +
                "('17', '16')," +
                "('18', '4')," +
                "('18', '1')," +
                "('18', '5')," +
                "('18', '16')," +
                "('19', '4')," +
                "('19', '1')," +
                "('19', '5')," +
                "('20', '4')," +
                "('20', '1')," +
                "('20', '5')," +
                "('20', '8')," +
                "('21', '8')," +
                "('22', '9')")

    }
}



