###Chapter 17

    1부터 5까지의 숫자를 영어로 쓰면 one, two, three, four, five 이고,
    각 단어의 길이를 더하면 3 + 3 + 5 + 4 + 4 = 19 이므로 사용된 글자는 모두 19개입니다.

    1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를 사용해야 할까요?

    참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며, 단어 사이의 and 는 셈에 넣습니다.
      예를 들어 342를 영어로 쓰면 three hundred and forty-two 가 되어서 23 글자,
      115 = one hundred and fifteen 의 경우에는 20 글자가 됩니다.

###Solve

    영어라는게 마음에 들진 않지만 해보도록 하였다.
    일단 1 ~ 10까지 각 단어의 길이를 저장을 하고, 100, 1000, and의 길이를 저장해야 한다.
    저장된 길이들을 토대로 글자 갯수를 더해서 답을 구한다.
