# Arquitetura Microkernel
Essa arquitetura é principalmente usada em aplicações baseadas no produto. Que consiste em um núcleo pequeno com extensões.<br>
O microkernel é altamente personalizável para cada sistema, ou seja, ele se adapta  regras diferentes. É extensível, mesmo sem mexer no núcleo. Consegue isolar muito bem, permitindo a adição de funções entre seus módulos. <br>
> É perfeito para uma aplicação segura, IDEs e até navegadores com extensões.
###### Como é estruturada?
Consiste em duas partes, o microkernel, sendo o sistema central. Ou seja, o coração da aplicação. Nesse temos funcionalidades essenciais, e principalmente estáveis. Além de não mudar com muita frequência. <br>
E os Plug-ins - ou componentes externos - são módulos independentes que adicionam comportamento novo ou especializado. Eles implementam uma regra, função ou variação específica. E podem ser adicionados, removidos ou substituídos sem que o núcleo seja alterado.

> _É a parte que personaliza o sistema_<br>

Resumindo, vemos que a extensibilidade é fácil de ser aplicada. Os plug-ins recebem isolamentos de funcionalidade, mantendo o núcleo inalterado caso algo ocorra com essas extensões. Ele evolui sem grandes mudanças e é extremamente personalizável por cliente.

