Feature: Test Meijer application camera
 
 @android
 Scenario: Open camera by clicking scan button
 Given Open Meijer application
 Then Click on okay dialog
 When Click on Scan button
 Then Camera should be invoked 