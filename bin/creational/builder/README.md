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
  Builder
</h3>

<br>

<h3 align="left">
  Propósito
</h3>
O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

<br>

<h3 align="left">
  Aplicabilidade
</h3>
  Use o padrão Builder quando você quer que seu código seja capaz de criar diferentes representações do mesmo produto (por exemplo, casas de pedra e madeira).
  O padrão Builder pode ser aplicado quando a construção de várias representações do produto envolvem etapas similares que diferem apenas nos detalhes.
  A interface base do builder define todas as etapas de construção possíveis, e os buildrs concretos implementam essas etapas para construir representações particulares do produto. Enquanto isso, a classe diretor guia a ordem de construção.
  <br>
<h3 align="left">
  Prós e contras
</h3>
 ✔  Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
 <br>
 ✔ Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
 <br>
 ✔ Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.
 <br>
 ✔ Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.
 <br>
 ✘   A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.
 
