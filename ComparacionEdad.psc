Proceso ComparacionEdad
    Definir edad Como Entero
	
    // Pedir la edad 
    Escribir "Introduce tu edad: "
    Leer edad
	
    // Usar estructuras condicionales
    Si edad < 18 Entonces
        Escribir "Menor de edad."
    Sino
        Si edad < 65 Entonces
            Escribir "Mayor de edad."
        Sino
            Escribir "Adulto mayor."
        FinSi
    FinSi
FinProceso
