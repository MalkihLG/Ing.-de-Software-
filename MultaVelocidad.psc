Algoritmo MultaVelocidad
		Definir velocidad, resultado Como Entero
		Definir cumple Como Logico
		Definir respuesta Como Cadena
		
		Escribir "Ingresa tu velocidad: "
		Leer velocidad
		
		Escribir "�Es tu cumplea�os?"
		Leer respuesta
		
		Si respuesta = "si" O respuesta = "SI" Entonces
			cumple = Verdadero
		Sino
			cumple = Falso
		FinSi
		
		Si cumple Entonces
			velocidad = velocidad - 5
		FinSi
		
		Si velocidad <= 60 Entonces
			resultado = 0
			Escribir "Sin multa"
		Sino
			Si velocidad <= 80 Entonces
				resultado = 1
				Escribir "Multa peque�a"
			Sino
				resultado = 2
				Escribir "Multa grande"
			FinSi
		FinSi
		
		Escribir "El resultado es: ", resultado
FinAlgoritmo

