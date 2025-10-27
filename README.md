# **🇪🇸 Monopoly en Java - Proyecto Personal**

## 📝 **Introducción**

El juego Monopoly en Java se centra en la compra y gestión de propiedades para obtener ganancias a través de las rentas de alquiler pagadas por los otros jugadores, con el objetivo de llevar al resto a la bancarrota. La temática de esta edición se basa en ciudades del mundo, inspirada en el *Monopoly Here & Now: The World Edition*.

### **Reglas Simplificadas del Juego**

  * No se tienen en cuenta los monopolios (casillas del mismo color), por lo que el alquiler no se duplica al obtener todas las casillas de un mismo color.
  * Las casillas tradicionales de "Suerte" y "Caja de comunidad" se han simplificado a casillas "Premio", donde el jugador recibe una cantidad fija de dinero al caer en ellas.
  * Las casillas de "Pago de Impuestos" son "Multa" y el jugador debe pagar una cantidad fija a la banca si cae en ellas.
  * La Casilla de Salida añade dinero al balance del jugador al caer en ella o superarla.
  * Existe una Casilla de Libre Paso en la que no hay cambios de balance.
  * El resto de casillas son propiedades con un precio y un alquiler (equivalente a una fracción del precio de compra).
  * La mecánica de negociación no está disponible.

-----

## 💻 **Explicación del Código**

El proyecto está organizado en once clases que gestionan la lógica y los componentes del juego:

### **Estructura de Clases**

  * **Main**: Contiene la interfaz gráfica y gestiona la interacción del usuario (clic en el botón de tirar los dados). Anuncia al ganador y escribe los resultados en un documento de texto (resultados.txt) cuando un jugador se declara en bancarrota.
  * **Partida**: Clase que instancia todos los objetos de casillas y jugadores, y administra el contador de turnos de la partida.
  * **Casilla**: Superclase de la que heredan todos los tipos de casillas, utilizada para crear un *array* que contenga todas las casillas del tablero.
  * **Propiedad**: Subclase que representa las casillas comprables. Contiene atributos para el precio, el alquiler (calculado como la décima parte del precio de compra) y el propietario (tipo Jugador).
  * **Salida**: Subclase utilizada para la casilla de salida. Contiene el valor de pago fijo que se realiza cuando un jugador pasa por ella.
  * **CasillaLibre**: Subclase para la casilla de libre paso, que no tiene implicaciones ni genera pagos.
  * **Premio y Multa**: Subclases que modifican el balance del jugador al caer en ellas, sumando o restando una cantidad fija, respectivamente.
  * **Carcel**: Subclase utilizada para las dos casillas que provocan que el jugador pierda un turno.
  * **Jugador**: Contiene atributos como el balance, la posición actual, un indicador booleano para el estado de cárcel y una lista (ArrayList) de las propiedades que posee.

### **Función de Turno**

La función principal del juego recibe un parámetro de jugador y el valor de los dados, y ejecuta la lógica del turno en el siguiente orden:

1.  Comprueba si el jugador está en la cárcel. Si es así, su turno finaliza.
2.  Si no está en la cárcel, mueve al jugador a la nueva posición.
3.  Comprueba el tipo de casilla en la que cae y muestra las acciones e información pertinentes (compra, pagos, bancarrota, etc.).
4.  La función devuelve true si la partida debe continuar (el jugador no está en bancarrota) o false si el programa debe finalizar (el jugador ha declarado la bancarrota).

-----

## 🕹️ **Interacción con el Usuario**

La interacción con el usuario se realiza completamente a través de la interfaz gráfica, que se ha creado utilizando un archivo **JFrame Form** como clase principal.

  * **Interacción**: El usuario interactúa con el programa únicamente a través del botón de tirar los dados (ya que la negociación está excluida).
  * **Eventos**: Una vez que el jugador cambia de casilla, se muestra el evento correspondiente mediante una ventana emergente (JOptionPane).
  * **Compra de Propiedades**: Si la casilla es comprable, se le pregunta al usuario con una ventana emergente si desea adquirirla (Sí/No). La propiedad se asigna en función de la respuesta.
  * **Información en Pantalla**: El balance de cada jugador y los valores de los dados se muestran en tiempo real. El resto de ventanas emergentes son de carácter informativo (casilla actual, variación de balance).

-----

## 🖥️ **Interfaz gráfica**


**Inicio de la partida**

<img width="680" height="532" alt="imagen" src="https://github.com/user-attachments/assets/c2e907c9-99ba-47c5-a720-394c7dcb046b" />



**Ventana de ganador**

<img width="692" height="547" alt="imagen" src="https://github.com/user-attachments/assets/9769861f-3f02-49bf-af54-25527a0b8139" />

-----

## 🛠️ **Tecnologías Utilizadas**

-   Lenguaje de programación: **Java**
-   Biblioteca de interfaces: **Java Swing**
-   Gestor de dependencias: **Maven**
-   IDE: **Apache Netbeans 22**


-----

## 👤 **Autor**

  - **Nombre:** Pablo Serrano Expósito
