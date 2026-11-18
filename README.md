# PetBath

Exercício em Java para controle de uma máquina de banho de um petshop.

## Enunciado

Escreva um código onde temos o controle de banho de um petshop. A máquina de banhos dos pets deve ter as seguintes operações:

- Dar banho no pet;
- Abastecer com água;
- Abastecer com shampoo;
- Verificar nível de água;
- Verificar nível de shampoo;
- Verificar se tem pet no banho;
- Colocar pet na máquina;
- Retirar pet da máquina;
- Limpar máquina.

## Regras de implementação

- A máquina de banho deve permitir somente 1 pet por vez;
- Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
- A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
- Se o pet for retirado da máquina sem estar limpo, será necessário limpar a máquina para permitir a entrada de outro pet;
- A limpeza da máquina irá consumir 3 litros de água e 1 litro de shampoo;
- O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado.

## Estrutura

- `Main.java`: menu interativo no console;
- `PetMachine.java`: regras e operações da máquina de banho;
- `Pet.java`: representa o pet (nome e se está limpo).

## Como executar

Abra o projeto no IntelliJ IDEA e execute a classe `Main`.
