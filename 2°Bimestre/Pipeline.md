# A arquitetura de pipeline 

A arquitetura de pipeline basicamente é uma lista ordenada indexada onde um programa gera a informação necessária para a entrada de outro programa. São baseados em SDT(in) - Entrada - e SDT(out) - Saída - que são entradas padrões do sistema, chamados de padrão posix.
> Os pipes conectam um componente ao outro, fazendo com que a saída de um seja a entrada do próximo.
##### Canais, ou pipes
São basicamente “tubos” que ligam um programa ao outro, transportando dados entre filtros.
##### Filtros
Os filtros são unidades independentes, normalmente sem estado, e cada um executa uma única tarefa. Quando precisamos de algo mais complexo, encadeamos vários filtros.
Existem quatro tipos principais:
> O produtor - ele gera dados <br>
> O Transformador - que modifica os dados de alguma forma definida <br>
> O Verificador - valida ou analisa os dados <br>
> O Consumidor - que é a ultima etapa, ele pode usar ou armazenar os dados que já foram processados <br>



