# Introdução <br>
###### _Capitulo 5.1_

##### John Ousterhout
_The most fundamental problem in computer science is problem decomposition: how to take a complex problem and divide it up into pieces that can be solved independently._

Atualmente temos que lidar com a complexidade de desenvolver sistemas modernos. Por isso, Ousterhout -- Um cientista da computação. Que desenvolveu a Tcl (Tool Command Language), amplamente utilizada em automações, testes e desenvolvimento de interfaces gráficas -- visa a decomposição de problemas. 
Por que? esse método permite a separação da complexidade, tornando mais "fácil" de entender e trabalhar em cima desse problema. Pois isso permite que cada parte seja independente.

### O que é orientação a objetos?

Surgiu como um modelo ou conjunto de padrões para resolver desafios. Onde se sustentam por quatro pilares:

**Encapsulamento**: que ocorre o agrupamento de dados e comportamentos de uma classe, podendo ocultar ou proteger informações para o resto do código.
Abstração: define interfaces que representam conceitos do domínio, sem expor detalhes.
Herança: permite criar hierarquias de classes, reaproveitando código e estendendo funcionalidades.
Polimorfismo: possibilita tratar objetos de diferentes classes uniformemente, quando compartilharem uma interface ou classe-base.

**_Mas quais as vantagens da programação orientada a objetos?_** A resposta é simples, um código organizado e eficiente… quando escrito da forma certa. A POO consiste em modularidade, que facilita a realização de testes e manutenções. Reutilização de código, utilizando herança e/ou interfaces. Escalabilidade, por ser organizado. E por fim, temos o encapsulamento, onde lógicas são isoladas e assim, facilitam modificações e são menos propensas a serem atingidas por outros códigos.

### Definindo a abstração:

> _Combatemos a complexidade criando abstrações, representando de forma bem simplificada, uma entidade_

Com a abstração, ainda conseguimos interagir e utilizar a entidade, sem a necessidade de saber todos os detalhes da mesma. Podemos ocultar informações, que são suscetíveis a mudanças, e mostrar somente uma interface estável. Para isso, utilizamos diversos timos de classes, como: entidades, repositórios, serviços, controladores, e entre outros.

### Padrões de código:
_Comumente conhecido como design patterns_

Auxiliam principalmente em problemas recorrentes, provendo soluções estruturais - fabrica, fachada, observador e outros - que promovem a robustez e coerência de um código. Soluções como essa, que já são “pré-definidas” utilizam da abstração e encapsulamento para ser possível de reutilizar da forma mais prática possível. Adaptando a diferentes tipos de códigos.

### Frameworks:

Um framework é uma estrutura técnica mais rígida que as bibliotecas convencionais. Pois eles controlam o fluxo da aplicação, estabelecendo pontos de extensão e oferecendo funcionalidades já prontas. Tudo com um padrão arquitetural definido que guia o desenvolvimento. Com isso, oferecem produtividade elevada, padronização e facilidade de manutenção.

### Complexidade? O que é e por que é recorrente?

A complexidade se dá com a evolução de um escopo, onde cresce conforme as funcionalidades e interações do sistema aumentam. Por isso, utilizamos da abstração, que quebra a complexidade em pequenos problemas, facilitando a solução. Vamos ver um exemplo: 

> ###### Um carro <br>
> Pode mostrar métodos publicos, como **acelerar** e **freiar**. <br>
> Enquanto isso temos o **motor**, um detalhe oculto do método.

Fazer isso, facilita a manutenção, sendo fácil de realizar alterações e alivia o esforço direcionado ao entendimento do código. Isso, sem impactar classes que usam esse método “Carro”.
