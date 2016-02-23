###QuickSort

- 평균적으로 가장 좋은 성능을 가져 현장에서 가장 많이 쓰이는 정렬 알고리즘이다. 
- 임의의 원소를 기준원소로 선택하여 그 원소보다 작으면 왼쪽에, 그 원소보다 크면 오른쪽에 배치를 하는 정렬 방식이다.
    
    //여기에선 r이 기준원소
    quickSort(A[], p, r){

        if(p < r) then {
            q <- partition (A, p, r);  분할
            quickSort(A, p, q-1);    왼쪽 부분 배열 정렬
            quickSort(A, q+1, r);    오른쪽 부분 배열 정렬

        }
    }

    partition(A[], p, r){
        배열 A[p ... r]의 원소들을 A[r]을 기준으로 양쪽으로 재배치하고
        A[r이 자리한 위치를 리턴한다.]
    }

    partition(A[], p, r){
        x <- A[r];
        i  <- p - 1;
        for j <- p to r - 1
            if(A[j] <= x) then A[++i] <-> A[j];

        A[i+1] <-> A[r];
        return i+1;
    }

    수행시간 : O(nlogn) 최악의 경우 O(n^2) (기준원소를 가장 크거나 가장 작은 것으로 설정할 경우)