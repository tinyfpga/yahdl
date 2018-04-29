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
Tokenize and parse the design files into concrete syntax trees.

### Abstract Syntax Tree Generation
Convert the concrete syntax trees into abstract syntax trees.  An AST
(abstract syntax tree) is more suitable for further processing.

### Symbol Table Generation
The symbol table for each scope is generated.  The complete symbol table is
actually a tree of tables where each node represents a scope.

### Symbol Resolution
Every reference to a symbol is resolved to the definition of that symbol.

### Elaboration
Starting at the top module going down the hierarchy, modules are copied to each
location they are instantiated.

### Constant and Parameter Propagation and Evaluation
Starting at the top module going down the hierarchy, parameter and constant
expressions are evaluated and propagated.

### Expression Simplification
Expressions are simplified.

### Control Graph Extraction
The control flow for each method and thread is extracted.  Assignments and
expressions are included in

### Datapath Graph Extraction
The data flow from each control graph is extracted with signals connecting
the control graph to the data graph control points.  Temporary storage and muxes
are added as necessary.

### Dead Code Elimination
Dead code is pruned from the control graph and data graph based on expressions
known at compile-time.  

### Simple State Fusion
Combine independent and trivially dependent statement nodes into a single node.
Trivially dependent statements are dependent assignment expressions comprised of
a small number of logical functions, unlimited constant bitslicing, unlimited
constant shifts, and variable references.

### Call Graph Generation
Beginning from each always block and thread, a directed graph is generated that
describes every location that every function is called from.

### Trivial Function Inline
Trival getter and setter functions are inlined.

### Arbiter Insertion
Arbiters are inserted for functions that are called from more than one thread
and for module fields that are updated from more than one always block or
thread.

### Control and Datapath Graph Optimization
When implementing the design, there are many implementation decisions to be
made along the way.  Simple decisions like whether a function should be inlined
or not can make a big difference in performance and resource utilization.

Optimization stages must implement three features:
1. Identify locations to perform the optimization.
2. Heuristics to get cheap decisions on whether the optimization should be
performed when it is obvious what to do.
2. Perform the optimization.

Possible implementation optimizations:
- Loop Unrolling
- Function Inline
- Complex State Fusion

### Verilog Output
Output the design in human-readable and synthesizable verilog.
