Feature:

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the homepage
    When User click Filter and search box
@OPC-1074
  Scenario: User should be able to see default filters
  When User click settings button

    And User click settings button
    And User click Reset to default button
    And User click Continue button in popup
    Then User see default filters
      | WORKFLOWS     |
      | ANNOUNCEMENTS |
      | MY ACTIVITY   |
      |FAVORITES      |
      |WORK           |


@OPC-1075
  Scenario:
    And User click Add field button
    Then User see all fields as
          | Date   |
          | Type   |
          | Author |
          |To      |
          |Favorites  |
          |Tag        |
          |Extranet   |

    Then User click check boxes and see fields are added and removed

@OPC-1076
  Scenario:
    When User click RestoreDefaultFields button
    When User click Date dropdown
    And User select Yesterday option
    And User click search button
    Then each result should be from Yesterday if exist
@OPC-1077
  Scenario:
    When User click RestoreDefaultFields button
    When User click Date dropdown
    And User select CurrentDay option
    And User click search button
    Then each result should be from CurrentDay if exist
@OPC-1080
  Scenario:
    When User click RestoreDefaultFields button
    When User click Date dropdown
    And User select Month option and click search
    Then User see the results of December "2021"

  @OPC-1078
  Scenario Outline:
    When User click RestoreDefaultFields button
    When User click Type dropdown
    Then User selects the types from "<type>" field and see its results

    Examples:
      | type          |
      | Posts         |
      | Announcements |
      | Polls         |

  @OPC-1083
  Scenario Outline:
    When User click RestoreDefaultFields button
    When User click Type dropdown
    Then User selects the types from "<type1>", "<type2>" field and see its results

    Examples:
      | type1 | type2   |
      |Posts  | Announcements |



  @OPC-1079
    Scenario Outline:
      When User click RestoreDefaultFields button
      And User fill some fields
      And User click Save Filter button
      And User input a "<Filter Name>"
      Then User click Save button and see saved "<Filter Name>"
        Examples:
          | Filter Name |
          | My search   |


@OPC-1081
      Scenario:
        When User click RestoreDefaultFields button
        When User fill some fields
        And User add some fields
        And User remove some fields
        And click on Restore Default Fields button
        Then User should see  default fields as
          | Date   |
          | Type   |
          | Author |
          | To     |

  @OPC-1082
  Scenario:
    When User click RestoreDefaultFields button
    When User fill some fields
    And User click Reset button
    Then User doesn't see any condition in filter and search box.



