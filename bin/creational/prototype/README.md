<h1 align="center">
  Prototype
</h1>

<br>

# Propósito
O Prototype é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

<br>

# Aplicabilidade
  Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.
 O padrão Prototype fornece o código cliente com uma interface geral para trabalhar com todos os objetos que suportam clonagem. Essa interface faz o código do cliente ser independente das classes concretas dos objetos que ele clona.
  Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração específica.
  O padrão Prototype permite que você use um conjunto de objetos pré construídos, configurados de diversas formas, como protótipos.
  Ao invés de instanciar uma subclasse que coincide com alguma configuração, o cliente pode simplesmente procurar por um protótipo apropriado e cloná-lo.
  <br>
# Prós e contras
 <br>
 ✔  Você pode clonar objetos sem acoplá-los a suas classes concretas.
 <br>
 ✔ Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.
 <br>
 ✔ Você pode produzir objetos complexos mais convenientemente.
 <br>
 ✔  Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.
 <br>
 ✘    Clonar objetos complexos que têm referências circulares pode ser bem complicado.
 
