public class Main {

    private Input input;
    private Output output;
    private Lotto lotto;
    private Calc calc;
    private Check check;

    Main(){
        input = new Input();
        output = new Output();
        lotto = new Lotto();
        calc = new Calc();
        check = new Check();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    public void control(){
        output.printHowManyNubmer();
        input.inputNumber();

        calc.setHowManyNumber(input.getHowManyNumber());
        calc.setLottoNumber(lotto.getLottoNumber());
        calc.calculator();
        check.setLottoNumberLine(calc.getLottoNumberLine());
        check.splitLottoNumberLine();

        output.setHowManyNumber(input.getHowManyNumber());
        output.setWinLottoCount(check.getWinLottoCount());
        output.setFirstWin(check.getFirstWin());
        output.setSecondWin(check.getSecondWin());
        output.setThirdWin(check.getThirdWin());
        output.setFourthWin(check.getFourthWin());
        output.setFivthWin(check.getFivthWin());

        output.setLottoNumberLine(check.getLottoNumberLine());
        output.printLottoNumber();
        output.printWinCount();
    }



}
