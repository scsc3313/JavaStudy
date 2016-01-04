/**
 * Created by HSH on 2015. 11. 23..
 */
public class Check {

    private int realCount;
    private int[] lottoNumber;
    private int[] realLottoNumber;
    private String[] lottoNumberLine;
    private int winLottoCount;
    private int firstWin, secondWin, thirdWin, fourthWin, fivthWin;

    Check(){
        realCount = 0;
        realLottoNumber = new int[7];
        lottoNumber = new int[7];
        winLottoCount = 0;
        firstWin = 0;
        secondWin = 0;
        thirdWin = 0;
        fourthWin = 0;
        fivthWin = 0;
    }

    public void splitLottoNumberLine(){

        String[] splitLottoNumber;
        String lottoNumbersLine = "";
        for(int i = 0 ; i < lottoNumberLine.length ; i++){
            //i번째줄의 로또 번호를 나누어 로또 당첨 갯수를 맞추는 알고리즘
            splitLottoNumber = lottoNumberLine[i].split(" ");
            if(i==0){
                makeRealLotto(splitLottoNumber);
                for(int j = 0; j < realLottoNumber.length; j++){
                    if(j != 6){
                        lottoNumbersLine += String.valueOf(realLottoNumber[j]) + " ";
                    }
                    else {
                        lottoNumbersLine += "보너스 번호 : " + String.valueOf(realLottoNumber[j]);
                    }
                }

            }
            else{
                howManyRealLotto(splitLottoNumber);
                //i번째줄의 로또 번호를 다시 합쳐 원래 로또 번호 줄로 복귀하는 과정
                for(int j = 0; j < lottoNumber.length; j++){
                    if(j != 6){
                        lottoNumbersLine += String.valueOf(lottoNumber[j]) + " ";
                    }
                    else{
                        String s = String.valueOf(lottoNumber[j]) + " ";
                        if(lottoNumber[j] > 2){
                            ++winLottoCount;
                            switch (lottoNumber[j]){
                                case 6 :
                                    firstWin++;
                                    break;
                                case 5 :
                                        for(int k = 0; k < 6; k++){
                                        if(realLottoNumber[6] == lottoNumber[k]){
                                            lottoNumber[j]++;
                                            s = String.valueOf(lottoNumber[j]) + "보너스" ;
                                            secondWin++;
                                            break;
                                        }
                                        else {
                                            thirdWin++;
                                            break;
                                        }
                                    }
                                case 4 :
                                    fourthWin++;
                                    break;
                                case 3 :
                                    fivthWin++;
                                    break;

                            }
                        }
                        lottoNumbersLine += "맞은 갯수 : " + s;
                    }

                }

            }
            lottoNumberLine[i] = lottoNumbersLine;
            lottoNumbersLine ="";

        }
    }

    private void makeRealLotto(String[] splitLottoNumber) {
        for(int i = 0 ; i < 7 ; i++){
            lottoNumber[i] = Integer.parseInt(splitLottoNumber[i]);
            realLottoNumber[i] = lottoNumber[i];
        }
    }

    private void howManyRealLotto(String[] splitLottoNumber){
        for(int i = 0 ; i < 6 ; i++){
            lottoNumber[i] = Integer.parseInt(splitLottoNumber[i]);
        }
        for(int i = 0 ; i < 6 ; i ++){
            for(int j = 0 ; j < 6 ; j ++){
                if(realLottoNumber[i] == lottoNumber[j])
                    realCount++;
            }
        }
        lottoNumber[6] = realCount;
        realCount = 0;
    }
    public void setLottoNumberLine(String[] lottoNumberLine) {
        this.lottoNumberLine = lottoNumberLine;
    }

    public String[] getLottoNumberLine() {
        return lottoNumberLine;
    }

    public int getWinLottoCount() {
        return winLottoCount;
    }

    public int getFirstWin() {
        return firstWin;
    }

    public int getSecondWin() {
        return secondWin;
    }

    public int getThirdWin() {
        return thirdWin;
    }

    public int getFourthWin() {
        return fourthWin;
    }

    public int getFivthWin() {
        return fivthWin;
    }
}
