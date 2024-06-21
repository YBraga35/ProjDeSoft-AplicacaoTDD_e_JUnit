# 🧮 Calculadora - Aplicação com TDD e JUnit
[![Licença](https://img.shields.io/github/license/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit)](https://github.com/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit/blob/main/LICENSE)
[![Versão](https://img.shields.io/github/v/release/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit)](https://github.com/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit/releases)
[![Status do Build](https://img.shields.io/github/workflow/status/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit/build)](https://github.com/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit/actions)

Este projeto implementa uma calculadora simples utilizando TDD (Test-Driven Development) e JUnit para testes automatizados.

## 📋 Índice

- [🧮 Calculadora - Aplicação com TDD e JUnit](#-calculadora---aplicação-com-tdd-e-junit)
  - [📋 Índice](#-índice)
  - [📖 Sobre](#-sobre)
  - [🚀 Instalação](#-instalação)
    - [Clone o repositório](#clone-o-repositório)
    - [ Configuração do Ambiente de Desenvolvimento no VSCode para Java com Maven](#-configuração-do-ambiente-de-desenvolvimento-no-vscode-para-java-com-maven)
      - [Exemplo de Comandos Maven no Terminal do VSCode:](#exemplo-de-comandos-maven-no-terminal-do-vscode)
    - [💻Uso](#uso)
    - [✨ Funcionalidades](#-funcionalidades)
    - [📄 Licença](#-licença)
    - [📞 Contato](#-contato)

## 📖 Sobre

Este projeto implementa uma calculadora com operações básicas (soma, subtração, multiplicação, divisão) utilizando o princípio de TDD para o desenvolvimento e JUnit para testes automatizados.

## 🚀 Instalação

Para configurar o ambiente de desenvolvimento local, siga estes passos:

### Clone o repositório

```bash
git clone https://github.com/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit.git
cd ProjDeSoft-AplicacaoTDD_e_JUnit
```

### ![Engrenagem](https://img.icons8.com/ios-filled/50/000000/gear.png) Configuração do Ambiente de Desenvolvimento no VSCode para Java com Maven

Para configurar o ambiente de desenvolvimento no Visual Studio Code (VSCode) para um projeto Java utilizando Maven, siga estes passos simples:

1. **Instale as Extensões necessárias**:
   - Instale o **Java Extension Pack** no VSCode. Isso pode ser feito pela seção de extensões do VSCode (Ctrl+Shift+X) procurando por "Java Extension Pack".

2. **Configure o JDK**:
   - Abra as preferências do VSCode (Ctrl+,), procure por "Java: Home" e configure o caminho para o diretório raiz do JDK instalado no seu sistema.

3. **Configure o Maven**:
   - O VSCode geralmente detecta automaticamente a instalação do Maven. Caso contrário, configure o caminho para o Maven em "Java: Maven Home" nas preferências do VSCode.

4. **Abra seu Projeto Java no VSCode**:
   - Abra a pasta do seu projeto Java no VSCode, garantindo que haja um arquivo `pom.xml` na raiz do projeto. O `pom.xml` é essencial e define as configurações do projeto Maven.

5. **Utilize o Terminal Integrado para Comandos Maven**:
   - Abra o terminal integrado no VSCode (Ctrl+`) e navegue até a raiz do seu projeto.
   - Execute comandos Maven como `mvn clean install` para compilar e testar o projeto, `mvn test` para executar testes unitários, e `mvn package` para empacotar o projeto.

#### Exemplo de Comandos Maven no Terminal do VSCode:

```bash
# Limpar, compilar e executar testes
mvn clean install

# Executar testes
mvn test

# Empacotar o projeto
mvn package
```

### 💻Uso

Para executar a calculadora, execute o método `main` na classe `Main`. Siga as instruções no console para escolher a operação desejada e fornecer os valores necessários.

### ✨ Funcionalidades

- Soma de dois números
- Subtração de dois números
- Multiplicação de dois números
- Divisão de dois números (com tratamento para divisão por zero)

### 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

### 📞 Contato

Yan Braga - [@YBraga35](https://github.com/YBraga35) - contato@yanbraga.com

Link do projeto: [Projeto de Software com TDD e JUnit](https://github.com/YBraga35/ProjDeSoft-AplicacaoTDD_e_JUnit)


