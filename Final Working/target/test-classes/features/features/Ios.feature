Feature: Test Meijer application camera on ios
 
 @ios
 Scenario: Open camera by clicking scan button on ios
 Given Open Meijer application on ios
 Then Click on location accept button
 Then Click on okay button
 When Click on Scan button on ios
 Then Camera should be invoked on ios