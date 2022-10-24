# Practica01

Practica0
Equipo8 Base de datos Practica 1

/*Las líneas 2 y 3 están en comentarios, para usarse así la primera vez... luego de eso se quitan los comentarios para que todo funcione bien, en las siguientes ejecuciones */ 
/drop schema practica ; drop user usuario_prueba;/

/*Se crea la base de datos */ CREATE SCHEMA practica ; /Se crea un usuario para la base de datos llamado "usuario_practica” y tiene la contraseña “la”_Clave/ 
create user 'usuario_practica'@'%' identified by 'la_Clave'; /*Se asignan los prvilegios sobrela base de datos Practica al usuario creado / grant all privileges on practica. to 'usuario_practica'@'%'; flush privileges;

/*Se crea la tabla de estados llamada estado... igual que la clase Estado */ CREATE TABLE practica.estado ( id_pais INT NOT NULL AUTO_INCREMENT, poblacion INT NOT NULL, nombrePais VARCHAR(50) NOT NULL, capitalPais VARCHAR(50) NOT NULL, costas INT NOT NULL, continente VARCHAR(50) NULL, PRIMARY KEY (id_pais))
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_eo_0900_ai_ci;

/*Se insertan 4 registros en la tabla estado como ejemplo */ 
INSERT INTO practica.estado (id_pais, poblacion, nombrePais, capitalPais, costas, continente) VALUES (1, 39835428,'Afganistán', 'Kabul', 0, 'Asia'), (2, 83798823,'Alemania', 'Berlin', 2389, 'Europa'), (3, 5180000 ,'Costa Rica', 'San Jose',2, 'America del norte'), (4, 50080000,'Colombia', 'Bogota', 3, 'America del sur');
