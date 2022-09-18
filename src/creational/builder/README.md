<h1 align="center">
  Builder
</h1>

<br>

# Propósito
O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

<br>

# Aplicabilidade
  Use o padrão Builder quando você quer que seu código seja capaz de criar diferentes representações do mesmo produto (por exemplo, casas de pedra e madeira).
  O padrão Builder pode ser aplicado quando a construção de várias representações do produto envolvem etapas similares que diferem apenas nos detalhes.
  A interface base do builder define todas as etapas de construção possíveis, e os buildrs concretos implementam essas etapas para construir representações particulares do produto. Enquanto isso, a classe diretor guia a ordem de construção.
  <br>
# Prós e contras
 <br>
 ✔  Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
 <br>
 ✔ Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
 <br>
 ✔ Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.
 <br>
 ✔ Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.
 <br>
 ✘   A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.
 