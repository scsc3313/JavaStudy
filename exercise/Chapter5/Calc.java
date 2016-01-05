/**
 * Created by HSH on 15. 11. 11..
 */
public class Calc {


    private int howManyNumber;
    private int[] lottoNumber;
    private String[] lottoNumberLine;
    private int length;

    Calc (){
        length = 6;
    }
//    private String[] realLottoNumberLine;

//    public Calc() {
//        realLottoNumberLine = new String[1];
//
//    }

//    public void createRealLottoNumber(){
//        lottoNumberLine = new String[1];
//        howManyNumber = 1;
//        calculator();
//        realLottoNumberLine = lottoNumberLine;
//    }
    public void setLottoNumber(int[] lottoNumber) {
        this.lottoNumber = lottoNumber;
    }

    public void setHowManyNumber(int howManyNumber) {
        this.howManyNumber = howManyNumber;
        lottoNumberLine = new String[howManyNumber+1];
    }

    public void calculator(){
        for (int j = 0; j <= howManyNumber; j++) {  // 입력한 숫자만큼 반복한다!
            lottoNumberLine[j] = "";
            if(j == 0)
                length = 7;
            for(int i = 0; i < length ; i++){  //6번 반복한다! 로또니깐 ㅎㅎ
                int random = (int) (Math.random() * 44) + 1;
                if(lottoNumber[random] != 0){
                    String s = "0";
                    if(lottoNumber[random] < 10){  //숫자가 10보다 작으면
                        lottoNumberLine[j] += s;
                    }
                    lottoNumberLine[j] += lottoNumber[random] + " ";
                    lottoNumber[random] = 0;
                 }
                else{  //lottoNumber[random] == 0
                    i--;
                }
            }
            length = 6;
            Lotto lotto = new Lotto();
            lotto.initLottoNumber(); //0이 된 값들을 다시 복구!
            lottoNumber = lotto.getLottoNumber();
        }
    }

    public String[] getLottoNumberLine(){
        return lottoNumberLine;
    }
}
