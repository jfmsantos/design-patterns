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
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/template">Template Method</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/comportamentais/visitor">Visitor</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

<h3 align="center">
  Template Method
</h3>

<h3 align="left">
  Propósito
</h3>

O Template Method é um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.

<h3 align="left">
  Aplicabilidade
</h3>

  Utilize o padrão Template Method quando você quer deixar os clientes estender apenas etapas particulares de um algoritmo, mas não todo o algoritmo e sua estrutura.

 O Template Method permite que você transforme um algoritmo monolítico em uma série de etapas individuais que podem facilmente ser estendidas por subclasses enquanto ainda mantém intacta a estrutura definida em uma superclasse.

 Utilize o padrão quando você tem várias classes que contém algoritmos quase idênticos com algumas diferenças menores. Como resultado, você pode querer modificar todas as classes quando o algoritmo muda.

 Quando você transforma tal algoritmo em um Template Method, você também pode erguer as etapas com implementações similares para dentro de uma superclasse, eliminando duplicação de código. Códigos que variam entre subclasses podem permanecer dentro das subclasses.

<h3 align="left">
  Prós e contras
</h3>

 ✔   Você pode deixar clientes sobrescrever apenas certas partes de um algoritmo grande, tornando-os menos afetados por mudanças que acontece por outras partes do algoritmo.
 <br>
 ✔  Você pode elevar o código duplicado para uma superclasse.
 <br>
 ✔  Você pode substituir a herança por composição.
 <br>
  ✘		Alguns clientes podem ser limitados ao fornecer o esqueleto de um algoritmo.
 <br>
 ✘		Você pode violar o princípio de substituição de Liskov ao suprimir uma etapa padrão de implementação através da subclasse.
 <br>
 ✘		 Implementações do padrão Template Method tendem a ser mais difíceis de se manter quanto mais etapas eles tiverem
