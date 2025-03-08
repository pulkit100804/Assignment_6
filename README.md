# Duck Simulation - Strategy Pattern

## Overview
This Java project demonstrates the **Strategy Pattern** by modeling different types of ducks with interchangeable behaviors for quacking, swimming, and flying. The program allows dynamic modification of a duck's behavior at runtime.

## Features
- Abstract `Duck` class with configurable behaviors.
- Concrete duck classes: `MallardDuck`, `RedHeadDuck`, `RubberDuck`, and `DecoyDuck`.
- Behavior interfaces and implementations for `FlyBehaviour`, `SwimBehaviour`, and `QuackBehaviour`.
- A `Main` class to demonstrate the simulation.

## Files & Structure
```
DuckSimulation/
├── Duck.java             # Abstract Duck class
├── FlyBehaviour.java     # Interface for fly behavior
├── SwimBehaviour.java    # Interface for swim behavior
├── QuackBehaviour.java   # Interface for quack behavior
├── FlyWithWings.java     # Flying implementation
├── FlyNoWay.java         # No flying implementation
├── SwimNormally.java     # Normal swimming implementation
├── FloatOnWater.java     # Floating behavior for rubber ducks
├── Quack.java            # Normal quacking implementation
├── Squeak.java           # Squeaking for rubber ducks
├── MuteQuack.java        # No quacking
├── MallardDuck.java      # Mallard Duck class
├── RedHeadDuck.java      # Redhead Duck class
├── RubberDuck.java       # Rubber Duck class
├── DecoyDuck.java        # Decoy Duck class
├── Main.java             # Main class to test the simulation
```

## How to Run
1. **Compile the Java files:**
   ```sh
   javac *.java
   ```
2. **Run the program:**
   ```sh
   java Main
   ```
3. Observe the different ducks displaying their behaviors.

## Expected Output
```
-------------------
RedHeadDuck displayed
Quack!
Swimming...
Flying with wings!
-------------------
RubberDuck displayed
Squeak!
Floating on water...
Cannot fly!
-------------------
MallardDuck displayed
Quack!
Swimming...
Flying with wings!
-------------------
DecoyDuck displayed
<< Silence >>
Floating on water...
Cannot fly!
-------------------
```

## Concepts Used
- **Encapsulation**: Duck behaviors are encapsulated into separate classes.
- **Strategy Pattern**: Allows runtime behavior modification.
- **Polymorphism**: Different duck types share a common interface but behave differently.

## Customization
You can create new types of ducks or behaviors and modify their implementations dynamically using the provided `setFlyBehaviour()`, `setQuackBehaviour()`, and `setSwimBehaviour()` methods.

## Author
Pulkit Shrivastava
