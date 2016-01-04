/**
 * Created by HSH on 15. 11. 5..
 */
public class Output {


    private String[] lottoNumberLine;
    private int winLottoCount, howManyNumber;
    private int firstWin, secondWin, thirdWin, fourthWin, fivthWin;

    public void setLottoNumberLine(String[] lottoNumberLine) {
        this.lottoNumberLine = lottoNumberLine;
    }

    public void setWinLottoCount(int winLottoCount) {
        this.winLottoCount = winLottoCount;
    }

    public void setHowManyNumber(int howManyNumber) {
        this.howManyNumber = howManyNumber;
    }

    public void setFirstWin(int firstWin) {
        this.firstWin = firstWin;
    }

    public void setSecondWin(int secondWin) {
        this.secondWin = secondWin;
    }

    public void setThirdWin(int thirdWin) {
        this.thirdWin = thirdWin;
    }

    public void setFourthWin(int fourthWin) {
        this.fourthWin = fourthWin;
    }

    public void setFivthWin(int fivthWin) {
        this.fivthWin = fivthWin;
    }

    public void printHowManyNubmer(){
        System.out.println("로또 몇줄을 뽑을까요?");
    }


    public void printLottoNumber() {
        for(int i = 0; i < lottoNumberLine.length ; i++){
            if(i == 0) {
                System.out.println("로또 당첨 번호: "+lottoNumberLine[i]);
            }
            else {
                System.out.println((i)+"번째 로또 : "+lottoNumberLine[i]);
            }
        }
    }

    public void printWinCount(){
        System.out.println("총 로또 갯수 : " + howManyNumber + " 당첨 로또 갯수 : " + winLottoCount);
        System.out.println("1등 : " + firstWin + " 2등 : " + secondWin + " 3등 : " + thirdWin + " 4등 : " + fourthWin + " 5등 : "+ fivthWin);

    }





}
