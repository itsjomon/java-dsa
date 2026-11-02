# Operator Precedence and Associativity in Java

Operator precedence determines the order in which operators in an expression are evaluated.

### Example
```java
int x = 3 * 4 - 1;
```

In the above example, the value of `x` will be **`11`**, not `9`. This happens because the precedence of the multiplication operator (`*`) is higher than the subtraction operator (`-`). Therefore, the expression is evaluated as `(3 * 4) - 1` and not `3 * (4 - 1)`.

## Operator Precedence & Associativity Table

When an expression has two operators with the same precedence, the expression is evaluated according to its **associativity** (either left-to-right or right-to-left).

| Category | Operators | Associativity |
| --- | --- | --- |
| Postfix increment and decrement | `++`, `--` | Left to right |
| Prefix increment, decrement and unary | `++`, `--`, `+`, `-`, `!`, `~` | Right to left |
| Multiplicative | `*`, `/`, `%` | Left to right |
| Additive | `+`, `-` | Left to right |
| Shift | `<<`, `>>`, `>>>`  | Left to right |
| Relational | `<`, `<=`, `>`, `>=`, `instanceof` | Left to right |
| Equality | `==`, `!=` | Left to right |
| Bitwise AND | `&` | Left to right |
| Bitwise exclusive OR | `^` | Left to right |
| Bitwise inclusive OR | `\|` | Left to right |
| Logical AND | `&&` | Left to right |
| Logical OR | `\|\|` | Left to right |
| Ternary | `?:` | Right to left |
| Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, `\|=`, `<<=`, `>>=`, `>>>=` | Right to left |
