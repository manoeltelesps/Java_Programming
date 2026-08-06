# 🏢 Herança — Funcionário e Gerente

Estudo de herança em três níveis: `Pessoa` → `Funcionario` → `Gerente`. Cada subclasse estende os dados e comportamentos da anterior — `Funcionario` adiciona cargo, admissão e salário (com cálculo de salário anual e aumentos), e `Gerente` adiciona uma equipe e cálculo de bônus, sobrescrevendo `mostrarDados()` com `super` para reaproveitar a implementação da classe pai.

## 📂 Arquivos

| Arquivo | Descrição |
|---|---|
| `Pessoa.java` | Classe base com nome, idade e CPF |
| `Funcionario.java` | Estende `Pessoa` — cargo, data de admissão, salário, cálculo de salário anual e aumento |
| `Gerente.java` | Estende `Funcionario` — tamanho de equipe e cálculo de salário com bônus |
| `HerancaEstudo.java` | Classe `main` que instancia pessoa, funcionário e gerente e testa a hierarquia |

---
**Autor:** Manoel Teles · [LinkedIn](https://www.linkedin.com/in/manoeltelesps)
