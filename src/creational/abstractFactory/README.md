<h1 align="center">
  Abstract Factory
</h1>

<br>

# Propósito
 
O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

<br> 

# Aplicabilidade

  Use o Abstract Factory quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que você não quer depender de classes concretas daqueles produtos-eles podem ser desconhecidos de antemão ou você simplesmente quer permitir uma futura escalabilidade.
  O Abstract Factory fornece a você uma interface para a criação de objetos de cada classe das famílias de produtos. Desde que seu código crie objetos a partir dessa interface, você não precisará se preocupar em criar uma variante errada de um produto que não coincida com produtos já criados por sua aplicação.
  <br>
  
# Prós e contras
 
 <br>
✔  Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.
 <br>
✔ Você evita um vínculo forte entre produtos concretos e o código cliente.
 <br>
✔ Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção.
 <br>
✔ Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.
 <br>
✘  O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são introduzidas junto com o padrão.
 
