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
  Prototype
</h3>

<br>

<h3 align="left">
  Propósito
</h3>
O Prototype é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

<h3 align="left">
  Aplicabilidade
</h3>
  Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.
 O padrão Prototype fornece o código cliente com uma interface geral para trabalhar com todos os objetos que suportam clonagem. Essa interface faz o código do cliente ser independente das classes concretas dos objetos que ele clona.
  Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração específica.
  O padrão Prototype permite que você use um conjunto de objetos pré construídos, configurados de diversas formas, como protótipos.
  Ao invés de instanciar uma subclasse que coincide com alguma configuração, o cliente pode simplesmente procurar por um protótipo apropriado e cloná-lo.
<h3 align="left">
  Prós e contras
</h3>
 ✔  Você pode clonar objetos sem acoplá-los a suas classes concretas.
 <br>
 ✔ Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.
 <br>
 ✔ Você pode produzir objetos complexos mais convenientemente.
 <br>
 ✔  Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.
 <br>
 ✘    Clonar objetos complexos que têm referências circulares pode ser bem complicado.
 
