# Cálculo de Salário

Projeto desenvolvido como parte do curso de Java oferecido pela [Ada](https://ada.tech/), no módulo **Lógica de Programação I**. 

O objetivo deste programa é calcular o salário líquido de funcionários com base em descontos do **INSS** e do **Imposto de Renda** (IR), utilizando tabelas fornecidas como referência. Este projeto foi supervisionado pelos instrutores **Brunno Nogueira** e **Stephannie Suzart**.

## 🛠 Tecnologias Utilizadas

- Linguagem: **Java**
- IDE: **IntelliJ IDEA**
- JDK: **Oracle OpenJDK 21.0.2**

---

## 📋 Descrição do Projeto

O programa recebe salários brutos como parâmetros de entrada, calcula os descontos correspondentes de INSS e IR, e apresenta no terminal:
- O salário bruto.
- O valor descontado para o INSS.
- O valor descontado para o Imposto de Renda.
- O salário líquido.

Os cálculos seguem as tabelas oficiais de desconto:

### Tabela de Descontos do INSS
| Faixa Salarial (R$)       | Alíquota (%) |
|---------------------------|--------------|
| Até 1.212,00             | 7,5%         |
| De 1.212,01 a 2.427,35   | 9%           |
| De 2.427,36 a 3.641,03   | 12%          |
| De 3.641,04 a 7.087,22   | 14%          |

### Tabela de Descontos do Imposto de Renda
| Faixa Salarial (R$)       | Alíquota (%) |
|---------------------------|--------------|
| Até 1.903,98             | 0%           |
| De 1.903,99 a 2.826,65   | 7,5%         |
| De 2.826,66 a 3.751,05   | 15%          |
| De 3.751,06 a 4.664,68   | 22,5%        |
| Acima de 4.664,68        | 27,5%        |

---

## ⚙️ Como Executar

1. Certifique-se de ter o **Java 21** instalado em sua máquina.
2. Compile o código no terminal ou utilizando sua IDE.
3. Execute o programa passando os salários brutos como parâmetros. 

Exemplo de execução no terminal:
```bash
java Main 7087.23 1903.98
```

### Exemplo de Saída
Para os salários `7087.23` e `1903.98`, o programa imprime:
```
Salário 1
- Salário bruto: 7087,23
- Quanto pagou ao INSS: 992,21
- Quanto pagou de Imposto de Renda: 1948,99
- Salário líquido: 4146,03

Salário 2
- Salário bruto: 1903,98
- Quanto pagou ao INSS: 171,36
- Quanto pagou de Imposto de Renda: 0,00
- Salário líquido: 1732,62
```

---

## 🛠 Estrutura do Código

A estrutura foi projetada para respeitar os princípios de **Clean Code** e **separação de responsabilidades**, com nomes descritivos para classes e funções. Exemplo da classe principal `Main`:

```java
import incomeTax.IncomeTax;
import inss.Inss;
import salaryInfo.SalaryInfo;

public class Main {
    public static void main(String[] args) {

        int position = 0;

        for (String salaryReported : args) {

            double salary = Double.parseDouble(salaryReported);

            double inssDiscount = Inss.calculateDiscount(salary);

            double incomeTaxDiscount = IncomeTax.calculateDiscount(salary);

            SalaryInfo.print(++position, salary, inssDiscount, incomeTaxDiscount);
        }
    }
}
```

O programa foi projetado para ser autoexplicativo, com nomes de funções como `defineThePercentageOfTheRange`. Apesar de serem extensos, ajudam a melhorar a legibilidade e entendimento do código.

---

## 👩‍🏫 Créditos

Projeto desenvolvido por **Leandro Silva**, como parte do curso de Java da Ada.  
Agradecimentos aos instrutores **Brunno Nogueira** e **Stephannie Suzart** pelo suporte e orientações.  
Saiba mais sobre a Ada em [https://ada.tech/](https://ada.tech/).
