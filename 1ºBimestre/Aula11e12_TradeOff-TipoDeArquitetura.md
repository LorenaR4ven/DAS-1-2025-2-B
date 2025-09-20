### Trade-offs
> Compensação - é impossivel criar algo totalmente perfeito.

Um exemplo é o sistema de leilão, onde abrimos mão da simplicidade para ganhar mais performance - Mudando a arquitetura - como um bando de dados unico não consegue aguentar um sistema grande, ele causa a perda de desempenho. Ajustamos então para uma lógica de observer, por exemplo, onde uma mesma mensagem é enviadas para todos os sistemas que precisam dessa informação para o leilão ocorrer.

#### Arquitetura em tópico
Tipo um observer, envia uma mensagem e os inscritos recebem como uma notificação. Porém se o inscrito não estiver disposnivel, a mensagem é perdida. 
Exemplo: _Notificação de promoção, ela ocorre automaticamente após você assinar_

- **Um para Muitos**

#### Arquitetura em Fila
Nessa arquitetura o recebedor deve buscar a sua mensagem na fila, que é uma para cada serviço. Quando ele buscar, o recebedor deve procecessar a sua própria mensagem. Além disso o anunciador envia uma cópia da mensagem para cada um, com a fila para armazenar a ordem da mensagem. O que gera redundancia, mas compensamos com a possibilidade de armazenamento, que evita a perda da mensagem.

- **Um para Um**

#### Diferença entre Tópico e fila

Em tópicos existe apenas uma conexão, a escalabilidade é maior - gerando menos impacto - Porem, mesmo não tendo acoplamento, o anunciador tem que enviar uma grande mensagem para suprir os três sistemas acoplados ao tópico.  
Já a Fila, precisamos mudar e adicionar mais do que um novo sistema, adicionando mais filas - Maoior aclopamento - Porém, agora podemos enviar mensagens menores e separadas para cada um.

#### Fan-out

Uma arquitetura que mistura, tópicos e filas. Resolve problemas de acoplamento, buffer's e monitoramentos. Mas ainda não é resolvido o envio de mensagens personalizadas, já que ainda estamos usando a arquitetura de tópicos.
