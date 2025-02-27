Home Loan Eligibility API
📌 Descrição
O Home Loan Eligibility API é um serviço REST desenvolvido para avaliar a elegibilidade de clientes para diferentes tipos de empréstimos imobiliários com base em fatores como pontuação de crédito, valor do imóvel e rendimento mensal. A API fornece uma análise simples para determinar se um cliente se qualifica para os diferentes tipos de financiamento (FN80, FN60, ou nenhum).

🚀 Funcionalidades
🔹 Avaliação de elegibilidade para empréstimos com base em critérios de crédito e rendimento.
🔹 Tipos de empréstimos: FN80 (empréstimo com financiamento de 80%), FN60 (financiamento de 60%) e NONE (sem financiamento disponível).
🔹 Respostas claras e objetivas sobre a elegibilidade para diferentes tipos de empréstimos.

📜 Regras de Elegibilidade

FN80 (Financiamento de 80%):
✅ Pontuação de crédito acima de 700
✅ Rendimento superior a 5000

FN60 (Financiamento de 60%):
✅ Pontuação de crédito entre 600 e 700
✅ Rendimento entre 3000 e 5000

NONE (Sem Empréstimo Disponível):
✅ Pontuação de crédito abaixo de 600
✅ Rendimento inferior a 3000

📡 Tecnologias Utilizadas
O projeto utiliza as seguintes tecnologias e bibliotecas:

Java 17 – Linguagem de programação principal
Spring Boot 3 – Framework para criação de aplicações Java
Spring Web – Para construção da API REST
Maven – Gerenciamento de dependências e build da aplicação
📤 Exemplo de Requisição
Endpoint:
POST /api/loan/eligibility

Corpo da Requisição (JSON):

json
Copiar
Editar
{
  "name": "John Doe",
  "propertyValue": 350000,
  "income": 5500,
  "creditScore": 720
}
Respostas Possíveis:
🔹 Empréstimo FN80 disponível (200 OK)

json
Copiar
Editar
{
  "loanType": "FIN80",
  "eligibility": "Aprovado"
}
🔹 Empréstimo FN60 disponível (200 OK)

json
Copiar
Editar
{
  "loanType": "FIN60",
  "eligibility": "Aprovado"
}
🔹 Sem empréstimo disponível (200 OK)

json
Copiar
Editar
{
  "loanType": "NONE",
  "eligibility": "Rejeitado"
}
📄 Licença
Copyright © 2024

Este software é de código aberto e pode ser modificado e distribuído conforme as regras da licença associada. O uso é permitido para fins educacionais, comerciais e não comerciais, desde que a atribuição seja mantida.

Se precisar de mais alguma informação ou ajustes, me avise! 🚀
