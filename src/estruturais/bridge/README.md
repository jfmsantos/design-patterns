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

<p align="center">
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais/adapter">Adapter</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais/bridge">Bridge</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais/composite">Composite</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais/decorator">Decorator</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais/facade">Facade</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais/flyweight">Flyweight</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jfmsantos/design-patterns/tree/master/src/estruturais/proxy">Proxy</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

<h3 align="center">
  Bridge
</h3>

<h3 align="left">
  Propósito
</h3>
 
O O Bridge é um padrão de projeto estrutural que permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas—abstração e implementação—que podem ser desenvolvidas independentemente umas das outras.

<h3 align="left">
  Aplicabilidade
</h3>

  Utilize o padrão Bridge quando você quer dividir e organizar uma classe monolítica que tem diversas variantes da mesma funcionalidade (por exemplo, se a classe pode trabalhar com diversos servidores de base de dados).
  Quanto maior a classe se torna, mais difícil é de entender como ela funciona, e mais tempo se leva para fazer mudanças. As mudanças feitas para uma das variações de funcionalidade podem precisar de mudanças feitas em toda a classe, o que quase sempre resulta em erros ou falha em lidar com efeitos colaterais.
  O padrão Bridge permite que você divida uma classe monolítica em diversas hierarquias de classe. Após isso, você pode modificar as classes em cada hierarquia independentemente das classes nas outras. Essa abordagem simplifica a manutenção do código e minimiza o risco de quebrar o código existente.

<h3 align="left">
  Prós e contras
</h3>

✔  Você pode criar classes e aplicações independentes de plataforma.
 <br>
✔ O código cliente trabalha com abstrações em alto nível. Ele não fica exposto a detalhes de plataforma.
 <br>
✔ Princípio aberto/fechado. Você pode introduzir novas abstrações e implementações independentemente uma das outras.
 <br>
✔ Princípio de responsabilidade única. Você pode focar na lógica de alto nível na abstração e em detalhes de plataforma na implementação.
 <br>
✘  Você pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa.
 
