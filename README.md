# Virtual Pet

### Introduction

In this assignment you’ll be making a game which simulates a pet. Your pet should have a name and will have characteristics such as hunger, thirst, and boredom, which will increase over time. You will interact with the virtual pet by choosing a few options from a list, for example, you may output something along the lines of “Press 1 to feed your pet”. If the user chooses one, the pet will be fed. You should also output your pet’s current status whenever you interact with it. We also require you to create a few tests, TDD could prove quite useful here.

###  Required Tasks

* VirtualPet class

1. You will need to create a VirtualPet class.
2. Create at least four instance variables (Name, Hunger Level, Thirst Level, Boredom Level, or something you want).
3. Create at least three methods (Think about the instance variables that will change over time! For example perhaps a feed() method that lowers hunger).
4. Create a tick() method that represents the passage of time. Call it once per loop.

* VirtualPetApp class

1. Create a main method.
2. Implements a game loop to keep the game running.
3. Asks for user input to interact with your pet. 
4. Writes output to the console which should reflect the pet’s current status.

* Stretch Tasks

1. Create a visual representation of your pet.
2. Rather than using numbers to convey your pet’s status, you could have some sort of visual representation of the pet. I.e., instead of printing hunger: 50, you could use smileys or ASCII art to show hunger when hunger >= 50.
3. Give the pet the ability to take care of some of its own needs.
4. Pets are not robots - they usually have some sort of self-determination! When tick() is called, you might want to have your pet take a look at its needs and address one, prioritizing whichever need is highest. You could also make your pet uncooperative - when the user tries to feed the pet, for example, you might make the pet refuse to eat if it is bored. Remember how we created an instance of the Random class to create a random number generator? You might want to incorporate that.

### Rubric
 - view Rubric on [Canvas](https://wecancodeit.instructure.com/courses/181/assignments/2181?module_item_id=11252).