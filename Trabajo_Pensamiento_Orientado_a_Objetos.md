# Object-Oriented Thinking

## Grupo 1. Dormitory Accomondation Managment

### Miembros

* Ricardo Valdivieso
* Ramón Álvarez

### Requerimientos del sistema

![image-20220805131422519](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805131422519.png)

### Casos de estudio

![image-20220805131506469](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805131506469.png)

### Diagrama de clases

![image-20220805131553232](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805131553232.png)

### Implementación

Se le pidió implementar las clases `Usuario` y `Administrador`

#### `Usuario.java`

```java
package org.example;

import java.util.ArrayList;

public class Habitacion {

    private boolean disponible;
    private int numero;
    private int[] tv;
    private int[] cama;
    private int[] bano;
    private int[] escritorio;
    private int[] silla;
    private String inquilino;
    private String informes;

    public Habitacion(boolean disponible, int numero, int[] tv, int[] cama, int[] bano, int[] escritorio, int[] silla, String inquilino, String informes) {
        this.disponible = disponible;
        this.numero = numero;
        this.tv = tv;
        this.cama = cama;
        this.bano = bano;
        this.escritorio = escritorio;
        this.silla = silla;
        this.inquilino = inquilino;
        this.informes = informes;
    }

    public boolean informe_entrega(boolean tv, boolean cama, boolean bano, boolean escritorio, boolean silla){
    return false;
    }

    public boolean informe_entrega(int[][] informe){
        int cantidad;
        int valor;
        int acumulado = 0;

        for (int i = 0, j =0; i < 2; i++){
            cantidad = informe[i][j];
            for (; j <= 5; j++){

            }
        }
    }
}
```

#### `Usuario.java`

```java
package org.example;

import java.util.Date;

public class Usuario {

    private String nombre;
    private int identificacion = 0;
    private String password;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public Usuario(String nombre, int identificacion, String password, String tipo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.password = password;
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean actualizar_clave(String a, String b) {
        if (a.equals(this.password)) {
            this.password = b;
            System.out.println("Clave cambiado correctamente");
            return true;
        } else {
            System.out.println("clave actual incorrecta");
            return false;
        }
    }
}
```

### Comentarios

* Se demoraron en la entrega.
* No entienden bien la definición de requerimientos no funcionales. 
* Caso de Uso, tengo una cierta impresión que debo tomar tiempo para revisar.
* Falto mucho más análisis.
* No tuvieron en cuenta que el sistema consta con un inventario de habitaciones.
* No hay relaciones.
* Sobresimplicación del diseño. 
* En la implementación decidieron entregar algo que no sé pidio.(Revisar)
* El código corresponde con su visión

## Grupo 2. Vending Machine

### Miembros

* Camilo Tejada
* Juan Jaime

### Requerimientos del sistema

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805104258880.png)

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805104402081.png)

### Casos de uso

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805104514964.png)

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805105212244.png)

### Identificación de objetos y relaciones

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805104701180.png)

Otra información aportada 

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805104749215.png)

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805104833725.png)

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805104933175.png)

### Diagrama de clases

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805105058423.png)

### Implementación

Se les solicito implementar `Drink` y `HotDrink`

#### `Drink.java`

```java
package com.epam.rd.main.model;

import com.epam.rd.main.utils.Size;

public abstract class Drink {

    private String name;
    private Size size;
    private int price;
    private int stock;

    public void currentItems(){}
    public void reStock(){}
    public void setPrice(){
        this.price = price;
    }
}
```

#### `HotDrink.java`

```java
package com.epam.rd.main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HotDrink extends Drink {

    private int temperature;

    @Override
    public void currentItems() {
        super.currentItems();
    }

    @Override
    public void reStock() {
        super.reStock();
    }
}
```

### Comentarios

* Un análisis muy específico a un caso determinado, una máquina vendedora de productos.
* En la presentación mostraron otro diagrama de clases que combinaba responsabilidades, al parecer lo cambiaron cuando lo entregaron después de haber visto los vídeos de SOLID, eso esta bien, pueden cambiar.
* Al tener un sistema embeido, no tiene en cuenta el estado del sistema. Pensarón que el sistema siempre funcioná
* No tuvieron en cuenta el inventario de dinero y la entrada del mismo. 
* En la implementación utilizaron una biblioteca para el manejo de *getting* and *settings*, hábil, pero eso esta bien en una implementación real, no en un diseño.
* Se enfocarón en detalles, que a mi parecer no son de importancia (Retail).  

## Grupo 3. Zoo Animals nutrition manangent

### Miembros

* Miguel Angarita
* Andrés Giraldo

### Requerimientos del sistema

![image-20220805124606725](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805124606725.png)

### Casos de Usos

![image-20220805124644586](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805124644586.png)

![image-20220805124707950](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805124707950.png)

### Objetos clases y relaciones

![image-20220805124739595](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805124739595.png)

![image-20220805124933921](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805124933921.png)

![image-20220805125003686](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805125003686.png)

### Diagrama de clases

![image-20220805125046771](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805125046771.png)

### Implementación

Se impidió la implementación de las clases `Food`, `Animal`y `Schedule`

#### `Food.java`

```java
package model;

import java.util.ArrayList;

public class Food {
    
    private String name;
    private String category;
    private double weight;
    
    private ArrayList<String> contribution;

    public Food() {
        this.name = "";
        this.category = "";
        this.weight = 0.0;
        this.contribution = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<String> getContribution() {
        return contribution;
    }

    public void setContribution(ArrayList<String> contribution) {
        this.contribution = contribution;
    }

    public void addContribution(String contribution) {
        this.contribution.add(contribution);
    }
}
```

#### `Animal.java`

```java
package model;

import java.util.ArrayList;

public class Food {
    
    private String name;
    private String category;
    private double weight;
    
    private ArrayList<String> contribution;

    public Food() {
        this.name = "";
        this.category = "";
        this.weight = 0.0;
        this.contribution = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<String> getContribution() {
        return contribution;
    }

    public void setContribution(ArrayList<String> contribution) {
        this.contribution = contribution;
    }

    public void addContribution(String contribution) {
        this.contribution.add(contribution);
    }
}
```

#### `Schedule	.java`

```java
package model;

import java.util.ArrayList;
import java.util.Date;

public class Schedule {
    
    private ArrayList<Date> timeTable;
    private Boolean completed;

    public Schedule() {
        this.timeTable = new ArrayList<>();
        this.completed = false;
    }
    public ArrayList<Date> getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(ArrayList<Date> timeTable) {
        this.timeTable = timeTable;
    }

    // new methods implementation

    public Boolean getCompleted() {
        return this.completed;
    }
    public void setComplete(Boolean complete) {
        this.completed = complete;
    } 

    public void addTime(Date time) {
        this.timeTable.add(time);
    }

    public void removeTime(Date time) {
        this.timeTable.remove(time);
    }

    public int getMealsNumber() {
        return this.timeTable.size();
    }
}
```

### Comentarios

* No consideraron que el sistema puede ser un sistema de eventos en el manejo de alarmas.
* No establece una cocina de alimentos de los animales.
* Los animales son considerados iguales
* Casos de uso muy simple
* Definición de clases, muy propia.
* La implementación no se concentraron en el producto, *getting* y *settings* que pueden tener efectos colareles.



## Grupo 4. Chess

### Miembros

* Omar Mendoza
* Miguel Narvaez

### Requerimientos del sistema



![Requerimientos Funcionales](./images/Group4-RF.png)

![](./images/Group4-RNF.png)

### Casos de uso

![](./images/Group4-UC-1.png)

### Identificación objetos y relaciones



![](./images/Group4-IC-1.png)

### CRC

![](./images/Group4-CRC-1.png)

### Implementación 

Se les solicito de manera parcial que implementarán una parte. Casilla y tablero

#### `Casilla.java`

```java
package org.example;

public class Casilla {
    private boolean estado;
    private String color;
    private int columna;
    private int fila;

    private Ficha ficha;


    public void definirEstado(boolean estado) {
        this.estado = !estado;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

}
```

#### `Tablero.java`

```java
package org.example;

public class Tablero {

    public static final int NUMERO_COLUMNAS = 8;
    public static final int NUMERO_FILAS = 8;
    public static final int NUMERO_CASILLAS = 64;

    private Casilla[] casillas;


    public Tablero(){
        casillas = new Casilla[NUMERO_CASILLAS];
    }
    
    public void validarMovimiento(){
    }

    public void validarGanador(){
    }

    public Casilla[] getCasillas() {
        return casillas;
    }
}
```

### Comentarios

* Los requisitos apuntan más al deseo de hacerlo en red, pero optan por confundir por que en diseño establece que lo piensan más a un sistema *peer-to-peer*, pero en el diseño se basan más por web.
* No definen un estado dentro de la aplicación ni lo análisa.
* El código entregado le falta.

## Grupo 5. Impresora Universidad

### Miembros

* Daniel Aguirre
* Nicolás Poch

### Requerimientos del sistema

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805114450833.png)

### Casos de uso

![](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805114550353.png)

### Diagrama de clases

![image-20220805114647014](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20220805114647014.png)

### Implementación

Se les solicitó implementar `Impresora`, `Tinta`

#### `Impresora.java`

```java
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Impresora {
    private HashMap<String, Tinta> tintas;
    private Queue<Impresion> impresiones;
    private HashMap<String, Papel> papel;

    public Impresora(HashMap<String, Tinta> tintas, HashMap<String, Papel> papel){
        this.papel = papel;
        this.tintas = tintas;
        this.impresiones = new LinkedList<>();
    }

    public int getCantidadDePapel(String tipoDePapel){
        return papel.get(tipoDePapel).getCantidad();
    }

    public float getCantidadDeTinta(String tipoDeTinta){
        return tintas.get(tipoDeTinta).getCantidad();
    }

    public Queue<Impresion> getImpresiones() {
        return impresiones;
    }

    public void recibirDocumento(Object paquete){
        Impresion impresion = new Impresion(paquete);
        int papelEstimado = impresion.calcularPapel();
        float tintaEstimada = impresion.calcularTinta();
        // condicionales para ver si se puede agregar la impresion a la cola
        impresiones.add(impresion);
    }

    public void imprimir(){
        Impresion docImpreso = impresiones.remove();
    }
}
```

#### `Tinta.java`

```java
public class Tinta {
    private float cantidad;
    private String color;

    public Tinta(float cantidad,String color)throws Exception{
        if(cantidad<0) throw new Exception("Cantidad debe ser positiva");
        if(color.equals(null)) throw new Exception("Tipo de tinta no debe ser nula");
        if(color.trim().length()==0) throw new Exception("String sin contenido");

        this.cantidad=cantidad;
        this.color=color;
    }

    public void usar(float cantidadEstimada)throws Exception{
        if(cantidad - cantidadEstimada<0) throw new Exception("No alcanza la tinta para su impresion");
        this.cantidad-=cantidadEstimada;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
```

### Comentarios.

* Requerimientos excesivos, en mi impresión sin conexión.
* Realmente tomaron una posición diferente, implementar lo que ya esta hecho, en vez de enfocarse en el problema específico, que es el manejo de las impresoras, no de las impresoras mismas. Tratando de definir el diseño de impresoras.
* Tiene que revisar esto de nuevo.

# Impresiones sobre los estudiantes

## Ricardo Valdivieso

* Muy tímido.
* Participa poco generalmente inducido.
* Mantiene pagada la cámara.
* Llega temprano siempre.

## Ramón Álvarez

* No es tímido.
* Busca destacar respondiendo muchas veces sin pensar mucho la respuesta.
* Se tienen diferentes problemas en la comunicación que en cada situación cambia.
* Al inicio comenzó con la cámara prendida, pero desde el miércoles la apaga.
* Esta llegando tarde, alega problemas de comunicación.
* Quiere respuesta inmediata del docente, en el trabajo práctico buscó que el docente diera retroalimentación antes.

##  Camilo Tejada

* Siempre llega temprano, ha iniciado casi todas las sesiones en las cuáles participa.
* Es muy parco al responder, requiere que se le pregunte directamente.
* Pero pregunta mucho por el interno.
* Aunque no tiene un bagaje en el tema de Java, trata de asimilarlo haciendo contraste con conocimiento previo en otros lenguajes.
* Comenzó prendiendo la cámara, pero a partir del Jueves pasado cambio.
* Evita participar en sesiones conjuntas.

## Juan Jaime

* Poco expresivo.
* Mantiene siempre apagada la cámara.
* Participa poco.
* En reuniones uno a uno, como se tuvo en una consulta con su compañero si es más participativo.
* Se le han hecho preguntas directa sobre temas y los maneja, pero no se abre a preguntar y participar.

## Miguel Angarita

* Se me pasado tenerlo en cuenta, principalmente por que no participa.
* No prende la cámara.
* Se le han hecho preguntas directas y las responde.
* TENGO que observar más, todavía no tengo mucho que aportarle.

## Andrés Giraldo

* Tengo tres llegadas tardes. Una particularmente importante por que dejo a su compañero solo en la exposición del ejercicio. Igual una que paso el viernes 5, pero esta hubo un cambio a última hora que lo puede excusar.
* No prende la cámara, hay que pedírselo directamente.
* Se le han hecho una sola pregunta, la respondió.
* TENGO que observar más, todavía tengo de identificar cómo se comporta.

## Omar Mendoza

* Junto con Camilo siempre esta iniciando sesiones, llega siempre temprano.
* Participa en la reuniones.
* Comenzó prendiendo la cámara, pero al final comenzó apagarla.
* Se le nota mucha interés por aprender.
* Las respuestas tiene dudas, pero lo noto mejorando.
* Siento que tiene algunos vacíos, pero tiene como ya dije interés y esto podría cerrar la brecha.

## Miguel Narvaez

* No participa, sino se le indica, pero cuando lo hace, tiene un buen nivel y me ha impresionado mucho.
* No prende la cámara.
* Sus explicaciones son claras.
* Tengo  buena impresión, pero hay que ahondar si tengo o no razón.
* Tengo que hacer que participe más, al parecer lo hace con su compañero asignado Omar, espero que pueda ser utilizado para ser un factor de cambio con los demás.

## Daniel Aguirre

* Una incógnita, no participa, tengo que poner más cuidado, de pronto puedo confundirlo.
* No prende la cámara.
* Despejarla la incógnita.

## Nicolás Poch

* Siempre muy callado,
* Poca participación de iniciativa propia.
* Si sé le pregunta, responde, y lo hace bien.
* No prende la cámara.

# Feedback - 5 de Agosto

## Miguel Angarita

* Llego un poco tarde.
* Equipo: llego el lunes, Tiene problemas con el equipo, se reinicia y se queda en un bucle.
* No hay pendientes.
* Le pedí compromiso y participación.
* Espero que se destape, tímido como todos los ingenieros de sistemas.

## Andrés Giraldo

* Equipo: Lo tiene, no lo trabaja directamente.
* Lo legal, ya esta cumplido.
* Falta onboarding.
* Lo compromento a compartir.
* Preguntas sobre el documentos.

## Juan Jaime

* Equipo: Todo esta bien, llegó, no ha tenido problemas.
* Legal: Afiliaciones OK. Salud de la Policía.
* Esperar que participar. 
* lombok. Algún día nos va enseñar.
* ***Tiene problemas con autocode*. Tiene dos versiones que pasa y que debe hacer.**

## Daniel Aguirre

* Equipo: Todo bien. 
* Legal: Afiliaciones, onboarding no lo acabado.

## Miguel Narvaez

* Equipo: Recibio el computador, todo esta en orden.
* Legal: Todo listo, excepto fondo.

## Camilo Tejada

* Equipo: El equipo llegó golpeado. Los del envió ya enviaron otro computador de reemplazo. Le enviar una guía.
* Legal: Todo listo.
* Onboarding: Falta
* Pedir participación.
* Primer vez en Java.
* Más familiaridad.
* Me gusta su actitud.
* Tiene más preguntas.

## Nicolás Poch

* Equipo: Equipo perfecto.
* Legal: Todo.
* Onboarding: Falta.
* Mentor: No han hablado.

## Omar Mendoza

* Equipos: Equipo bien. Tienes algunos golpes. 
* Legal: Todo.
* Onboarding: 
* Trabajó como soporte a cliente.
* Mentor: Si hablar.
* ***Pregunto: si las entregas son equipso***
* ***Pregunta: diseño orientado a entidad***

## Ricardo Valdivieso

* Equipo: Llego bien. Tiene problemas de conexión y fueron solucionadas.
* Legal: Todo.
* Onboarding: Falta
* Mejorar en la partición.
* Mejorar en el diseño.
* ***Preguntar los mentores***

## Ramón Álvarez

* Equipo: Tiene el equipo, pero tiene problemas de configuración que no lo dejan arrancar.

* Legal: No tiene listo.

* Onboarding: Falta

* Le pedí compromiso.

  



