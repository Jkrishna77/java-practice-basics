# Arrays.stream() Cheat Sheet

Java 8+ provides powerful stream operations for arrays. This guide summarizes common patterns and syntax.

## Common Operations

| Operation                  | Syntax Example                                 | Description                                 | Return Type         | Notes                                      |
|----------------------------|------------------------------------------------|---------------------------------------------|---------------------|---------------------------------------------|
| Convert array to stream    | `Arrays.stream(arr)`                           | Converts array to a stream                  | IntStream / Stream<T> | Primitive arrays → IntStream, Object arrays → Stream<T> |
| Sum of elements            | `Arrays.stream(arr).sum()`                     | Adds all elements                           | int / long / double | Only for primitive streams                  |
| Maximum element            | `Arrays.stream(arr).max().getAsInt()`          | Finds max element                           | OptionalInt         | Use `.getAsInt()` for value                 |
| Minimum element            | `Arrays.stream(arr).min().getAsInt()`          | Finds min element                           | OptionalInt         | Use `.getAsInt()` for value                 |
| Count elements             | `Arrays.stream(arr).count()`                   | Counts all elements                         | long                | Can filter before counting                  |
| Count with condition       | `Arrays.stream(arr).filter(x -> x > 5).count()`| Counts elements matching condition          | long                | Use `.filter()` for condition               |
| Average                    | `Arrays.stream(arr).average().getAsDouble()`   | Calculates average                          | OptionalDouble      | Use `.getAsDouble()` for value              |
| Sum of squares             | `Arrays.stream(arr).map(x -> x * x).sum()`     | Maps then sums elements                     | int / long / double | `.map()` transforms elements                |
| Find first element         | `Arrays.stream(arr).findFirst().getAsInt()`    | Gets first element                          | OptionalInt         | Use `.getAsInt()` for value                 |
| Sort array                 | `Arrays.stream(arr).sorted().toArray()`        | Returns sorted array                        | int[] / T[]         | Ascending order                            |
| All match condition        | `Arrays.stream(arr).allMatch(x -> x > 0)`      | True if all match condition                 | boolean             | Useful for validation                       |
| Any match condition        | `Arrays.stream(arr).anyMatch(x -> x % 2 == 0)` | True if any match condition                 | boolean             |                                            |
| Distinct elements          | `Arrays.stream(arr).distinct().toArray()`      | Removes duplicates                          | int[] / T[]         |                                            |
| Convert to List            | `Arrays.stream(arr).boxed().toList()`          | Converts to List<Integer>                   | List<Integer>       | `.boxed()` needed for primitives            |
| Reduce / Aggregate         | `Arrays.stream(arr).reduce(0, (a,b) -> a+b)`   | Aggregates elements                         | Depends             | `reduce(identity, binaryOperator)`          |

---

## Notes

- **Primitive vs Object Arrays**
  - `int[] arr` → `IntStream`
  - `Integer[] arr` → `Stream<Integer>`

- **Optional Return Types**
  - `.max()`, `.min()`, `.average()` return `OptionalInt` / `OptionalDouble`
  - Use `.getAsInt()` or `.getAsDouble()` to extract values

- **Functional Programming**
  - `.filter()` → select elements
  - `.map()` → transform elements
  - `.reduce()` → combine elements
  - You can chain multiple operations

---

## Example

```java
int[] arr = {3, 7, 2, 9, 5};
int sum = Arrays.stream(arr).sum(); // 26
int max = Arrays.stream(arr).max().getAsInt(); // 9
long countEven = Arrays.stream(arr).filter(x -> x % 2 == 0).count(); // 1
List<Integer> list = Arrays.stream(arr).boxed().toList();
```