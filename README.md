# Decola Tech Avanade

Java RESTful API criada para o Decola Tech Avanade

## Diagram de classes



```mermaid
classDiagram
    class User {
        -int id
        -string name
        -Profile profile
        -Login login
        -List~Opportunity~ opportunities
        -List~Highlight~ highlights
    }

    class Profile {
        -int id
        -string city
        -string user_type
        -List~string~ interests
    }

    class Login {
        -string email
        -string password
        -bool remember_me
    }

    class Opportunity {
        -int id
        -string icon
        -string title
        -string description
    }

    class Highlight {
        -int id
        -string icon
        -string description
    }

    User --> Profile
    User --> Login
    User --> Opportunity : contains
    User --> Highlight : contains

```
