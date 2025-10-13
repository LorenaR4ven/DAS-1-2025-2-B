# Command Query Responsibility Segregation (CQRS)

O Pattern CQRS mostra a separação de responsabilidades entre bancos, permitindo que seja dividindo as cargas entre bancos. Onde um somente escreve e outro somente lê. Mas por que isso é necessário? Pela escalabilidade, já que tradicionalmente, bancos de dados operam com um único modelo para leitura e escrita, o que limita sua capacidade de expansão. A escalabilidade vertical — aumentar os recursos de hardware do servidor — é cara e possui limites físicos. Embora alguns bancos modernos já adotem estratégias de escalabilidade horizontal, essa abordagem ainda não é amplamente implementada. 

> Com esse padrão, entregamos desempenho e escalabilidade, em troca de custo. Mesmo economizando com recursos gasto na escalabilidade vertical, o custo virá com mais de um banco.


## Tipos de arquiteturas

#### Arquitetura Unitária

Onde era considerado e programado em uma única entidade, distribuindo de forma física.

#### Arquitetura Cliente/Servidor

Aqui começa a dividir responsabilidades, mandando front-end para o cliente e o back-end permanece no servidor. E é uma arquitetura que consiste em duas camadas.

#### Desktop + Servidor de Banco de Dados

Nessa arquitetura boa parte da lógica está no banco de dados, mas ainda permanecemos com lógica de apresentação em cada computador do cliente. Onde é preciso atualizar um por um, em casos de mudanças.

#### Navegador + Servidor Web

Essa arquitetura é a que mantemos atualmente, onde o servidor web é o que acessa o banco de dados. Com isso permite uma ampla distribuição, o que significa que o cliente atualiza “automaticamente”. 

> Uma segunda geração é o web enviar e receber apenas json - dados - e a lógica de apresentação volta ao cliente, já que atualmente as maquinas são mais poderosas.
