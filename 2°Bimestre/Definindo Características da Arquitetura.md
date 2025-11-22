# Definindo Características da Arquitetura
#### Cap. 04 - Fundamentos da arquitetura de software

Existe uma grande dúvida de como devemos chamar os “requisitos não funcionais” que viemos nos referindo até agora para as qualidades de um sistema. Como segurança, desempenho, e entre outros. Porém, chamar de algo “não funcional” é algo degradante. 

> Mas afinal, o que é características de uma arquitetura? É as “preocupações” que devem ser consideradas para o sucesso de um sistema.

Exemplo: <br>
**Algo fora do domínio** como desempenho e segurança, que impacta diretamente a estrutura do sistema e é essencial para o sucesso dessa aplicação, mesmo que o cliente final não esteja “ciente” e não coloque em palavras quando definindo o seu sistema.

*A característica da arquitetura, é tipo um orientador de como implementar requisitos e que nos entrega o porquê de fazer certas escolhas na estrutura é necessário*

Claro que escolher várias características para o seu sistema pode gerar o efeito contrario. Nem sempre podemos ter muito de tudo, então o foco em implementar o essencial é beneficial principalmente ao longo prazo. Pois a cada nova característica, maior ficará a complexidade do seu sistema.

---
##### Fora isso as características se dividem em três partes:
Operacionais: disponibilidade, desempenho, escalabilidade, robustez, recuperação, confiabilidade etc.


Estruturais: manutenção, portabilidade, atualização, extensibilidade, configuração, suporte, localização.


Transversais: segurança, privacidade, autenticação, autorização, acessibilidade, legalidade, interoperabilidade, compatibilidade, usabilidade.


Sabendo que um sistema não suporta todas as características, voltamos ao tema de trade-offs, falado à algumas aulas atrás. Onde diminuirmos os esforços em uma area para gerar avanço ou forma em outra mais importante. 

> Exemplo: Tirando de desempenho, para aumentar a segurança. À grandes chances de uma queda de desempenho ser reparada pelo cliente final, mas a necessidade de segurança é mais urgente nesse momento. 


Uma arquitetura deve ser iterativa, flexível e aberta a ajustes, seguindo a lógica de errar rápido e melhorar continuamente (mentalidade ágil).

