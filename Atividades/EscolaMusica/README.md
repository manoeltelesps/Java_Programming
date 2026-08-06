# 🎵 Escola de Música

Projeto Maven que simula uma orquesta com diferentes instrumentos musicais, explorando classes abstratas e polimorfismo. Todos os instrumentos herdam de `InstrumentoMusical` e sobrescrevem `tocar()` com seu próprio som; a classe principal monta uma "banda" com um array polimórfico e usa `instanceof` para acessar um atributo específico do `Violao`.

## 📂 Arquivos

| Arquivo | Descrição |
|---|---|
| `InstrumentoMusical.java` | Classe abstrata base — nome, tipo, material, método concreto `afinar()` e método abstrato `tocar()` |
| `Piano.java` | Instrumento de teclas, com atributo `qtdTeclas` |
| `Violao.java` | Instrumento de cordas, com atributo `qtdCordas` |
| `Saxofone.java` | Instrumento de sopro, com atributo `tipoSax` |
| `Bateria.java` | Instrumento de percussão, com atributo `qtdTambores` |
| `EscolaMusica.java` | Classe `main` — monta a banda, afina e toca os instrumentos via polimorfismo |

Projeto gerenciado com **Maven** (`pom.xml`).

---
**Autor:** Manoel Teles · [LinkedIn](https://www.linkedin.com/in/manoeltelesps)
