###MergeSort

- 먼저 입력을 반으로 나눈다. 나눈 부분을 각각 독립적으로 정렬한다. 마지막으로 두 부분 정렬하면서 합친다.

    mergeSort(A[], p, r){
        if(p < r) then{
            q <- (p+r) / 2 or (p+r+1) / 2
            mergeSort(A, p , q);
            mergeSort(A, q+1, r);
            merge(A, p, q, r);
        }
    }

    merge(A[], p, q, r){
        정렬되어 있는 두 배열 A[p .... q]와 A[q+1 ... r]을 합쳐
        정렬된 하나의 배열 A[p ...r]을 만든다.
    }

    수행시간 : O(nlogn) 