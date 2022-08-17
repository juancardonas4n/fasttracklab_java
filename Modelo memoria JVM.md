# Modelo de memoria JVM

* Variables, apuntadores, referencias y constantes
* Pila (*Stack*) y Montículo (*Heap*)
* Problemas de punteros
* Paso de parámetros
* Dibujo de diagrama Pila-Montículo (*Stack-Heap*)
* Escape de referencias

---

# Modelo de memoria - Variables, apuntadores, referencias y constantes

* Variable: es un *objeto* cuyo valor almacenado puede cambiar durante la ejecución
  * Tiene atributos:
    * Nombre
    * Localización 
    * Tipo de datos
    * Tamaño
    * Valor
* Valor: 
  * `r-value`
  * `l-value`
* Apuntador: es un *objeto* que contiene una localización de una variable
* Referencia: es un *objeto* que contiene una localización *oculta* de una variable
* Constante: es una identidad del lenguaje que tiene un valor fijo durante la ejecución
* Alias: es un *objeto* que tiene más de una identidad a una misma localización

---

## Modelo de memoria - Pila (*Stack*) y Montículo (*Heap*)

* Pila
  * Tipos primitivos
  * Tipos objetos (Referencias)
* Montículos
  * Objetos (Referidos)

---

# Modelo de memoria - Problemas de punteros

* Apuntador colgante (*Dangling Pointer*)
  > Es un apuntador que contiene la dirección de una variable 
  > que ha sido delocalizada.
* Variable dinámica de pila perdida (*Lost Heap-Dynamic Variable* o *Memory leakage*)
  > Es una variable localizada dinámicamente en el montículo
  > que no es más accesible a los programas de usuario
  > Se conocen como basura (*garbage*)

---

## Modelo de memoria - Paso de parámetros

* Por valor
* Por dirección
* Por referencia

---

## Modelo de memoria - Dibujo de diagrama Pila-Montículo (*Stack-Heap*)

```java
public class Main {
   public static void main(String args[]) {
      Main main = new Main();
      main.start();
   }
   public void start() {
      String last = "Z";
      Container container = new Container();
      container.setInitial("C");
      another(container,last);
      System.out.print(container.getInitial());
   }
   public void another(Container initialHolder, String newInitial) {
      newInitial.toLowerCase();
      initialHolder.setInitial("B");
      Container initial2 = new Container();
      initialHolder=initial2;
      System.out.print(initialHolder.getInitial());
      System.out.print(newInitial);
   }}
public class Container {
   private String initial = "A";
   public String getInitial() {
      return initial;
   }
   public void setInitial(String initial) {
      this.initial = initial;
   }}
```

---

## Modelo de memoria - Escape de referencias

* Es una violación del encapsulamiento
* El contenido de un objeto esta disponible y pude ser modificado externamente

---

## Modelo de memoria - Escape de referencias

```java
public class Thing {
    public Thing (Leaker leaker) {
        leaker.leak(this);
    }
}

public class NamedThing  extends Thing {
    private String name;

    public NamedThing (Leaker leaker, String name) {
        super(leaker);

    }

    public String getName() {
        return name; 
    }
}
```
