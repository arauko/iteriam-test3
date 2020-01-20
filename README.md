# COMPILACION

Para compilar el proyecto se deberán realizar los siguientes pasos:

NOTA: Si se da alguna o varias de las siguientes condiciones, podemos saltarnos los pasos correspondientes:

- Instalación de JAVA JDK (Pasos 1 a 3)
- Instalación de MAVEN (Pasos 4 a 5)
- Instalación de GIT (Pasos 6 a 7)
- Clonación del repositorio (Pasos 8)
- Ejecución de los Test (Pasos 16 a 18)
- Compilación del proyecto (Pasos 19 a 22)


## Instalación de Java JDK
### Paso 1 - Descarga de JDK:
Nos dirigimos a [Java Page](https://www.oracle.com/technetwork/java/javase/downloads/index.html) y seleccionamos la
versión deseada para descargar (En nuestro caso la JDK8)

### Paso 2 - Instalar la JDK:
Seleccionamos al ruta de instalación de la JDK. Por Defecto "C:\Program Files\Java"

### Paso 3 - Variable de Entorno:
Una Vez descargado agregamos la Variable de Entorno.

Pulsamos Inicio y tecleamos "Variables de Entorno de sistema" o "Environment System".

En la ventana emergente seleccionamos "Variables de Entorno..." - Añadir. 

En la ventana emergente insertamos los siguientes valores:
Nombre de Variable: JAVA_HOME
Valor: (Nuestro directorio de instalacion de Java)

Una vez añadida, guardamos los cambios y buscamos la variable "Path" y procedemos a editarla

Añadimos una nueva con el siguiente valor "%JAVA_HOME%\bin"

Abrimos un terminal (Tecla windows + R y ejecutamos cmd), tecleamos "echo %JAVA_HOME%" y debería mostrarse nuestra ruta JAVA

Ejemplo:
C:\Program Files\Java\jdk1.8.0_241

##Instalación de Maven
### Paso 4 - Descarga de Maven:
Nos dirigimos a [Maven Page](https://maven.apache.org/download.cgi) y procedemos a descargar el archivo comprimido que queramos.

Descomprimimos el archivo descargado en donde más deseemos. Se recomienda en la raíz de nuestro disco duro para evitar problemas
al descargar nuevas dependencias por el limite de caracteres en el nombre del directorio de los ficheros. 

### Paso 5 - Variable de Entorno:
Una Vez descargado agregamos la Variable de Entorno.

Pulsamos Inicio y tecleamos "Variables de Entorno de sistema" o "Environment System".

En la ventana emergente seleccionamos "Variables de Entorno..." - Añadir. 

En la ventana emergente insertamos los siguientes valores:
Nombre de Variable: MAVEN_HOME
Valor: (Nuestro directorio de instalacion de Java)

Una vez añadida, guardamos los cambios y buscamos la variable "Path" y procedemos a editarla

Añadimos una nueva con el siguiente valor "%MAVEN_HOME%\bin"

Abrimos un terminal (Tecla windows + R y ejecutamos cmd), tecleamos "mvn -version" y debería mostrarse nuestra version del maven

Ejemplo:
> Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: D:\apache-maven-3.6.3\bin\..
Java version: 1.8.0_241, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_241\jre
Default locale: es_ES, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

## Instalacion de GIT
### Paso 6 - Descargar GIT:
Nos dirijimos a [Git Page](https://git-scm.com/downloads) y descargamos la version compatible con nuestro sistema operativo.
En nuestro caso, descargaremos la versión para Windows.

### Paso 7 - Instalar GIT:
El proceso de Instalación solicita varias opciones adicionales tales como estilo de texto en consola de comandos, terminal a usar.
Para usuarios iniciales, basta con leer los Términos y Condiciones de Uso. Aceptarlos o Rechazarlo.

En caso de Aceptar, podemos proceder a pulsar siguiente en todas las opciones o seleccionar las que deseemos.

Una vez completado el proceso de instalación, podemos proceder a abrir un terminal y ejecutar el siguiente comando: "git --version"

##Clonación del Repositorio
### Paso 8 - GIT Clone:

Procedemos a abrir un terminal de windows.

Nos dirigimos a la ruta en la que deseemos clonar el proyecto en nuestro local

Por ejemplo
`cd C:\projects`

Ejecutaremos el siguiente comando:

`git clone https://gitlab.com/omaroterofdez/iteriam-test3.git`

Nos solicitará un usuario y una contraseña de nuestro Usuario de GitLab.

Para nuestro caso, hemos procedido a crear un usuario que podrá ser usado para este fin:
Username: mogenoc335@it-smart.org
password: iteriamTest

Una vez completado el clonado, podremos importar el proyecto en nuestro IDE favorito

## Ejecucion de los Test
### Paso 9 - Ejecutar Test:

Para Ejecutar los test usaremos los comandos que maven nos proporciona para ello.

abriremos un terminal y nos dirigiremos a la raiz de nuestro proyecto

Ej: `cd C:\projects\iteriam-test3`

una vez nos hemos situado ahí, ejecutaremos el comando de maven `mvn test`.

Si todos los test devuelven el resultado esperado, podremos observar en el terminal lo siguiente

```[INFO] ------------------------------------------------------------------------
 [INFO] BUILD SUCCESS
 [INFO] ------------------------------------------------------------------------
 [INFO] Total time:  4.093 s
 [INFO] Finished at: 2020-01-20T16:33:13+01:00
 [INFO] ------------------------------------------------------------------------
```

##Compilación del proyecto
### Paso 10 - MVN clean:

Procedemos a ejecutar el comando `mvn clean` el cual eliminará el directorio target en caso de que exista. 

### Paso 11 - MVN package:

Procedemos a ejecutar el comando `mvn package` para generar el directorio target y el empaquetado de nuestro proyecto.

En nuestro caso, el resultado sería 
>test3-1.0-SNAPSHOT.jar

Si todo ha ido correctamente, veremos el siguiente bloque al final de nuestro terminal

```[INFO] Building jar: C:\Users\xarau\Desktop\test3\target\test3-1.0-SNAPSHOT.jar
   [INFO] ------------------------------------------------------------------------
   [INFO] BUILD SUCCESS
   [INFO] ------------------------------------------------------------------------
   [INFO] Total time:  4.679 s
   [INFO] Finished at: 2020-01-20T16:39:40+01:00
   [INFO] ------------------------------------------------------------------------
```

##INFORMACIÓN ADICIONAL
Durante la ejecución de los comandos Maven, podemos incluir varios parametros despues de `mvn clean` o `mvn package`:
- `-DSkipTest=true` En caso de que deseemos saltarnos la ejecucion de los Test durante nuestro comando 
- Podemos unir ambos comando en uno solo `mvn clean package` para ejecutar ambos casos a la vez