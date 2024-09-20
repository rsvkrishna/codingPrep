Features Required:
Configurable Limits: Ability to set request limits per unit of time.

Support for Different Time Windows: Support for different types of time windows (e.g., sliding window, fixed window).

Thread Safety: Ensure that the rate limiter can handle concurrent access correctly.

Ease of Configuration: Easily configurable limits and time windows.

Extensibility: Allow extension for different rate-limiting strategies.

Metrics and Logging: Provide metrics and logging for monitoring purposes.

Design Patterns
Strategy Pattern: Allows for flexibility in changing rate-limiting algorithms without modifying the client code.

Singleton Pattern: Ensures only one instance of the rate limiter exists, maintaining a consistent state.

Factory Pattern: Encapsulates the creation logic for different rate-limiting strategies, promoting clean code and adherence to the Open/Closed principle.

Template Method Pattern: Provides a standard process for rate-limiting while allowing specific steps to be defined by subclasses.

Multiple Algorithms :
Fixed Window Algorithm: Counts the number of requests in fixed time windows.

Sliding Window Algorithm: Uses a rolling time window to count requests.