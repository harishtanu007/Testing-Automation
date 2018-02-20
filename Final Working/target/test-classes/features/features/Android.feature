Feature: Test Meijer application camera
 
 @android
 Scenario: Login with account Details
 Given Open Meijer application on android
 Then Go to Accounts tab
 When Insert login credentials
 Then User must sign in 
 
 
 @android
 Scenario: Start trip with QRCode
 Given Go to scan button
 Then Insert start of trip
 When click okay button
 Then Trip must start
 When Click on scan
 Then Insert Item Code
 When Click okay
 Then Item must be added