name = (input("Qual seu nome?\n"))
num = int(input("Informe um horário: "))
if num >= 5 and num <= 11:
    print("bom dia " + name)
elif num >= 12 and num <= 18:
    print("boa tarde "+ name)
elif num >= 19 and num <= 23:
    print("boa noite "+ name)
elif num >= 0 and num <= 4:
    print(" VAI DORMIR "+ name)
else:
    print("esse horário não existe")
