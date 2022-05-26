# Counter
 
Small app I made to understand state management with Compose using state hoisting.

Overview:

In the beginning I started with a Counter composable capable of managing its own counter.
I then added a CountersList with a sum of all the counters, and capable of adding and removing counters.

In order to remove the right counter, and not always the only one, I moved the counter state to the CountersList component.
This also made it easier to add to the total counter. In the end, the CountersList ended up owning the the counter state.


I would like to find a solution where each counter can own their own state instead, and the parent can see that state without much hassle