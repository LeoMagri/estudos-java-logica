# 💻 Desenvolvimento de Sistemas & Lógica de Negócio

Este projeto demonstra a integração de consultas SQL com lógica Java para automatizar a conferência de regras de negócio que hoje são validadas no Sapia

##  Projetos Inclusos:

### 1. Gestor de Prioridade de Chamados (`GestorChamados.java`)
- **Cenário:** Automação de triagem para suportes N1 e N2.
- **Lógica:** Classificação automática baseada no tipo de problema (ex: Faturamento TISS) e nível de criticidade.
- **Conceitos:** Estruturas condicionais (`if/else`) e operadores lógicos.

### 2. Calculadora de Proporção (`Calculadora.java`)
- **Cenário:** Automação de cálculos financeiros/percentuais.
- **Conceitos:** Tipos de dados (`double`), operações matemáticas e variáveis.

### 3. Preparador de Dados para BI (`PreparadorDadosBI.java`)
- **Cenário:** Pré-processamento de faturas do sistema SGU para alimentação de dashboards.
- **Lógica:** Filtra e totaliza faturas por status (INTEGRADA, PENDENTE, NÃO INTEGRADA).
- **Objetivo:** Demonstrar como a lógica Java pode "limpar" e organizar dados brutos antes de chegarem às ferramentas de `Analytics` como Power BI.

### 4. Automação de Auditoria Sapia (`automacao-sistemas-saude/`)
- **Cenário:** Integração entre consultas `SQL` e validação `Java`.
- **Lógica:** Extração de faturas com carência pendente e aplicação de regras de glosa automática.
- **Diferencial:** Demonstra o fluxo completo do dado, desde a query no banco de dados até a decisão lógica no código.

## Tecnologias e Ferramentas
- **Linguagem:** Java
- **Banco de Dados:** SQL e PL/SQL (foco em PostgreSQL)
- **Domínio de Negócio:** Sistemas de Saúde (SGU/Sapia/Sistemas Unimed)
- **Análise de Dados:** Power BI
