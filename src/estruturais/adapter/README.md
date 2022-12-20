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
  Padrões Estruturais
</h1>

<h3 align="center">
  Adapter
</h3>

<br>

# Propósito
 
O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.

<br> 

# Aplicabilidade

  Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o resto do seu código.
   O padrão Adapter permite que você crie uma classe de meio termo que serve como um tradutor entre seu código e a classe antiga, uma classe de terceiros, ou qualquer outra classe com uma interface estranha.
  <br>
  
# Prós e contras
 
 <br>
✔  Princípio de responsabilidade única. Você pode separar a conversão de interface ou de dados da lógica primária do negócio do programa.
 <br>
✔ Princípio aberto/fechado. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente existente, desde que eles trabalhem com os adaptadores através da interface cliente.
 <br>
✔ Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção.
 <br>
✘  A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas interfaces e classes. Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.
 
