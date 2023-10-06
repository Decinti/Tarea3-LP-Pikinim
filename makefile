# Definir el compilador
JCC = javac

# Definir la bandera -g para depuración
JFLAGS = -g

# Definir el archivo de entrada y salida
MAIN = Juego
CLASSES = Pikinim.class Zona.class Enemigo.class Pieza.class Pildora.class Muralla.class ILevantable.class

# Compilar el código fuente en bytecode
all: $(MAIN).class

# Compilar Main.java y generar Main.class
$(MAIN).class: $(MAIN).java $(CLASSES)
	$(JCC) $(JFLAGS) $(MAIN).java

# Compilar cada una de las clases
Pikinim.class: Pikinim.java
	$(JCC) $(JFLAGS) Pikinim.java

Zona.class: Zona.java
	$(JCC) $(JFLAGS) Zona.java

Enemigo.class: Enemigo.java
	$(JCC) $(JFLAGS) Enemigo.java

Pieza.class: Pieza.java
	$(JCC) $(JFLAGS) Pieza.java

Pildora.class: Pildora.java
	$(JCC) $(JFLAGS) Pildora.java

Muralla.class: Muralla.java
	$(JCC) $(JFLAGS) Muralla.java

ILevantable.class: ILevantable.java
	$(JCC) $(JFLAGS) ILevantable.java

# Ejecutar el programa
run:
	java $(MAIN)

# Limpiar los archivos .class
clean:
	$(RM) *.class
