# Queue
This repository contains a Java implementation of a queue data structure with a specific application for managing pocket money. The implementation follows the First-In-First-Out (FIFO) principle.
## LinkedQueue
The LinkedQueue class is designed to represent a queue using a linked list. It provides the following methods:

- add(Object obj): Adds an element to the end of the queue.
- remove(): Removes and returns the element from the front of the queue.
- first(): Returns the element from the front of the queue without removing it.
- size(): Returns the current size of the queue.
### Node
The Node class is a private inner class used by LinkedQueue to create nodes for the linked list. Each node contains data, a reference to the previous node, and a reference to the next node.


**Note**: The example assumes daily pocket money and expenses, but you can adapt it to suit different scenarios or extend the functionality of the LinkedQueue class based on your specific requirements.
