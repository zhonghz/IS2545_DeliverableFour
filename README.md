# IS2545_DeliverableFour

In Deliverable Four, I made modification of three methods which are Cell.toString(), MainPanel.runContinuous() and MainPanel.convertToInt() to improve the performance of the application. These three methods are easily identified as "hot spots" of the application when using VisualVM as profiler to determine methods that consume most resources. To test the function of method doesn’t change after modification. I used unit tests for Cell.toString() and MainPanel.convertToInt (), but manual testing for MainPanel.runContinuous() as this method has no return value.

For more detailed information and screenshots, please view ReadMe.pdf
