###HeapSort

- 힙이라는 특수한 자료구조를 사용하는 정렬 알고리즘이다.

    bulidHeap(A[], n){

        for i <- n / 2 down to 1
            heapify(A, i, n);
    }

    heapify(A[], k, n){

        left <- 2k; right <- 2k + 1;

        if(right <= n) then{
            if(A[left] < A[right]) then smaller <- left;
                                           else smaller <- right;

        }
        else if(left <= n) then smaller <- left;
        else return;

        if(A[smaller] < A[k]) then {
            A[k] <-> A[smaller];
            heapify(A, smaller, n);
        }
    }

    수행시간 : O(nlogn)