###Chapter12

    1부터 n까지의 자연수를 차례로 더하여 구해진 값을 삼각수라고 합니다.
    예를 들어 7번째 삼각수는 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28이 됩니다.
    이런 식으로 삼각수를 구해 나가면 다음과 같습니다.

    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
    이 삼각수들의 약수를 구해봅시다.

     1: 1
     3: 1, 3
     6: 1, 2, 3, 6
    10: 1, 2, 5, 10
    15: 1, 3, 5, 15
    21: 1, 3, 7, 21
    28: 1, 2, 4, 7, 14, 28
    위에서 보듯이, 5개 이상의 약수를 갖는 첫번째 삼각수는 28입니다.

    그러면 500개 이상의 약수를 갖는 가장 작은 삼각수는 얼마입니까?

###Solve

    일단 삼각수를 구하는 것은 무지하게 쉽다!
    자신의 수까지 for문을 돌려 더하면 된다.
    약수를 구하는 것은 지난 소인수 분해하고 비슷할 것 같다.
    허나 500개 이상의 약수를 가지는 삼각수는 너무나 클 것이다. <- 이부분이 핵심일 듯