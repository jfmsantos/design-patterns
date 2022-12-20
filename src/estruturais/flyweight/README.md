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
  Flyweight
</h3>

<br>

# Propósito
 
O Flyweight é um padrão de projeto estrutural que permite a você colocar mais objetos na quantidade de RAM disponível ao compartilhar partes comuns de estado entre os múltiplos objetos ao invés de manter todos os dados em cada objeto. 

<br> 

# Aplicabilidade

  Utilize o padrão Flyweight apenas quando seu programa deve suportar um grande número de objetos que mal cabem na RAM disponível.
  O benefício de aplicar o padrão depende muito de como e onde ele é usado. Ele é mais útil quando:

uma aplicação precisa gerar um grande número de objetos similares
isso drena a RAM disponível no dispositivo alvo
os objetos contém estados duplicados que podem ser extraídos e compartilhados entre múltiplos objetos
  
  <br>
  
# Prós e contras
 
 <br>
✔   Você pode economizar muita RAM, desde que seu programa tenha muitos objetos similares.
 <br>
✘   Você pode estar trocando RAM por ciclos de CPU quando parte dos dados de contexto precisa ser recalculado cada vez que alguém chama um método flyweight.
<br>
✘	O código fica muito mais complicado. Novos membros de equipe sempre se perguntarão por que o estado de uma entidade foi separado de tal forma.
