# Linguagens de Programação
## Projeto Lotofácil
### 1. Detalhes do Projeto:
- É um sistema de loteria chamado LOTOFÁCIL escrito em Java. O sistema é capaz de gerar jogos aleatórios, permitir que os jogadores façam suas apostas, verificar os resultados e calcular prêmios de acordo com as regras da loteria.
- Foi criado um menu através das estruturas switch case e do while para o usuário selecionar o tipo de aposta desejada:
![Captura de tela 2024-04-02 152609](https://github.com/CarlosEOsawaC/LP/assets/164787161/163c539e-4fd1-4299-810e-0476cd7beea8)
#### Opção 1) Aposta de 0 à 100:
  - Utilizando a biblioteca Scanner, o programa vai ler um número inteiro via teclado, de 0 a 100, caso o número seja maior que 100 ou menor que 0, a mensagem: “Aposta inválida.” será impressa.
  - Caso o usuário acerte a aposta, a mensagem “Você ganhou R$ 1.000,00 reais.” será impressa. Caso o usuário erre, a mensagem: “Que pena! O número sorteado foi: X.” será impressa.

![Captura de tela 2024-04-02 161337](https://github.com/CarlosEOsawaC/LP/assets/164787161/28b486ab-479f-4d76-8150-e756bb760bee)

![Captura de tela 2024-04-02 162256](https://github.com/CarlosEOsawaC/LP/assets/164787161/f9594f05-9426-46fe-8f78-a5fef80dc335)

#### Opção 2) Aposta de A à Z:
  - O programa vai ler um char via teclado, de A à Z, podendo ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, a mensagem: “Aposta inválida.” será impressa.
  - Caso o usuário acerte a aposta, a mensagem “Você ganhou R$ 500,00 reais.” será impressa. Caso o usuário erre, a mensagem: “Que pena! A letra sorteada foi: X.” será impressa.

![Captura de tela 2024-04-02 163913](https://github.com/CarlosEOsawaC/LP/assets/164787161/845810fe-d7c1-41df-b47c-93510e6ea172)

![Captura de tela 2024-04-02 164041](https://github.com/CarlosEOsawaC/LP/assets/164787161/090619fc-d4ce-4456-9fe6-c1354c946237)

#### Opção 3) Aposta em par ou ímpar:
  - Utilizando a biblioteca Scanner, o programa vai ler um número inteiro via teclado.
  - Se o número digitado for par, a mensagem: “Você ganhou R$ 100,00 reais.” será impressa. Caso o usuário digite um número ímpar, a mensagem: “Que pena! O número digitado é ímpar e a premiação foi para números pares.” será impressa.

![Captura de tela 2024-04-02 165241](https://github.com/CarlosEOsawaC/LP/assets/164787161/4f42d276-523d-4650-9a3d-0051b4093126)

![Captura de tela 2024-04-02 165449](https://github.com/CarlosEOsawaC/LP/assets/164787161/9da145c9-23cb-4c2a-80ed-bb047662a338)

#### Opção 0) Sair:
  - Ao digitar 0 o programa irá finalizar sua execução.
  - Enquanto o usuário não digitar 0, para sair, novas apostas serão permitidas.

![Captura de tela 2024-04-02 165951](https://github.com/CarlosEOsawaC/LP/assets/164787161/638653e3-fa11-43c1-bb7b-f31123c349c0)

### 2. Bibliotecas Utilizadas:
- java.util.Scanner
- java.util.Ramdom
### 3. Versão JDK do projeto:
openjdk-22 (OpenJDK version 22)
