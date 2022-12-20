<h5 align="center">
<table align="center">
  <tr>
    <td><a href="https://github.com/jfmsantos/design-patterns">«« </a></td>
    <td><a href="https://github.com/jfmsantos/design-patterns/tree/master/src/creational">Padrões criacionais</a></td>
    <td><a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais">Padrões estruturais</a></td>
    <td><a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais">Padrões comportamentais</a></td>
  </tr>
</table>
</h5>

<h1 align="center">
  Padrões Criacionais
</h1>

<p align="center">
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/creational/factoryMethod">Factory Method</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/creational/abstractFactory">Abstract Factory</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/creational/builder">Builder</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/creational/prototype">Prototype</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/creational/singleton">Singleton</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

<h3 align="center">
  Singleton
</h3>

<h3 align="left">
  Prós e contras
</h3>
O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.

<h3 align="left">
  Aplicabilidade
</h3>

  Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.
   O padrão Singleton desabilita todos os outros meios de criar objetos de uma classe exceto pelo método especial de criação. Esse método tanto cria um novo objeto ou retorna um objeto existente se ele já tenha sido criado.

<h3 align="left">
  Prós e contras
</h3>

 ✔  Você pode ter certeza que uma classe só terá uma única instância.
 <br>
 ✔ Você ganha um ponto de acesso global para aquela instância.
 <br>
 ✔ O objeto singleton é inicializado somente quando for pedido pela primeira vez.
 <br>
  ✘    Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.
  <br>
  ✘   O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem muito sobre cada um.
  <br>
  ✘ O padrão requer tratamento especial em um ambiente multithreaded para que múltiplas threads não possam criar um objeto singleton várias vezes.
  <br>
  ✘ Pode ser difícil realizar testes unitários do código cliente do Singleton porque muitos frameworks de teste dependem de herança quando produzem objetos simulados. Já que o construtor da classe singleton é privado e sobrescrever métodos estáticos é impossível na maioria das linguagem, você terá que pensar em uma maneira criativa de simular o singleton. Ou apenas não escreva os testes. Ou não use o padrão Singleton.
  
 
