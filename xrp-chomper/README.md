# XRP Chomper

This is a sample robot program for a XRP robot with a [BigMouth Attachment](https://www.printables.com/model/960355-bigmouth-a-simple-item-grabber-for-the-xrp-platefo). The BigMouth attachment uses a single servo to control its position.

This program is based off the XRP Reference Example, with the Arm subsystem being replaced by the Chomper Subsystem. The subsystem provides a single useful method, `setPosition(ChomperPosition pos)` which is used to set the state of the mouth (open or closed).