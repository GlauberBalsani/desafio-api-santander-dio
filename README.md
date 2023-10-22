# desafio-api-santander-dio
Implementação e abstração da minha api

```mermaid
classDiagram
    class Account {
        <<interface>>
        +String getNumber()
        +String getAgency()
        +BigDecimal getBalnce()
        +BigDecimal getLimit()
    }
    class AccountType {
        <<enumeration>>
        SAVINGS_ACCOUNT
        CHECKING_ACCOUNT
    }
    class Card {
        <<interface>>
        +Long getId()
        +String number()
        +BigDecimal limit()
    }
    class CardType {
        <<enumeration>>
        SAVINGS_CARD
        CHECKING_CARD
    }
    class SavingsAccount {
        -Long id
        -String number
        -String agency
        -BigDecimal balance
        -BigDecimal limit
        +SavingsAccount(String number, String agency, BigDecimal balance, BigDecimal limit)
    }
    class SavingsAccountBenefits {
        -Long id
        -String description
        +SavingsAccountBenefits(String description)
    }
    class SavingsCard {
        -Long id
        -String number
        -BigDecimal cardLimit
        +SavingsCard(String number, BigDecimal cardLimit)
    }
    class User {
        -Long id
        -String name
        -AccountType accountType
        -CardType cardType
        -List<SavingsAccountBenefits> benefitsPackages
        +User(String name, AccountType accountType, CardType cardType, List<SavingsAccountBenefits> benefitsPackages)
    }
    
    Account <|.. SavingsAccount : implements
    Card <|.. SavingsCard : implements
    
    User "1" -- "0..*" SavingsAccountBenefits : has
```
    
