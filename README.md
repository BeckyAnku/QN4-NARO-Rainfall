# QN4 NARO Rainfall - Becky

## For loop compared with while loop

A `for` loop is compact and clear when the program already knows it must run 30 times.

```java
for (int day = 0; day < 30; day++) {
    monthRain[day] = random.nextInt(61);
}
```

A `while` loop can do the same job, but the counter is written separately.

```java
int day = 0;
while (day < 30) {
    monthRain[day] = random.nextInt(61);
    day++;
}
```

## Arrays in the sensor system

A single-dimensional array stores one row of data, such as daily rainfall for one month.

A multi-dimensional array stores data in rows and columns. NARO could use it for many sensors, where each row is a sensor and each column is a day.

## Exact output of the snippet

Only numbers above 10 are added. The numbers are `12`, `20`, and `15`.

```text
47
```

## Program notes

This version uses simple helper methods for filling readings, finding total rainfall, counting wet days, and classifying the month.
