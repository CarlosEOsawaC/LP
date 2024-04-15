# Projeto Lotofácil
## 1. Como acessar:
#### Sem interface gráfica:
Proj_lotofacil > src > Main
#### Com interface gráfica:
Proj_lotofacil > src > LotofacilGUI
## 2. Detalhes do projeto:
- É um sistema de loteria chamado LOTOFÁCIL escrito em Java. O sistema é capaz de gerar jogos aleatórios, permitir que os jogadores façam suas apostas, verificar os resultados e calcular prêmios de acordo com as regras da loteria.
- Foi criado um menu para o usuário selecionar o tipo de aposta desejada:
#### Sem interface gráfica:

![Captura de tela 2024-04-02 152609](https://github.com/CarlosEOsawaC/LP/assets/164787161/163c539e-4fd1-4299-810e-0476cd7beea8)
#### Com interface gráfica:

![Captura de tela 2024-04-14 215501](https://github.com/CarlosEOsawaC/LP/assets/164787161/2cdd8787-07f3-45ba-b9bf-67d9e724502c)
### Aposta de 0 à 100:
  - O programa vai ler um número inteiro via teclado, de 0 a 100, caso o número seja maior que 100 ou menor que 0, a mensagem: “Aposta inválida.” será impressa.
  - Caso o usuário acerte a aposta, a mensagem “Você ganhou R$ 1.000,00 reais.” será impressa. Caso o usuário erre, a mensagem: “Que pena! O número sorteado foi: X.” será impressa.
#### Sem interface gráfica:

![Captura de tela 2024-04-02 161337](https://github.com/CarlosEOsawaC/LP/assets/164787161/28b486ab-479f-4d76-8150-e756bb760bee)

![Captura de tela 2024-04-02 162256](https://github.com/CarlosEOsawaC/LP/assets/164787161/f9594f05-9426-46fe-8f78-a5fef80dc335)
#### Com interface gráfica:

![Captura de tela 2024-04-14 220658](https://github.com/CarlosEOsawaC/LP/assets/164787161/ff01e98f-f440-427e-903d-3c954882c151)

![Captura de tela 2024-04-14 221014](https://github.com/CarlosEOsawaC/LP/assets/164787161/c8713965-fd22-45c5-81d6-752aca5f9a71)

![Captura de tela 2024-04-14 221224](https://github.com/CarlosEOsawaC/LP/assets/164787161/a0e10174-2b89-4f74-8991-e1bc45b5be48)
### Aposta de A à Z:
  - O programa vai ler um char via teclado, de A à Z, podendo ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, a mensagem: “Aposta inválida.” será impressa.
  - Caso o usuário acerte a aposta, a mensagem “Você ganhou R$ 500,00 reais.” será impressa. Caso o usuário erre, a mensagem: “Que pena! A letra sorteada foi: X.” será impressa.
#### Sem interface gráfica:

![Captura de tela 2024-04-02 163913](https://github.com/CarlosEOsawaC/LP/assets/164787161/845810fe-d7c1-41df-b47c-93510e6ea172)

![Captura de tela 2024-04-14 221728](https://github.com/CarlosEOsawaC/LP/assets/164787161/8ff61ba4-7c50-4427-96d3-66f281998e78)

![Captura de tela 2024-04-02 164041](https://github.com/CarlosEOsawaC/LP/assets/164787161/090619fc-d4ce-4456-9fe6-c1354c946237)
#### Com interface gráfica:

![Captura de tela 2024-04-14 222220](https://github.com/CarlosEOsawaC/LP/assets/164787161/2bc9e7cf-38fe-4c58-a275-1c65db99d338)

![Captura de tela 2024-04-14 222502](https://github.com/CarlosEOsawaC/LP/assets/164787161/25dd47f2-afee-4344-89ac-a57331934a7b)

![Captura de tela 2024-04-14 222931](https://github.com/CarlosEOsawaC/LP/assets/164787161/86528c66-c8ea-4ce8-b064-b0feb722f555)
### Aposta em par ou ímpar:
  - O programa vai ler um número inteiro via teclado.
  - Se o número digitado for par, a mensagem: “Você ganhou R$ 100,00 reais.” será impressa. Caso o usuário digite um número ímpar, a mensagem: “Que pena! O número digitado é ímpar e a premiação foi para números pares.” será impressa.
#### Sem interface gráfica:

![Captura de tela 2024-04-02 165241](https://github.com/CarlosEOsawaC/LP/assets/164787161/4f42d276-523d-4650-9a3d-0051b4093126)

![Captura de tela 2024-04-02 165449](https://github.com/CarlosEOsawaC/LP/assets/164787161/9da145c9-23cb-4c2a-80ed-bb047662a338)
#### Com interface gráfica:

![Captura de tela 2024-04-14 223634](https://github.com/CarlosEOsawaC/LP/assets/164787161/80863e77-8c25-4771-bc9f-9c0d2d3956db)

![Captura de tela 2024-04-14 223843](https://github.com/CarlosEOsawaC/LP/assets/164787161/2ccbb539-b9bf-438d-adce-6f8d03160957)

![Captura de tela 2024-04-14 224140](https://github.com/CarlosEOsawaC/LP/assets/164787161/554577c6-7f8a-4f49-be10-688c205971a8)
### Sair:
#### Sem interface gráfica:
  - Ao digitar 0 o programa irá finalizar sua execução.
  - Enquanto o usuário não digitar 0, para sair, novas apostas serão permitidas.

![Captura de tela 2024-04-02 165951](https://github.com/CarlosEOsawaC/LP/assets/164787161/638653e3-fa11-43c1-bb7b-f31123c349c0)
#### Com interface gráfica:
- Para finalizar a execução basta fechar a janela do programa no icone "X".

![Captura de tela 2024-04-14 225414](https://github.com/CarlosEOsawaC/LP/assets/164787161/683b3fcb-f852-413b-81c8-e1ac00a4da65)
## 3. Bibliotecas utilizadas:
### Projeto sem interface gráfica:
- java.util.Scanner
- java.util.Ramdom
### Projeto com interface gráfica:
- javax.swing.*
- java.awt.*
- java.awt.event.ActionEvent
- java.awt.event.ActionListener
- java.util.Random
## 4. Versão JDK do projeto:
openjdk-22 (OpenJDK version 22)
