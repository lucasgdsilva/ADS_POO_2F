# Agenda Telefonica
Este projeto foi realizado duranto os estudos de programação orientada a objetos com o professor Emerson Mello.

Durante suas atividades em sala, foi passado o objetivo de criar um projeto em Java seguindo este diagrama UML

**OBS: ** Este projeto foi realizado durante a faculdade de ADS no IFSC

```mermaid
classDiagram
    class App {
        -agenda: Agenda
        +main()
        +menu()
    }

    class Agenda {
        -contatos: ArrayList~Contato~
        +Agenda()
        +addContato(c: Contato): boolean
        +findContato(nome: String, sobreNome: String): ArrayList~Contato~
        +removeContato(indiceContatoNaLista: int): boolean
        +addTelefone(rotulo: String, valor: String, indiceContatoNaLista: int): boolean
        +addEmail(rotulo: String, valor: String, indiceContatoNaLista: int): boolean
        +updateTelefone(rotulo: String, valor: String, indiceContatoNaLista: int): boolean
        +updateEmail(rotulo: String, valor: String, indiceContatoNaLista: int): boolean
        +removeTelefone(rotulo: String, indiceContatoNaLista: int): boolean
        +removeEmail(rotulo: String, indiceContatoNaLista: int): boolean
        +toString(): String
    }

    class Contato {
        -nome: String
        -sobrenome: String
        -dataNasc: LocalDate
        -telefones: ColecaoTelefone
        -emails: ColecaoEmail
        +Contato(nome: String, sobrenome: String, dN: LocalDate)
        +addTelefone(rotulo: String, valor: String): boolean
        +addEmail(rotulo: String, valor: String): boolean
        +removeTelefone(rotulo: String): boolean
        +removeEmail(rotulo: String): boolean
        +updateTelefone(rotulo: String, valor: String): boolean
        +updateEmail(rotulo: String, valor: String): boolean
        +toString(): String
    }

    class ColecaoTelefone {
        -dados: HashMap~String, String~
        +add(rotulo: String, valor: String): boolean
        +remove(rotulo: String): boolean
        +update(rotulo: String, valor: String): boolean
        +toString(): String
    }

    class ColecaoEmail {
        -dados: HashMap~String, String~
        +add(rotulo: String, valor: String): boolean
        +remove(rotulo: String): boolean
        +update(rotulo: String, valor: String): boolean
        +toString(): String
    }

    App --* Agenda
    Agenda "1" --* "0..*" Contato
    Contato "1" --* "0..*" ColecaoTelefone
    Contato "1" --* "0..*" ColecaoEmail

```
