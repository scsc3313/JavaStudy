###BubbleSort

- 버블정렬도 제일 큰 원소를 끝자리로 옮기는 작업을 반복하는 정렬이다.

    bubbleSort(A[], n){

        for last <- n downto 2 {

           for i <- 1 to last - 1 {
                if(A[i] > A [i+1])  then A[i] <-> A[i+1]; -> 원소 교환
           }
        }

    }

    수행시간 : O(n^2)