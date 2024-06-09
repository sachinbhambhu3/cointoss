# cointoss
Overview
The Coin Toss Simulation project is a simple Java application that simulates the flipping of a coin. This project serves as an introduction to using Java classes, objects, and the Random class for generating random outcomes. The program flips a coin multiple times and displays the result of each flip.

Features
Coin States: The coin can be in one of two states: HEADS or TAILS.
Initialization: The coin can be initialized to start in either the HEADS or TAILS state.
Random Tossing: The coin can be tossed, randomly changing its state to either HEADS or TAILS.
Result Display: After each toss, the current state of the coin is displayed.
Classes and Methods
Coin Class
Constants:

HEADS: Represents the heads side of the coin (value 0).
TAILS: Represents the tails side of the coin (value 1).
Instance Variables:

faceup: An integer representing the current state of the coin (either HEADS or TAILS).
rand: A Random object used to generate random outcomes.
Constructor:

Coin(int start): Initializes the coin with the specified starting state (either HEADS or TAILS).
Methods:

void toss(): Simulates tossing the coin by randomly setting the faceup variable to either HEADS or TAILS.
String result(): Returns the current state of the coin as a string ("Head" or "Tail").
main Method
The main method in the Coin class demonstrates the functionality of the Coin class:
Creates a Coin object initialized to HEADS.
Prints the starting state of the coin.
Tosses the coin 10 times, printing the result of each toss.
