Feature: Cucumber Datatable feature

  Scenario: single row with no header
    Given  my credentials
      |john|jhon123|

  Scenario: multiple row with no header
    Given  my credentials for multiple rows
      |john|jhon123|
      |bill|bill123|

  Scenario: single row header
    Given  my credentials for single row with header
      |username|password|
      |john    |jhon123 |

  Scenario: single column with no header
    Given  my credentials for single column with no header
      |john|
      |jhon123|

  Scenario: single column with header
    Given  my credentials for single column with header
      |username |john    |
      |password |jhon123 |

  Scenario: single column with multiple rows without header
    Given  my credentials for single column with multiple rows without header
      |john    |
      |jhon123 |

