<h1 align="center">
  Command
</h1>

<br>

# Propósito
O Command é um padrão de projeto comportamental que transforma um pedido em um objeto independente que contém toda a informação sobre o pedido. Essa transformação permite que você parametrize métodos com diferentes pedidos, atrase ou coloque a execução do pedido em uma fila, e suporte operações que não podem ser feitas.

<br>

# Aplicabilidade
  Utilize o padrão Command quando você quer parametrizar objetos com operações.
  O padrão Command podem tornar uma chamada específica para um método em um objeto separado. Essa mudança abre várias possibilidades de usos interessantes: você pode passar comandos como argumentos do método, armazená-los dentro de outros objetos, trocar comandos ligados no momento de execução, etc.
   Utilize o padrão Command quando você quer colocar operações em fila, agendar sua execução, ou executá-las remotamente.
   Como qualquer outro objeto, um comando pode ser serializado, o que significa convertê-lo em uma string que pode ser facilmente escrita em um arquivo ou base de dados. Mais tarde a string pode ser restaurada no objeto comando inicial. Dessa forma você pode adiar e agendar execuções do comando. Mas isso não é tudo! Da mesma forma, você pode colocar em fila, fazer registro de log ou enviar comandos por uma rede.
   Utilize o padrão Command quando você quer implementar operações reversíveis.
   Para ser capaz de reverter operações, você precisa implementar o histórico de operações realizadas. O histórico do comando é uma pilha que contém todos os objetos comando executados junto com seus backups do estado da aplicação relacionados.
 <br>
# Prós e contras
 <br>
 ✔   Princípio de responsabilidade única. Você pode desacoplar classes que invocam operações de classes que fazem essas operações.
 <br>
 ✔ Princípio aberto/fechado. Você pode introduzir novos comandos na aplicação sem quebrar o código cliente existente.
 <br>
 ✔ Você pode implementar desfazer/refazer.
 <br>
 ✔ Você pode implementar a execução adiada de operações.
  <br>
 ✔ Você pode montar um conjunto de comandos simples em um complexo.
 <br>
 ✘   O código pode ficar mais complicado uma vez que você está introduzindo uma nova camada entre remetentes e destinatários.
 
