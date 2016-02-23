###SelctionSort 

- 배열에서 가장 큰 원소를 찾아 이 원소와 배열의 맨 끝자리엥 있는 원소의 자리를 바꾼다.

    selectionSort(A[], n){

        for last <- n downto 2 {
            A[1 .... last ] 중 가장 큰 수 A[k]를 찾는다;
            A[k] <-> A[last];      // 값을 교환한다.
        }
    }

    수행시간 : O(n^2)