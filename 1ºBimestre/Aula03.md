# O QUE É SOLID?
###### _Capitulo 5.6_
> **S**ingle Responsibility Principle.<br> 
> **O**pen/Closed Principle.<br>
> **L**iskov Substitution Principle.<br>
> **I**nterface Segregation Principle.<br>
> **D**ependency Inversion Principle.

É um acrônimo criado por Robert Martin para auxiliar programadores a desenvolverem orientação a objetos do “jeito certo”. Ou seja, um código bem construído e escrito que tem o intuito de facilitar tanto o desenvolvimento, mas principalmente a manutenção do mesmo.
##### _Single Responsibility Principle_
Diretamente ligado a coesão, onde toda classe deve ter uma única responsabilidade. Mas ainda consiste em ter um motivo para modificar qualquer classe em um sistema.
Com isso, definimos que cada parte - como entity, repository, service e controller - devem ter sua responsabilidade bem definida. No entity, por exemplo, trabalha com dados. A lógica se aplica ao service, se o controller tiver alguma responsabilidade relacionada à lógica, não está mais sendo aplicado o princípio de responsabilidade única.

##### _Interface Segregation Principle_
Cada interface tem uma responsabilidade, ou seja, classes não utilizam a mesma interface. Mas fazer código e interface juntos, quebra o primeiro princípio da responsabilidade única. Então, como resolvemos esse problema? Quando estamos desenvolvendo, devemos criar um controlador, que irá então implementar a interface e observar eventos.


#### Extras:
##### _Tipos de setas:_
> - Seta de herança (extends)- seta vazada com linha cheia.
> - Seta de interface/implementação (implements)- seta vazada com linha tracejada.
> - Seta da Associação (dependency) - seta cheia com linha cheia.
