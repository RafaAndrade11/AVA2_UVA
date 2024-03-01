## Enunciado da Avaliação 2
 
# Desenvolvimento de projeto de aplicação com uso de vetores de objetos com tratamento de exceções
O uso de vetores e matrizes de objetos pode facilitar muito o desenvolvimento de determinados projetos, facilitando o desenvolvimento, diminuindo a complexidade e favorecendo a manutenção do sistema.

Dadas as classes a seguir, crie uma superclasse para atender às necessidades das subclasses, com todas as funcionalidades comuns às classes similares. Crie também uma aplicação que gere, por meio de um vetor único com dez objetos de cada tipo, utilizando sempre o construtor vazio. Utilize o tratamento de exceções para proteger a aplicação contra possíveis entradas de dados inválida com os métodos da classe Scanner.

Classes:

 Classe

Atributos

Métodos

 Aviao

Prefixo : Texto

CapacidadeTanque : inteiro

NumeroPassageiros : inteiro

Preco : real

DataRevisao : Texto

· Acesso (setters e getters).

· Construtores: pelo menos dois métodos construtores.

· imprimir(): exibe os dados do objeto.

. entrada(): realiza a entrada de dados pelo teclado

· reajustarPreco(percentual : real): reajusta o preço do avião, alterando o valor do atributo de acordo com o percentual passado como parâmetro.

 

 Navio

Nome : Texto

CapacidadeTanque : inteiro

NumeroPassageiros : inteiro

NumeroTripulantes : inteiro

Preco : real

DataLancamento : Texto

· Acesso (setters e getters).

· Construtores: pelo menos cinco métodos construtores.

· imprimir(): exibe os dados do objeto.

· entrada(): realiza a entrada de dados pelo teclado

· passageirosPorTripulantes(): retorna a divisão do número de passageiros pelo número de tripulantes. Os valores usados nesse método são atributos, por isso não precisam ser passados como parâmetros.

Observações:

1. A superclasse deverá possuir dois métodos construtores também.

2. Apenas atributos com o mesmo nome e do mesmo tipo podem ser considerados similares para a herança.

3. Os atributos devem ser protegidos contra acesso direto.

Monte o diagrama de hierarquia das classes e defina onde ficará cada atributo após a aplicação do conceito de herança. Após a determinação da hierarquia, desenvolva separadamente as classes (incluindo a classe de aplicação). O projeto deve então ser documentado em um arquivo do Word e postado no ambiente de avaliação.

Como é um documento institucional, o arquivo deve ter:

Capa (detalhando a instituição e o curso).
Contracapa (detalhando a disciplina, professor e membros do grupo).
Índice.
Introdução.
Conteúdo.
Documentação do projeto com o gráfico hierárquico das classes.
Codificação de todas as classes e aplicação.
Apresentação dos resultados dos testes realizados com o projeto.
Conclusão do trabalho.
Bibliografia.
 
