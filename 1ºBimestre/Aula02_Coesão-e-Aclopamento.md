# O que é Coesão?
##### Capitulo 5.4

Um código com coesão — ou coeso — significa ter o mínimo de codificação para realizar uma tarefa bem feita. Ele implementa uma única funcionalidade claramente, e não deve interferir em outras classes. Isso facilita a implementação, entendimento e por fim a manutenção. Pois somente um é responsável por manter um método.

## O que é Aclopamento?

> _Setas de associação - que cria váriavel entre classes.

O acoplamento ocorre quando uma parte do código está diretamente ligada a outra. Quando esse vínculo torna os componentes totalmente dependentes entre si, onde pode gerar problemas futuros: _qualquer alteração em um módulo afetará automaticamente os seus dependentes, já que eles compartilham elementos essenciais._
Por outro lado, um acoplamento considerado saudável ou aceitável é aquele que _permite modificações ou substituições em seus elementos sem impactar outras áreas do sistema._ Esse tipo de acoplamento favorece a flexibilidade, a manutenção e a evolução do código ao longo do tempo. 
> **_Maximize coesão, e minimine aclopamentos_**
