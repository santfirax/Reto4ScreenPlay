#Author: José Santiago Molano Perdomo, jmolanop@choucairtesting.com, jsmolano@bancolombia.com.co
@Regresion
Feature: Reto4Screenplay

  @successFullCase
  Scenario: Report activities on maxtime
    Given Santiago as a test analyst
      | user     | password   |
      | jmolanop | 3158985879Ss. |
    When Santiago wants to perform the report of his activies of Maxtime
    |proyectName|
    |core recaudos|
    Then to fullfill the task that his must carry out daily