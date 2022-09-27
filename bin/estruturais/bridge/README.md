<h1 align="center">
  Bridge
</h1>

<br>

# Propósito
 
O O Bridge é um padrão de projeto estrutural que permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas—abstração e implementação—que podem ser desenvolvidas independentemente umas das outras.

<br> 

# Aplicabilidade

  Utilize o padrão Bridge quando você quer dividir e organizar uma classe monolítica que tem diversas variantes da mesma funcionalidade (por exemplo, se a classe pode trabalhar com diversos servidores de base de dados).
  Quanto maior a classe se torna, mais difícil é de entender como ela funciona, e mais tempo se leva para fazer mudanças. As mudanças feitas para uma das variações de funcionalidade podem precisar de mudanças feitas em toda a classe, o que quase sempre resulta em erros ou falha em lidar com efeitos colaterais.
  O padrão Bridge permite que você divida uma classe monolítica em diversas hierarquias de classe. Após isso, você pode modificar as classes em cada hierarquia independentemente das classes nas outras. Essa abordagem simplifica a manutenção do código e minimiza o risco de quebrar o código existente.
  <br>
  
# Prós e contras
 
 <br>
✔  Você pode criar classes e aplicações independentes de plataforma.
 <br>
✔ O código cliente trabalha com abstrações em alto nível. Ele não fica exposto a detalhes de plataforma.
 <br>
✔ Princípio aberto/fechado. Você pode introduzir novas abstrações e implementações independentemente uma das outras.
 <br>
✔ Princípio de responsabilidade única. Você pode focar na lógica de alto nível na abstração e em detalhes de plataforma na implementação.
 <br>
✘  Você pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa.
 