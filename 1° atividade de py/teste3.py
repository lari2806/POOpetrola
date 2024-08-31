name = (input("Qual seu nome?\n"))
horario = int(input("Informe um horário: "))
if horario >= 5 and horario <= 11:
    print("bom dia " + name)
elif horario >= 12 and horario <= 18:
    print("boa tarde "+ name)
elif horario >= 19 and horario <= 23:
    print("boa noite "+ name)
elif horario >= 0 and horario <= 4:
    print(" VAI DORMIR "+ name)
else:
    print("esse horário não existe")
