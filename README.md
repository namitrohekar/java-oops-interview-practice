# Java OOP Practice

Daily Java OOP interview-oriented practice.
Focus: clean code, constructors, methods, collections.

Day 1: / OOPA_1
- Class & Object
- Constructor overloading
- Business logic
- State handling
- Aggregation

 Day 2: Encapsulation / OOPS_2
- Getters and setters
- Validation inside setters
- Read-only fields
- Controlled update methods
- Immutable class design
- Defensive setters
- State safety

Day 3: Inheritance & Polymorphism /OOPS_3
- Inheritance using `extends`
- Constructor chaining with `super`
- Method overriding
- Overriding vs overloading
- Runtime polymorphism
- Parent reference → child object
- `final` methods in inheritance
- Dynamic method dispatch

 Day 4: Abstraction / OOPS_4
- Abstract classes
- Abstract methods
- Partial abstraction
- Abstract class constructors
- Runtime polymorphism with abstract references
- Abstract vs concrete method control
- Template Method pattern (intro)

Day 5: Interfaces / OOPS_5
- Interface basics
- `implements`
- Multiple inheritance using interfaces
- Interface references and polymorphism
- Default methods in interfaces
- Interface vs abstract class
- Default method conflict (diamond problem)

Day 6: Object Class & Type Casting / OOPS_6
- Object class fundamentals
- toString() and meaningful object representation
- equals() vs == (identity vs logical equality)
- Proper equals() implementation checklist
- hashCode() contract and rules
- equals() + hashCode() consistency
- Hash-based collection behavior (HashSet / HashMap)
- Upcasting (implicit, safe)
- Downcasting (explicit, unsafe without checks)
- instanceof usage
- ClassCastException trap
- Runtime type behavior and polymorphism impact

Day 7: Object Relationships & Design / OOPS_7
- IS-A relationship (inheritance correctness)
- HAS-A relationship (object ownership)
- Composition (strong ownership, lifecycle dependency)
- Aggregation (weak ownership, independent lifecycle)
- Composition vs aggregation differences
- Choosing composition over inheritance
- Design correction: fixing wrong inheritance
- Real-world object modeling
- Interview design decision reasoning

Day 8 Topics / OOPS_8
- What exceptions really are (error vs failure)
- Checked vs unchecked exceptions
- try–catch–finally
- Exception propagation
- When to throw vs when to handle
- Creating custom exceptions
- Business-rule violations vs system failures
- Interview exception traps

Day 9: SOLID Principles (Practical Design) / OOPS_9
- Single Responsibility Principle (SRP)
- Separating business logic, persistence, and communication
- Execution flow vs responsibility boundaries
- Open/Closed Principle (OCP) using polymorphism
- Eliminating conditionals with abstractions
- Liskov Substitution Principle (LSP) and inheritance pitfalls
- Correct modeling using shared abstractions
- Interface Segregation Principle (ISP)
- Designing small, focused interfaces
- Dependency Inversion Principle (DIP)
- Depending on abstractions instead of concrete implementations
- Constructor-based dependency injection
- Design patterns aligned with Spring-style architecture

Day 10: Collections + Design Integration / OOPS_10
- Choosing the right collection (List vs Set vs Map) based on business rules
- Enforcing business uniqueness using collections
- equals() / hashCode() impact on collection behavior
- Identity-based vs value-based uniqueness
- Repository pattern with collections
- Applying SRP with collection ownership
- Moving storage responsibility out of services
- Using Map to model primary-key–based identity (Spring/JPA analogy)
- Applying DIP to collection storage
- Abstracting storage behind interfaces
- Swapping collection strategies without changing service logic
- Constructor injection for storage abstraction
- Deigning in-memory repositories aligned with real backend systems
- Integrating OOP + SOLID + Collections in interview-style problems