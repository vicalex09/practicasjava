print("Ingrese una frase: ")
frase = input("")

palabras = frase.split()

print("Las palabras de tu frase son:", palabras)
for palabra in palabras:
    print(palabra.upper().center(20, "."))

print("¿Qué palabra quieres saber cuántas veces se repite?")
word = input()
print("Se repite", palabras.count(word), "veces")

print("¿Qué palabra vas a reemplazar?")
vieja = input()
print("Escriba la nueva palabra:")
nueva = input()

frase_nueva = frase.replace(vieja, nueva)

print("La nueva frase es:", frase_nueva)