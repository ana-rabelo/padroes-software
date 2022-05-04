# Atividades Padrões de Software

1. Etapa 01 

    **1.1. Atividade 02 - Padrões Strategy e Chain of Reponsibility**
        
   - [x] [Imposto](https://github.com/ana-rabelo/padroes-software/tree/main/src/Strategy/Imposto)
   - [ ] Livraria
   - [x] [Saque](https://github.com/ana-rabelo/padroes-software/tree/main/src/ChainOfResponsibility/Saque)
   - [x] [Aplicação Bancária](https://github.com/ana-rabelo/padroes-software/tree/main/src/ChainOfResponsibility/AplicacaoBancaria)
   
    **1.2. Atividade 03 - Padrões Template Method e Builder**
    
    - [x] [Relatório](https://github.com/ana-rabelo/padroes-software/tree/main/src/TemplateMethod/Relatorio)
    - [ ] Contato
    - [ ] Livro

### Enunciados

1. Etapa 01
    
    **1.1. Atividade 02 - Padrões Strategy e Chain of Reponsibility**

    1.1.1. Crie todo o mecanismo para flexibilizar a criação de diferentes estratégias de impostos. Crie a
   interface Imposto, e as estratégias ICMS e ISS. O ISS deve ser 6% do valor do orçamento, e o
   ICMS deve ser 25% do valor do orçamento. Crie a classe Orcamento, que tem como atributo um
   valor. Crie um construtor que recebe esse valor, e um getter para devolvê-lo. Crie a classe
   CalculadorDeImposto, que recebe um Orcamento e um Imposto. Essa classe calcula o imposto
   usando a estratégia recebida e imprime o resultado na tela.
    
    1.1.2. Uma livraria vende diversos artigos consistindo de Livros, Revistas e Jogos.

    Há livros e revistas impressos e digitais. 
   
   A livraria possui Jogos de Tabuleiro e Jogos de Vídeo Game, sendo o último o jogo físico ou
               digital.
   
   No pagamento a vista, temos a seguinte política de descontos:

    - Livros, Revistas Físicos e Jogos de Tabuleiro: 30% de desconto. 
   
    - Livros e Revistas digitais: 15% de desconto. 

    - Não há desconto para Jogos de Vídeo Game. 

    Porém, a livraria pode ter promoções especiais durante o ano, de modo que os descontos dos produtos podem mudar. 

    Implemente sua solução.

    1.1.3. Utilizando o padrão Chain of Responsability, crie um caixa eletrônico capaz manipular
   requisições de saque corretamente, sempre considerando o menor número de notas possível.
   Por exemplo, em uma solicitação de saque no valor de R$475, o caixa deve entregar:
   - 4 notas de R$100
   - 1 nota de R$50
   - 1 nota de R$20
   - 1 nota de R$5
   
   Para isto, crie manipuladores para contar a quantidade de cada tipo de nota. Ao terminar sua
   contagem, cada manipulador deve passar ao próximo o cálculo da quantidade de notas relativas
   ao montante restante.
   
   Cada manipulador deve exibir a sua contagem.

    1.1.4. Um servidor de aplicação bancária que se comunica com outros deve responder de várias formas
   diferentes, de acordo com a solicitação da aplicação cliente.

   Se a aplicação solicitar uma Conta, cujos atributos formatados em JSON, por exemplo, o
   servidor deverá responder nesse formato; se a aplicação solicitar XML, o servidor deverá
   responder XML; se ela pedir no formato CSV, separado por % (por cento), a aplicação deverá
   devolver dessa forma.

   Implemente um Chain of Responsibility onde, dada uma requisição e uma conta
   bancária, ela passeia por toda a corrente até encontrar a classe que deve processar a requisição
   de acordo com o formato solicitado, e imprime na tela a conta bancária no formato correto. 

    Imagine que a classe Requisição possui um getter getFormato(), que responde "XML", "CSV", ou "PORCENTO", indicando qual tratamento adequado. Uma Conta possui apenas saldo e nome do titular:

    ```
   enum Formato { 
      JSON,
      XML,
      CSV
    }
   
    class Requisicao {
       private Formato formato;
       
       public Requisicao(Formato formato) {
           this.formato = formato;
       }
    // getter para o Formato
    }
    ```

   **1.2. Atividade 03 - Padrões Template Method e Builder**

    1.2.1. Relatórios são muito parecidos: todos eles contêm cabeçalho, corpo, e rodapé. Existem dois
   tipos de relatórios: simples e complexos. As diferenças são sutis: relatórios simples possuem
   cabeçalhos e rodapés de uma linha, apenas com o nome do banco e telefone, respectivamente;
   relatórios complexos possuem cabeçalhos que informam o nome do banco, endereço, telefone,
   e rodapés que informam e-mail, e a data atual. Além disso, dada uma lista de contas, um relatório
   simples apenas imprime titular e saldo da conta. O relatório complexo exibe titular, agência,
   número da conta, e saldo. Use Template Method, e implemente o mecanismo de relatórios. Use
   dados falsos para os dados do banco.
   
    1.2.2. Escreva classes para satisfazer os seguintes papéis do padrão Builder:
    
    - Client: recebe como parâmetros o nome, endereço, telefone e e-mail de uma pessoa,
      solicita ao director que construa informações de contato, recupera a informação do builder
      e imprime;
    - Director: recebe como parâmetro o builder a ser utilizado e os dados de contato. Manda
      o builder construir o contato;
    - Builder: constrói o contato. Existem três tipos de contato e um builder para cada tipo:
    
      - ContatoInternet: armazena nome e e-mail; 
      - ContatoTelefone: armazena nome e telefone; 
      - ContatoCompleto: armazena nome, endereço, telefone e e-mail.

   A classe que representa o papel client deve ter o método main() que irá criar um director e
   um builder de cada tipo. Em seguida, deve pedir ao director que crie um contato de cada tipo
   e imprimi-los (use o toString() da classe que representa a informação de contato).

    1.2.3. Considere a classe Livro apresentada a seguir:

    ````
   public class Livro {
        private String nomeNacional;
        private int ano;
        private List<String> autores;
        private int edicao;
        private String cidade;
        private String editora;
        private String nomeOriginal;
        private List<String> tradutores;
        private int paginas;
        private long isbn;
   
        public Livro(String nomeNacional, int ano, List<String> autores,
                     int edicao, String cidade, String editora, String nomeOriginal,
                     List<String> tradutores, int paginas, long isbn) {
            this.nomeNacional = nomeNacional;
            this.ano = ano;
            this.autores = autores;
            this.edicao = edicao;
            this.cidade = cidade;
            this.editora = editora;
            this.nomeOriginal = nomeOriginal;
            this.tradutores = tradutores;
            this.paginas = paginas;
            this.isbn = isbn;
        }
       // getters e setters omitidos
    }
   ````

    Observe o construtor da classe Livro. Veja como fica complicado escrever tantos parâmetros. Uma
solução seria a utilização do padrão de projeto Builder, que seria responsável pela construção do
objeto, como por exemplo:

    ```
   Livro livro = new Livro.LivroBuilder("Java, como programar")
                                       .publicadoEm(2003)
                                       .dosAutores("H. M. Deitel", "P. J. Deitel")
                                       .edicao(4)
                                       .cidade("Porto Alegre")
                                       .editora("Bookman")
                                       .nomeOriginal("Java How to Program")
                                       .tradutores("Carlos Arthur Lang Lisbôa")
                                       .paginas(1386)
                                       .isbn(9788536301235L)
                                       .build();
   ```

    Desenvolva a solução requisitada, utilizando o padrão de projeto Builder e fluent interface.