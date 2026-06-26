# Javagotchi

Um simulador de pet virtual interativo que funciona via CLI (Interface de Linha de Comando) inspirado no clássico [Tamagotchi](https://tamagotchi-official.com/us/). Enquanto Tamagotchi era um Ovo (Tamago) relógio (Uotchi que vem de Watch), o Javagotchi é o Java relógio, uma brincadeira envolvendo o nome da linguagem utilizada com o nome do Tamagotchi.

## Descrição do Projeto

O **Javagotchi** é um projeto autoral desenvolvido com o intuito de aprofundar fundamentos de Engenharia de Software, aplicando conceitos avançados de Programação Orientada a Objetos (POO), manipulação de arquivos e tratamento manual de exceções, sem o uso de frameworks externos.

O sistema simula um banco de dados local, mas utilizando um sistema de arquivos de texto que executa um sistema de CRUD completo e uma máquina de estados para gerenciar as necessidades do Javagotchi.

---

## Funcionalidades Principais (CRUD & Game Loop)

- **CRUD:** É possível criar, ver, atualizar, apagar e carregar o Javagotchi.
- **Dados salvos em Arquivo (.txt):** O jogo salva as informações do Javagotchi em um arquivo, sendo executado toda vez que o jogador "sair" do jogo e retornar ao menu principal.
- **Gerenciamento de Estados Dinâmicos:** Os atributos (Fome, Higiene, Energia) são atualizados dependendo das ações tomadas.
- **Ações limitadas pelos atributos:** Caso algum atributo esteja baixo e seja executada alguma ação, o Javagotchi não irá realizar até que o atributo seja recuperado com outra ação.
- **Interface Polida via Console:** Utilização de códigos de escape ANSI para limpeza de tela e estilização de cores no terminal.

---

## Detalhes Técnicos e Arquitetura

O projeto foi estruturado seguindo o princípio da **Separação de Responsabilidades**:

- **`Main.java`:** 
Responsável pelo menu principal do jogo, execução do CRUD (Gravação, Leitura, Atualização, Exclusão) e tratamento de exceções de índice.
- **`Jogo.java`:** 
Jogo principal, que mostra o estado do Javagotchi e ações que podem ou devem ser tomadas para continuar jogando.
- **`Javagotchi.java`:** 
Modelo de dados puro (Entidade) que encapsula os atributos privados e blinda o estado interno com regras de teto/piso (0 a 100) e travas lógicas nos métodos de ação .
Objeto Javagotchi que possui os atributos, suas limitações e os métodos executados no `Jogo.java` (`alimentar`, `brincar`, `banho`, `dormir`).

---

## Como Executar o Jogo

### Pré-requisitos
- Java JDK 17 ou superior instalado.

### Passo a Passo
1. Clone o repositório:
   ```bash
   git clone [https://github.com/mdarce765/ProjetosPessoais.git](https://github.com/mdarce765/ProjetosPessoais.git)

2. Execute o arquivo de execução
   - Linux / Git Bash
      ```bash
      ./run.bash
      
   - Windows
      ```powershell
      POR ADICIONAR
      ```

---

## Próximos Passos e Melhorias Futuras

Existem alguns tópicos que planejo aplicar no projeto ao longo do tempo:

### 1. Novas mecânicas de jogabilidade.
- [ ] **Ciclo de Vida Continuado:** Implementar um sistema de tempo (utilizando *Threads* ou verificação de carimbo de data/hora) para a idade avançar e a fome/energia diminuírem mesmo que o utilizador não tome ações consecutivas.
- [ ] **Sistema de Óbito e Doenças:** Se o HP ou a Higiene atingirem valores críticos por muito tempo, o Javagotchi poderá adoecer ou falecer.

### 2. Evolução de Infraestrutura e Interface
- [ ] **Persistência Relacional:** Substituir os arquivos de texto (`Javagotchis.txt`) por um banco de dados (como SQLite ou H2) utilizando JDBC para praticar queries SQL.
- [ ] **Interface Gráfica (GUI):** Migrar a experiência atual do CLI para uma aplicação visual interativa desenvolvida em JavaFX ou Swing.
Desenvolver uma interface gráfica para ficar mais acessível para outras pessoas interessadas, se possível, tornar o projeto em um aplicativo, tornando o Javagotchi em um projeto portátil.