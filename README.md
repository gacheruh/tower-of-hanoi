# Tower of Hanoi

The Tower of Hanoi is a mathematical puzzle consisting of three rods and a number of disks of different sizes, which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical shape.

#### The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

* Only one disk can be moved at a time.
* Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
* No disk may be placed on top of a smaller disk.

#### Here is an example of how the puzzle can be solved for 3 disks:

1. Move disk 1 from rod A to rod C
2. Move disk 2 from rod A to rod B
3. Move disk 1 from rod C to rod B
4. Move disk 3 from rod A to rod C
5. Move disk 1 from rod B to rod A
6. Move disk 2 from rod B to rod C
7. Move disk 1 from rod A to rod C

```python
def tower_of_hanoi(n, source, destination, auxiliary):
    if n == 1:
        print(f"Move disk 1 from rod {source} to rod {destination}")
        return
    tower_of_hanoi(n - 1, source, auxiliary, destination)
    print(f"Move disk {n} from rod {source} to rod {destination}")
    tower_of_hanoi(n - 1, auxiliary, destination, source) 
    
tower_of_hanoi(3, 'A', 'C', 'B')
```

In this code, n represents the number of disks, source is the rod from which the disks are moved, destination is the rod to which the disks are moved, and auxiliary is the spare rod. The function recursively calls itself with a smaller number of disks until it reaches the base case of moving a single disk. Then, it prints out the move and continues with the remaining disks. The example usage shows how to solve the Tower of Hanoi problem with 3 disks.


In the recursive implementation of the Tower of Hanoi problem, the function is called twice within itself to move the disks from one rod to another.

The first recursive call moves n-1 disks from the source rod to the auxiliary rod, using the destination rod as the spare rod. This step essentially reduces the problem to moving the remaining single disk from the source rod to the destination rod.

After the first recursive call completes and the n-1 disks are moved to the auxiliary rod, the second recursive call moves the remaining single disk from the source rod to the destination rod using the auxiliary rod as the spare rod.

So, the function is called twice to solve the Tower of Hanoi problem recursively and move all the disks from the source rod to the destination rod.
