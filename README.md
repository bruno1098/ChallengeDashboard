# 📊 Sistema de Monitoramento e Análise de Feedbacks

![Java](https://img.shields.io/badge/Java-✓-blue) ![Oracle](https://img.shields.io/badge/Oracle-✓-orange) ![MVC](https://img.shields.io/badge/Architecture-MVC-green) ![AI](https://img.shields.io/badge/AI-✓-purple)
![License](https://img.shields.io/badge/License-MIT-green) ![GitHub stars](https://img.shields.io/github/stars/bruno1098/ChallengeDashboard?style=social)

![Logo da ExpirenceIA](https://github.com/bruno1098/ChallengeDashboard/blob/main/tumb.png?raw=true)

## 📋 Índice

- [📝 Descrição](#-descrição)
- [🔍 Demonstração](#-demonstração)
- [🚀 Funcionalidades](#-funcionalidades)
- [🛠 Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [📦 Instalação](#-instalação)
  - [📝 Pré-requisitos](#-pré-requisitos)
  - [📥 Passo a Passo](#-passo-a-passo)
- [🎯 Como Usar](#-como-usar)
- [🖼 Capturas de Tela](#-capturas-de-tela)
- [🤝 Contribuição](#-contribuição)
- [📄 Licença](#-licença)
- [📞 Contato](#-contato)

## 📝 Descrição

Nossa solução é um **sistema completo de monitoramento e análise de feedbacks**, desenvolvido em **Java** com o padrão **MVC**, utilizando o banco de dados **Oracle** para garantir robustez e segurança no armazenamento de informações.

O sistema inclui um **dashboard interativo** onde os feedbacks são exibidos de forma clara e organizada, permitindo que os usuários possam cadastrar novos atendimentos e gerenciar suas interações.

Temos como finalidade apresentar o protótipo funcional desenvolvido para um **chatbot de suporte ao cliente**, incorporando uma arquitetura de **Inteligência Artificial (IA)** destinada à análise das conversas e geração de feedbacks. A solução visa melhorar a experiência do cliente através de interações automatizadas eficientes e aprimoramentos contínuos baseados em análises de sentimentos e resolução de problemas.

Este sistema foi projetado para a **Plusoft**, uma empresa especializada em soluções de atendimento ao cliente, com o objetivo de monitorar diversos canais de atendimento, gerando insights valiosos para a gestão. A aplicação oferece flexibilidade, podendo ser usada para:

- **Gerar relatórios**
- **Visualizar métricas de desempenho e qualidade**
- **Monitorar a satisfação do cliente**

Contribuindo diretamente para a tomada de decisões estratégicas na empresa. Além disso, o sistema permite uma análise profunda dos atendimentos, seja via chat ou outros canais, utilizando o poder da nuvem e da automação para melhorar a eficiência das operações da Plusoft.

## 🔍 Demonstração

[![Assista ao Vídeo](https://github.com/bruno1098/ChallengeDashboard/blob/main/tumb.png?raw=true)](https://youtu.be/EfGKGTMATuQ)

*Clique na imagem acima para assistir à demonstração do sistema.*

## 🚀 Funcionalidades

- **📊 Dashboard Interativo**: Visualize feedbacks de forma organizada.
- **📝 Cadastro de Atendimentos**: Registre e gerencie interações com clientes.
- **💭 Análise de Sentimentos**: Utilize IA para entender o humor das conversas.
- **📈 Relatórios Personalizados**: Gere relatórios detalhados sobre desempenho e qualidade.
- **🌐 Monitoramento Multicanal**: Acompanhe interações em diferentes plataformas.
- **⚙️ Automação de Tarefas**: Melhore a eficiência operacional com processos automatizados.
- **🔒 Segurança Robusta**: Armazenamento seguro de dados com Oracle.

## 🛠 Tecnologias Utilizadas

- **🖥 Linguagem de Programação**: Java
- **🏗 Arquitetura**: MVC (Model-View-Controller)
- **🗄 Banco de Dados**: Oracle
- **🤖 Inteligência Artificial**: Análise de Sentimentos e Chatbot
- **🎨 Frontend**: [Tecnologias Frontend utilizadas, se aplicável]
- **☁️ Hospedagem na Nuvem**: [Serviço de nuvem utilizado, se aplicável]

## 📦 Instalação

### 📝 Pré-requisitos

- **Java JDK 11** ou superior
- **Oracle Database** configurado
- **IDE** de sua preferência (Eclipse, IntelliJ, etc.)
- **Maven** ou **Gradle** para gerenciamento de dependências

### 📥 Passo a Passo

1. **Clone o repositório**
    ```bash
    git clone https://github.com/bruno1098/ChallengeDashboard.git
    ```
2. **Navegue até o diretório do projeto**
    ```bash
    cd ChallengeDashboard
    ```
3. **Configure o banco de dados Oracle**
    - Atualize as credenciais no arquivo `src/main/resources/application.properties`.
4. **Compile o projeto**
    ```bash
    mvn clean install
    ```
    ou
    ```bash
    gradle build
    ```
5. **Execute a aplicação**
    ```bash
    mvn spring-boot:run
    ```
    ou
    ```bash
    java -jar target/analyzer.jar
    ```
6. **Acesse a aplicação**
    - Abra o navegador e vá para `http://localhost:8080`.

## 🎯 Como Usar

1. **📊 Dashboard**
    - Visualize os feedbacks e métricas de desempenho.
2. **📝 Cadastrar Feedbacks**
    - Navegue até a seção de Feedbacks e clique em "Novo Feedback".
3. **👤 Cadastrar Usuários**
    - Navegue até a seção de Usuários e clique em "Novo Usuário".
4. **💭 Análise de Sentimentos**
    - Utilize a ferramenta de IA para analisar o sentimento das conversas.
5. **📈 Gerar Relatórios**
    - Acesse a seção de relatórios para gerar insights detalhados.

## 🖼 Capturas de Tela

### 📊 Dashboard Interativo

![Dashboard](https://github.com/bruno1098/ChallengeDashboard/blob/main/screenshots/dashboard.png?raw=true)
*Dashboard interativo com feedbacks organizados.*

### 📝 Cadastro de Feedbacks

![Cadastro de Feedbacks](https://github.com/bruno1098/ChallengeDashboard/blob/main/screenshots/cadastro-feedback.png?raw=true)
*Interface para cadastro e gerenciamento de feedbacks.*

### 💭 Análise de Sentimentos

![Análise de Sentimentos](https://github.com/bruno1098/ChallengeDashboard/blob/main/screenshots/analise-sentimentos.png?raw=true)
*Ferramenta de análise de sentimentos baseada em IA.*

## 🤝 Contribuição

Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

1. **Fork o repositório**
2. **Crie uma branch para sua feature**
    ```bash
    git checkout -b feature/nova-feature
    ```
3. **Commit suas alterações**
    ```bash
    git commit -m "Adiciona nova feature"
    ```
4. **Push para a branch**
    ```bash
    git push origin feature/nova-feature
    ```
5. **Abra um Pull Request**

## 📄 Licença

Este projeto está licenciado sob a licença [MIT](LICENSE).

## 📞 Contato

**Plusoft - Suporte ao Cliente**

- **Email**: suporte@plusoft.com
- **LinkedIn**: [Plusoft](https://www.linkedin.com/company/plusoft)
- **Website**: [www.plusoft.com](https://www.plusoft.com)

---

Desenvolvido com ❤️ pela equipe da **ExpirenceIA**.
