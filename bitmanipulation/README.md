## Binary Number System

- **Base-2** system uses only **0** and **1**
- Each digit is a **bit** (binary digit)
- Positions represent powers of 2 (right to left): `..., 2^3 = 8, 2^2 = 4, 2^1 = 2, 2^0 = 1`
- **LSB** (Least Significant Bit) = rightmost bit (value 2^0)
- **MSB** (Most Significant Bit) = leftmost bit (highest power)

## Binary to Decimal

**Method:** Multiply each bit by its positional power of 2, then sum.

### Example: `1011` (binary) to decimal

| Bit | Position power | Value |
|-----|----------------|-------|
| 1   | 2^3 = 8        | 8     |
| 0   | 2^2 = 4        | 0     |
| 1   | 2^1 = 2        | 2     |
| 1   | 2^0 = 1        | 1     |

**Sum:** 8 + 0 + 2 + 1 = **11** (decimal)

`1011` (binary) = `11` (decimal)

## Decimal to Binary

**Method:** Divide by 2 repeatedly, track remainders (bottom to top).

### Example: `13` (decimal) to binary

| Division | Quotient | Remainder |
|----------|----------|-----------|
| 13 / 2   | 6        | 1 (LSB)   |
| 6 / 2    | 3        | 0         |
| 3 / 2    | 1        | 1         |
| 1 / 2    | 0        | 1 (MSB)   |

Read remainders **bottom to top** -> **1101** (binary)

`13` (decimal) = `1101` (binary)

## Binary & Decimal Table (0 to 7)

| Decimal | Binary (Standard) |
|---------|-------------------|
| 0       | 0                 |
| 1       | 1                 |
| 2       | 10                |
| 3       | 11                |
| 4       | 100               |
| 5       | 101               |
| 6       | 110               |
| 7       | 111               |

## Bitwise Operators

- Binary AND `&`
- Binary OR `|`
- Binary XOR `^`
- Binary One's Complement `~`
- Binary Left Shift `<<`
- Binary right Shift `>>`

### Binary AND `&`

| A | B | A & B |
|---|---|-------|
| 0 | 0 | 0     |
| 0 | 1 | 0     |
| 1 | 0 | 0     |
| 1 | 1 | 1     |

**Example: 5 & 6 = 4**

5 = 101

6 = 110

101 (5) & 

110 (6)

100 (4) Result

### Binary OR `|`

<table>
  <tr>
    <th>A</th>
    <th>B</th>
    <th>A | B</th>
  </tr>
  <tr>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>1</td>
    <td>0</td>
    <td>1</td>
  </tr>
  <tr>
    <td>1</td>
    <td>1</td>
    <td>1</td>
  </tr>
</table>

**Example: 5 | 6 = 7**

5 = 101

6 = 110


101 (5) |

110 (6)

111 (7) Result

### Binary OR `^`

| A | B | A & B |
|---|---|-------|
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 0     |

**Example: 5 ^ 6 = 3**

5 = 101

6 = 110

101 (5) |

110 (6)

011 (3) Result

### Binary One's Complement `~`

| A | B |
|---|---|
| 0 | 1 |
| 1 | 0 |

**Example: ~5 = 2** (in simple binary flip)

5 = 101

~ 5 = 010 (binary) =  2 (decimal)


**In programming (2's complement):** `~5 = -6` (formula: `~n = -n - 1`)

### Binary Left Shift `<<`

**Rule:** Shifts bits left, fills right with 0, LSB moves left, MSB lost.

| Operation | Binary | Decimal |
|-----------|--------|---------|
| 5 << 1 | `101` -> `1010` | 10 |
| 5 << 2 | `101` -> `10100`| 20 |

**Formula:** `a << b = a * 2^b`

**Example: 3 << 2 = 12**

3 = 0011

3 << 2 = 1100 = 12 (3 x 4)

### Binary Right Shift `>>`

**Rule:** Shifts bits right, LSB lost, MSB filled with 0 (for positive numbers).

| Operation | Binary | Decimal |
|-----------|--------|---------|
| 5 >> 1 | `101` -> `10` | 2   |
| 5 >> 2 | `101` -> `1`  | 1   |

**Formula:** `a >> b = a / 2^b` (integer division)

**Example: 12 >> 2 = 3**

12 = 1100

12 >> 2 = 0011 = 3 (12 / 4)