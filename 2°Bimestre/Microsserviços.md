# Arquitetura de Microsserviços
Nascido por influência do DDD - Domain-Driven-Design - onde o sistema gira em torno do núcleo com a regra de negócio. Mas por quê? Existe um conceito no DDD chamado contexto delimitado, mais conhecido como bounded context, esse conceito cria um “limite conceitual” onde regras e termos são consistentes. Com a intenção de manter o sistema realmente independente. <br>
Nos microsserviços, cada contexto delimitado é como um “mini-sistema” isolado. Que consistem em seus próprios códigos, bancos e regras internas. Nada é compartilhado diretamente entre eles. Sendo assim, a comunicação é feita somente por APIs, eventos ou mensagens.

> Isso reduz dependências e aumenta a autonomia de cada parte do sistema.

##### Microsserviços na arquitetura distribuída
Os microsserviços fazem parte do mundo das arquiteturas distribuídas - cada serviço roda no seu próprio processo, permanecendo isolado - hoje em dia a forma padrão é rodar em contêineres, o que oferece isolamento extremo e evita problemas comuns de ambientes compartilhados, como competição por recursos ou falhas entre aplicações. <br>
> Isolar trás custos, pode ser muito útil e necessário, mas temos problemas com lentidão remota, segurança e validação para qualquer comunicação, os serviços devem ser bem planejados para evitar chamadas em excesso.<br>

_Dividir demais pode gerar um sistema mais lento e caro que o necessário_

##### Granularidade nos microsserviços
Granularidade significa o quão grande ou pequeno cada serviço é. E pode ser uma tarefa delicada para encontrar um equilíbrio. <br>
> serviços pequenos demais acabam exigindo muitas comunicações entre si, o que causa lentidão e complexidade. <br>

Resumindo - A granularidade ideal dos microsserviços equilibra coesão funcional e baixa comunicação entre serviços, sendo encontrada por meio de ajustes contínuos.

##### Isolamento dos dados
Cada microsserviço deve ter seu próprio banco de dados, sem compartilhar esquemas ou tabelas com outros serviços. Isso evita acoplamento e garante autonomia. Porem, faz com que nosso sistema não tenha mais uma fonte única das regras de negócio. E é importante definir o dono de cada informação.<br>
> Arquitétos utilizam tecnicas para descobrir essas informações, como: “Quem é o serviço responsável (source of truth) daquele dado?” <br>

_Cada serviço escolhe seu próprio tipo de banco, e pode mudar essa escolha sem afetar os outros._

##### API Gateway
Essa é uma API comum, mas por incrível que pareça, não é obrigatória. Ela não carrega consigo a regra de negócio, mas serve como ponte ou intermediário entre cliente e microsserviço.

##### Reutilização Operacional
Nos microsserviços é comum fazer duplicação no decorrer do desenvolvimento, fazendo isso evitamos acoplamento. Claro que nem tudo deve ser duplicado. 
> **Tipos de Lógicas** <br>
Lógica de domínio - contém regra de negócio e a identidade do serviço (não compartilhada)<br>
Lógica operacional - Logs, Observabilidade, segurança (pode compartilhar que não irá gerar acoplamento)

##### Padrão Sidecar
_Aquelas motinhos com um banco do lado para carregar a vovozinha_


Ele é um componente que roda com o serviço, mas separado. Como uma extensão. Algumas vantagens é que se atualizado, todos os serviços que estão com esse sidecar também ganham a melhoria. E ajuda a manter o domínio limpo e desacoplado.


##### Service Mesh
Conhecido como “malha de serviços” - uma teia de aranha - ele é formado quando todos os serviços têm um sidecar. E isso é importante para oferecer mais observabilidade de forma unificada, além de facilitar a gestão do tráfego.


_Em uma service mesh, cada microsserviço é um nó, e o sidecar cuida das responsabilidades operacionais._

##### Descoberta de Serviços - Service Discovery 
Se trata de perguntas, que ao invés de chamar diretamente um microsserviço, o cliente pergunta se algo ou alguma coisa existe.<br>

Quantas instâncias existem?<br>
Qual está mais saudável?<br>
Qual está com menor carga?

Mas onde ficaria essa “descoberta”? Ela pode ficar no serviço de Mesh ou então no API Gateway. - pode ficar em ferramentas dedicadas, mas eu não vou me aprofundar nisso.







