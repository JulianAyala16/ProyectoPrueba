@stories
Feature: Academy Choucair
  As a user, i want to learn how to automate in screenplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Search for automation course
    Given than Brandon wants to learn automation at the academy Choucair
    | strUser    | strPassword   |
    | 1095820788 | Choucair2020* |
    When he search for the course on the choucair academy plataform
    | strCourse |
    | Prueba Técnica - Analista Bancolombia    |
    Then he finds the course called resources
    | strCourse |
    | Prueba Técnica - Analista Bancolombia    |

