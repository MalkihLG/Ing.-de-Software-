Algoritmo MultaVelocidad
    Definir velocidad Como Entero
    Definir cumple Como Cadena
	
    Escribir "Ingresa tu velocidad: "
    Leer velocidad
	
    Escribir "�Es tu cumplea�os? (si/no): "
    Leer cumple
	
    Si cumple = "si" O cumple = "SI" Entonces
        Escribir "No tienes una multa porque es tu cumplea�os"
    Sino
        Si velocidad < 60 Entonces
            Escribir "No tienes multa."
        Sino
            Si velocidad <= 80 Entonces
                Escribir "Tienes una multa peque�a."
            Sino
                Escribir "Tienes una multa grande."
            FinSi
        FinSi
    FinSi
FinAlgoritmo
