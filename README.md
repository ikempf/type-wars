# Intro
Languages check elements of your program statically and dynamically.
It's never black and white but there are strong leanings toward either static or dynamic typing.
We know for a fact that more information is available at runtime than at compile time
Some elements are extremely hard to check at compile time (example : format of the result of an es or sql query)

## What should be checked
## When should it be checked


# Dynamic typing
## Convenience
- The developer has full control
- No "overhead" is needed in order to indicate the "intent" of the developer to the program
- It is clumsier and less expressive, it needs technical boilerplate

example:
I want to return different types depending of the input
I want to build a heterogeneous collections
I want to build a polymorphic function

## Static prevents useful programs

## Prototyping
I can write partial/incomplete programs and try/iterate to a complete solution

## Typing only catches easy bugs

# Static typing
## Convenience
- No tests are necessary to assert an expected type

example:
Testing that arguments to add are in fact integers
Waiting for runtime to detect bad usage of a function


## Type driven development
example: 
Looking for signatures instead of function names (cats, scalaz...)
Hoogle

## Code evolution
Changing parameter or return types
Renaming
Moving code around ()Also true for tests)
Making changes in different versions

## Allows higher levels of abstraction
Abstract types like Option are hard to manipulate in dynamic languages

## Catches bugs earlier

## Performance
No type information needs to be present at runtime
Ne automatic or manual checks on type needs to be done at runtime