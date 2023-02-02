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
  Padrões Comportamentais
</h1>

<p align="center">
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/chain_of_responsibility">Chain of Responsibility</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/command">Command</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/iterator">Iterator</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/mediator">Mediator</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/memento">Memento</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/observer">Observer</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/state">State</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/strategy">Strategy</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/template">Template</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/visitor">Visitor</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

<h3 align="center">
  Visitor
</h3>

<h3 align="left">
  Propósito
</h3>

O Visitor é um padrão de projeto comportamental que permite que você separe algoritmos dos objetos nos quais eles operam.

<h3 align="left">
  Aplicabilidade
</h3>

  Utilize o Visitor quando você precisa fazer uma operação em todos os elementos de uma estrutura de objetos complexa (por exemplo, uma árvore de objetos).

 O padrão Visitor permite que você execute uma operação sobre um conjunto de objetos com diferentes classes ao ter o objeto visitante implementando diversas variantes da mesma operação, que correspondem a todas as classes alvo.

 Utilize o Visitor para limpar a lógica de negócio de comportamentos auxiliares.

 O padrão permite que você torne classes primárias de sua aplicação mais focadas em seu trabalho principal ao extrair todos os comportamentos em um conjunto de classes visitantes.

 Utilize o padrão quando um comportamento faz sentido apenas dentro de algumas classes de uma uma hierarquia de classe, mas não em outras.

 Você pode extrair esse comportamento para uma classe visitante separada e implementar somente aqueles métodos visitantes que aceitam objetos de classes relevantes, deixando o resto vazio.

<h3 align="left">
  Prós e contras
</h3>

 ✔   Princípio aberto/fechado. Você pode introduzir um novo comportamento que pode funcionar com objetos de diferentes classes sem mudar essas classes.
 <br>
 ✔  Princípio de responsabilidade única. Você pode mover múltiplas versões do mesmo comportamento para dentro da mesma classe.
 <br>
 ✔  Um objeto visitante pode acumular algumas informações úteis enquanto trabalha com vários objetos. Isso pode ser interessante quando você quer percorrer algum objeto de estrutura complexa, tais como um objeto árvore, e aplicar o visitante para cada objeto da estrutura.
 <br>
  ✘		 Você precisa atualizar todos os visitantes a cada vez que a classe é adicionada ou removida da hierarquia de elementos.
 <br>
 ✘		Visitantes podem não ter seu acesso permitido para campos e métodos privados dos elementos que eles deveriam estar trabalhando.
 
