### _Singleton - ender-chest do java_
##### Book - Design Pattern 

Singleton é um design pattern que guarda uma informação única, usada no sistema inteiro. Por exemplo, guardar uma senha e acessar ela em outras partes do sistema.

**Como fazer?** Cria uma classe que possui um construtor privado. Isso faz com que apenas ele pode criar uma variável com esse construtor, verificando primeiramente se já existe um dado nessa instância.

> GetInstance - um método estático (onde carrega na memória primeiro) que executa o código "privado". <br>

_Verifica ( if(instance == null) ) caso esteja nullo, cria a variável pela primeira vez. Se não está nullo, retorna o valor da variável (return instance)_

#### Cliente

É a classe que "usa" o singleton. O Cliente pode salvar uma informação no singleton caso ele esteja nullo. E chamar em qualquer parte do sistema, seja em outra classe ou várias linhas de código entre o set e get do singleton.

>_"Debugar"_ é percorrer o código parte por parte. Usado para entender o código e descobrir problemas usando um break point em linhas direto no código. <br>

### _Observer_

Usa um metodo de **"assinaturas"** para notificar outras classes. Uma clase pode ser inscrita a esse método para receber notificação sobre ocorrências do publicador. Isso permite que a classe inscrita não gaste tempo verificando o publicador por alterações recentes, e também que o publicador não gaste com envios de "spam" para classes não interessadas em seus eventos.

Esse design utiliza uma lista onde classes "inscritas" serão armazenadas. O publicador então percorre essa lista quando vai notificar algum evento. Com isso, a inscrição pode ser removida da lista a qualquer momento e a classe removida deixara de receber mudanças do publicador.
