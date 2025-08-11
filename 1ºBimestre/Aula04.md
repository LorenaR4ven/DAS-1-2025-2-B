###### _Capitulo 5.6.3_
##### _Dependency Inversion Principle._
Recomenda-se que se que classes (controladores) dependam de abstrações - ou seja, interfaces -, ao serem mais flexíveis e estáveis. Facilmente testável e extensível. 


> **_Prefira Interfaces a Classes_** onde você não depende de quem tem a lógica e sim, de um padrão de comunicação. Isso reduz aclopamento, já que a lógica do código não está ligada diretamente, e “cliente” não é dependente.


Mas como o controlador consegue usar a interface - que a ponte entre o controlador e o service - sendo que a interface não sabe como a funcionalidade funciona, somente que existe? Ele usa o @Autowired, que faz possível essa conexão dinamicamente.


#####  _Prefira Composição a Herança_
A herança expõem tudo na classe pai, ou seja, o filho quebra todo o encapsulamento da classe pai. A composição, por outro lado, diferencia cada um, onde eles estão bem separados e não dividem o mesmo problema. Mas, quando se usa uma herança? Quando os filhos não têm a possibilidade de “se tornar” um ao outro. Por exemplo: Um gato não pode se tornar um cachorro e vice-versa.
> **A herança é limitante, onde não se deve usar em muitos casos.**


##### _Princípio de Demeter_
Ou principio do menor conhecimento. Onde métodos só devem invocar / chamar somente os seguintes outros métodos:
1. de sua própria classe;
2. de objetos passados como parâmetros;
3. de objetos criados pelo próprio método;
4. de atributos da classe do método.


> (Dito pelo professor: “Não quer dizer o quê? Cuida da sua vida” - para dizer que o método não deve chamar coisas de fora e apenas cuidar de si mesmo)


##### _Princípio Aberto/Fechado_
“Uma classe deve estar fechada para modificações e aberta para extensões”, onde se deve ter um controle em cima do código criado, pois uma modificação sem maior conhecimento pode quebrar o que já foi feito. Mas deve ser aberto a extensões, permitindo que outros possam adicionar coisas novas em cima do código existente. 


> **Classe** - uma parte de código que consiste em elementos e métodos. <br>
> **Interface** - não consiste em lógica de código, e sim as referencias de um método, servindo de ponte para um controlador.  <br>
> **Classe abstrata** - pense em uma classe “pré-pronta” onde o código fica fechado, mas permitindo a expansão sem mudar a lógica interna.
 
**_Reutilização de código, onde é preparado para ser utilizado de várias vezes de jeitos diferentes_**
