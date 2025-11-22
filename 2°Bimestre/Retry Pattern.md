# Retry Pattern

É um padrão que pode ser considerado - dentro do padrão “disjuntor” - sua principal função é auxiliar na chamada de serviços que dão erro, fazendo eles rodares novamente.

Á algumas estratégias que ele pode Potencializar esse padrão, como “Retry After Delay” - tentar de novo após um tempo - que após uma falha, a aplicação irá esperar um tempo determinado e redar novamente o serviço que deu erro.

#### Arquitetura de Três camadas

É um modelo que divide uma aplicação em 3 partes independentes, cada uma com sua responsabilidade. Isso melhora organização, manutenção, escalabilidade e segurança do sistema. 

> Banco de dados - data layer <br>
Consiste em um servidor potente e robusto que consegue armazenar e processar dados. Sua função? Entregar dados sob demanda, com segurança e consistência.

> Aplicação - Application Layer <br>
É onde vive as regras de negócio. Seja elas, calculos, validações ou lógicas de operações. Essa camada consegue conversar tanto com front-end quanto com o banco de dados. 

> Front-end - Presentation Layer <br>
Aquilo que o usuário vê na tela, está nessa camada. Agora com as tecnologias modernas, esse layer ficou muito mais interativo, consistindo em html, css e javaScript. Pode ser em web, mobile, desktop ou a onde você decidir mostrar o seu sistema.


#### Protocolos CARBA e DCOM
Esses dois protocolos faziam a comunicação entre o cliente e o servidor de aplicação antes de termos REST, JSON, APIs e HTTP modernizados. - muita palavra difícil
E antigamente, realizavam essas funções:

* chamar funções remotas 
* enviar objetos entre máquinas
* permitir que diferentes sistemas conversassem

Vamos ver o que é cada um desses protocolos.

##### CORBA
_Common Object Request Broker Architecture_<br>
Criado pela OMG - Object Management Group - para que sistemas escritos em linguagens diferentes e rodando em máquinas diferentes pudessem se comunicar.
##### DCOM
_Distributed Component Object Model_<br>
É uma tecnologia da Microsoft que permitia que aplicações distribuídas (em máquinas diferentes) se comunicassem entre si, enviando objetos e chamando funções remotas. Mais utilizadas em sistemas corporativos. É mais fechado, ou seja, não tão flexível quanto o CORBA.


---
### Monolíticos ou Distribuídos

A arquitetura Monolítica consiste em um único bloco. Como camadas, pipelines e microkernel. Vamos ver cada uma delas, para termos uma visão mais ampla:

* Arquitetura em camadas: separa o sistema em níveis (UI, lógica, dados, etc.).
* Arquitetura de pipeline: processamento dividido em etapas sequenciais.
* Arquitetura de microkernel: núcleo central mínimo com módulos plugáveis.

Ela é simples de implementar, porém não é escalável, então não se recomenda a sistemas mais complexos e propensos a crescerem.

Mas com isso vem a arquitetura de sistemas distribuídos - se pensou que já tava difícil, aguarde - ele transforma o sistema em várias partes independentes que se comunicam por meio da rede. Seja serviços, eventos, e principalmente os tão famosos microsserviços.

_Microsserviços são um estilo em que o software é quebrado em componentes pequenos, autônomos e especializados, que juntos formam o sistema completo._ <br>
Os sistemas distribuídos oferecem mais escalabilidade e disponibilidade, mas trazem complexidade extra, principalmente devido à rede.


#### Mentiras da computação - “falácias” é muito chique pra mim
Quando trabalhamos com sistemas distribuídos, muita gente assume coisas sobre a rede que simplesmente não são verdade:

“A rede nunca falha” — Sim, ela falha. Por isso aprendemos sobre timeouts e circuit breakers. <br>
“A latência é zero” — Chamar outro serviço é lento, então pense bem antes de fazer milhares de requisições.<br>
“A banda é infinita” — Mandar dados demais entope tudo; envie só o que é necessário.<br>
“A rede é segura” — Cada endpoint é um alvo. Segurança sempre.<br>
“Nada muda na rede” — Infraestrutura vive mudando, e isso afeta tudo.<br>
“Tem só um administrador” — Em empresas grandes, tem vários, e a coordenação complica.<br>
“Transmissão é de graça” — Custos existem: máquinas, tráfego e infraestrutura.<br>
“Tudo na rede é igual” — Equipamentos diferentes, comportamentos diferentes… e bugs diferentes também.

---

##### Extra:

Log distribuído, que torna difícil rastrear erros. <br>
Transações distribuídas, que fazem trocar ACID por Sagas e consistência eventual (BASE). (eu também não entendi nada, não se preocupe) <br>
Manutenção de contratos entre serviços, já que versões e APIs mudam e equipes diferentes precisam se alinhar.

