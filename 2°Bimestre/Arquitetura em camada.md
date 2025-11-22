# Arquitetura em camada
A arquitetura em camadas é o feijão com arroz das aplicações: simples, barata e fácil de entender. Funciona super bem para sistemas pequenos e é um ótimo ponto de partida — mas conforme o software cresce, costuma ser necessário migrar para algo mais robusto.
Agora, como ela funciona? É organizada em camadas “horizontais” onde cada tem uma responsabilidade específica. Segue a mesma lógica da arquitetura de três camadas, temos apresentação, negocio ou comercio, banco de dados, e a diferente da última arquitetura: A persistência, que cuida dos acessos aos dados.

É uma arquitetura baseada em função técnica, não em domínio. Ou seja: o “assunto” do sistema pode “se espalha” por todas as camadas. <br>
Isso torna ela, simples de entender e implementar. Com baixo custo e complexidade, e ainda mantém uma boa separação das responsabilidades. Mas, não é altamente aclopado, onde mudar algo pode afetar outras partes do sistema. Além de facilmente virar um monólito, ele é difícil de escalar.

##### Lei do Conway
A Lei de Conway diz que o jeito que uma empresa se organiza internamente influencia diretamente a forma como o software dela é projetado.
Ou seja: <br>
_“Times isolados criam sistemas isolados. Times que não se comunicam criam softwares que também não se comunicam bem.”_

##### Camadas abertas e fechadas
Uma camada fechada faz com que requisições são forçadas a seguir uma ordem, e não podem “pular camadas”. A camada aberta permite acesso direto, ou seja, ignorando intermediárias quando necessário.

##### Anti-padrão sinkhole
O anti padrão sinkhole acontece quando uma requisição atravessa várias camadas da arquitetura sem que nenhuma delas faça algo realmente útil. - ou seja, uma perda de tempo.
É como se cada camada fosse apenas um “túnel vazio”, repassando dados para a próxima sem aplicar regra de negócio, validação ou transformação.



