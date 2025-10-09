# Circuit Breaker pattern
### Entrega resiliência e estabilidade para aplicações

O Circuit breaker, ou “padrão de disjuntor”, é um padrão usado entre sistema que auxilia o fluxo entre aplicações. Como um disjuntor elétrico, ele interrompe o fluxo em casos de falha, ou seja, o design ajuda a “gerenciar” tentativas malsucedidas de serviços, evitando sobrecargas cascatas.

**Qual o problema em si?** É comum que ocorram erros — como timeouts, falhas de rede ou indisponibilidade de serviços. Mesmo quando esses erros são temporários, continuar tentando executar operações falhas consome recursos. E isso pode comprometer a estabilidade do sistema.

A Solução é um design que auxilia no monitoramento de chamadas de serviços e, ao detectar um número “mágico” de falhas em algum intervalo. É temporariamente bloqueado para novas tentativas de chamadas - Aberto. Após um tempo o circuito permite chamadas testes ao serviço - Meio-aberto. E por fim, se forem bem sucedidas, o circuito - Fecha - e o sistema retoma o fluxo normal.

> Resumindo o Circuit breaker serve como auxiliar da aplicação para gerenciar processos que podem gerar erros e atrasar o sistema.
