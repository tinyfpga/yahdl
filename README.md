# yahdl
Yet Another Hardware Description Language.

## Objective
To provide a familiar and productive language for makers and hobbyists to develop applications on FPGAs.  

## Guiding Principals
These principals are used to guide design and development of the language, tools, and ecosystem.

1. Make it easy to use and understand.
2. Make it easy to write reusable libraries.  Make it easy to use reusable libraries.
3. Provide a clear path from "easy but unoptimized" to "optimized but difficult".
4. Prefer the most widely recognizable syntax, structure, and patterns over cutting-edge or exotic alternatives.
5. Prefer low-level library functions over built-in language features.
6. Avoid high-level synthesis.

## Language Design Summary
The core language borrows heavily from both Verilog and C++.  Most Verilog concepts translate directly into yahdl concepts but with a syntax that looks more like C++.  Verilog modules, parameters, ports, nets, always blocks, and assign statements all have direct representations in yahdl.  New concepts of synthesizable threads, function calls, and classes are added.  Threads and sequential functions are transformed into control and datapath logic.

## Language Design


### Packages

### Data Types
#### Time
#### Literals
#### Logic Vectors
#### Arrays
#### Classes

### Structural Elements
#### Modules
#### Nets

### Operators
#### Select
#### Postfix Increment and Decrement  
#### Prefix Increment and Decrement
#### Logical Reduction
#### Unary Plus and Minus
#### Concatenation
#### Replication
#### Multiplication, Division, and Modulus
#### Addition and Subtraction
#### Shift Operators
#### Relational Operators
#### Bitwise Operators
#### Logical Operators
#### Conditional Operator
#### Assignment Operators

### If-Else Statements

### Switch Statement

### For Loop

### While Loop

### Functions

### Modules

### Classes

## Compiler Design
### Parser
### Abstract Syntax Tree
### Symbol Table Generation
### Symbol Resolution
### Control and Datapath Generation
### Verilog Output

