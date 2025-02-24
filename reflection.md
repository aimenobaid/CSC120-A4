Use this file to record your reflection on this assignment.

- What are your initial impressions of how Encapsulation affects your programming?
- What worked, what didn't, what advice would you give someone taking this course in the future?

Initial Impressions:
Encapsulation allowed for better code organization and modular development, making it easier to maintain and change. Each class handles its own responsibilities without unnecessary details. 

What Worked:
- Implementing the Engine class first helped establish a solid foundation for the rest of the program. Since the engine is a core part of the train, defining its attributes and behaviors early on provided a clear direction for how the Train class should interact with it.
-Planning out what needed to be in each class before coding made implementation smoother. Discussing the structure with someone else helped clarify what each class should handle and prevented unnecessary complexity. This approach ensured that responsibilities were distributed logically, avoiding excessive dependencies between classes.

Challenges:
- Properly encapsulating while still providing necessary accessors was a balancing act. While it was important to restrict direct access to class attributes, certain getters and methods had to be exposed to allow interaction between components. Deciding which attributes should have public accessors versus which should remain private required careful consideration.
-Ensuring that the Passenger class interacted correctly with Car methods was trickier than I expected. Since passengers should only be able to board available cars and exit from cars they are currently i. Debugging issues related to passenger movement highlighted the importance of clear method contracts and verifying return values from addPassenger() and removePassenger().


Advice for Future Students:
-Talk through your design before coding. Discussing how different classes interact—either out loud, with a peer, or by sketching a diagram—can prevent a lot of confusion later. This makes it easier to spot potential design flaws early on.
-Think about encapsulation from the start. Consider which attributes and methods truly need to be public. Avoid exposing internal details unless necessary, as it keeps the program structured.
-Test small components individually before integrating them. Implementing and testing each class separately before connecting them all in Train was helpful.
