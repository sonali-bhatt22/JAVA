# Recursion 
When a function call itself until a specific condition is met

void f(){
    print(!)
    f()
}
main(
    {
        f();
    }
)
`void f(){
    print(!)
    f()
}` this will gonna run again and again
if no condition applied it will go infinite times

`There is stack `

# Hashing
pre storing and fetching
ye ek naya array banega or main array ko traverse krke jo element jitni bar hai usko same index of nye array me save kr lega then we can fetch data from hash array(new aray)

int[] hash = new int[13];

# Hashing a character






## SORTING

1. Selection Sort--(select minimum and swap)

> `in first iteration the minimum number in array comes to first place and the first element will go to its place (swap first will be swapped to minimum one);`

> `repeat this process  we will find minimum in unsorted part `

2. Bubble Sort === [pushes max to the last by adjacent swaps]

> `compare first two are they sorted or not if nit sawp`

> `do this repeat`

> `after one pass the largest no. will be at last`

in bubble sort we are going from 1 to last element that means >> 0 - n-1, 0 - n-2, 0 - n-3 and so on upto 0 - 1 (inner loop)

in outer loop we are going from n-1 to  >=1

3. Insertion Sort = [Take an element and place it in its correct order]

> `picked every element and put it in its correct position`

> 

4. Merge Sort-- [divide and merge]

