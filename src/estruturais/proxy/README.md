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
  Proxy
</h3>

<br>

# Propósito
 
O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto ou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.

<br> 

# Aplicabilidade

  Inicialização preguiçosa (proxy virtual). Este é quando você tem um objeto do serviço peso-pesado que gasta recursos do sistema por estar sempre rodando, mesmo quando você precisa dele de tempos em tempos.
  
  <br>
 Controle de acesso (proxy de proteção). Este é quando você quer que apenas clientes específicos usem o objeto do serviço; por exemplo, quando seus objetos são partes cruciais de um sistema operacional e os clientes são várias aplicações iniciadas (incluindo algumas maliciosas).
  <br>
 Execução local de um serviço remoto (proxy remoto). Este é quando o objeto do serviço está localizado em um servidor remoto.
 <br>
 Registros de pedidos (proxy de registro). Este é quando você quer manter um histórico de pedidos ao objeto do serviço.
 <br>
 Cache de resultados de pedidos (proxy de cache). Este é quando você precisa colocar em cache os resultados de pedidos do cliente e gerenciar o ciclo de vida deste cache, especialmente se os resultados são muito grandes.
 <br>
 Referência inteligente. Este é para quando você precisa ser capaz de se livrar de um objeto peso-pesado assim que não há mais clientes que o usam.
 
  
# Prós e contras
 
 <br>
✔  Você pode controlar o objeto do serviço sem os clientes ficarem sabendo.
 <br>
✔ Você pode gerenciar o ciclo de vida de um objeto do serviço quando os clientes não se importam mais com ele.
<br>
✔ O proxy trabalha até mesmo se o objeto do serviço ainda não está pronto ou disponível.
<br>
✔ Princípio aberto/fechado. Você pode introduzir novos proxies sem mudar o serviço ou clientes.
<br>
✘    O código pode ficar mais complicado uma vez que você precisa introduzir uma série de novas classes.
<br>
✘ A resposta de um serviço pode ter atrasos.
