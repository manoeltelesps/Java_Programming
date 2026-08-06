# 🧬 Abstração e Polimorfismo

Exercícios em sala sobre classes abstratas, interfaces e polimorfismo em Java. O projeto reúne três hierarquias independentes — animais, formas geométricas e instrumentos musicais — além de um pacote separado (`ucb.poo.abstracao`) com uma hierarquia de veículos mais elaborada, incluindo cálculo de consumo e simulação de viagem.

## 📂 Arquivos

| Arquivo | Descrição |
|---|---|
| `Animal.java` | Classe abstrata base — atributos comuns, métodos abstratos `emitirSom()`/`mover()` e métodos concretos como `dormir()` e `comer()` |
| `Cachorro.java` / `Gato.java` | Subclasses de `Animal` com comportamentos próprios (latir, buscar objeto, ronronar, arranhar etc.) |
| `Forma.java` | Classe abstrata de formas geométricas, com `calcularArea()` e `calcularPerimetro()` abstratos |
| `Circulo.java` / `Retangulo.java` | Implementações concretas de `Forma` |
| `InstrumentoMusical.java` | Interface com métodos abstratos, um método `default` e um `static` (recursos do Java 8) |
| `Piano.java` / `Violao.java` | Implementações da interface `InstrumentoMusical` |
| `TesteAbstracao.java` | Classe `main` que demonstra formas, animais, instrumentos e polimorfismo |
| `ucb/poo/abstracao/VeiculoAbstrato.java` | Classe abstrata de veículo, com métodos concretos (`ligar`, `abastecer`) e abstratos (`acelerar`, `frear`, `calcularConsumo`) |
| `ucb/poo/abstracao/CarroConcreto.java` / `MotocicletaConcreta.java` | Implementações de `VeiculoAbstrato` com regras de consumo e aceleração distintas |
| `ucb/poo/abstracao/TesteVeiculosAbstratos.java` | Classe `main` que testa criação, polimorfismo e comportamentos específicos dos veículos |

---
**Autor:** Manoel Teles · [LinkedIn](https://www.linkedin.com/in/manoeltelesps)
