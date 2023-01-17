public class Test {

    public int nTest;

    public int[] arrTest;

    public int sumTest;

    public Test(int nTest, int[] arrTest, int sumTest) {
        this.nTest = nTest;
        this.arrTest = arrTest;
        this.sumTest = sumTest;
    }

    public void isCor(){
        if(Main.solution(nTest, arrTest) == sumTest){
            System.out.println("Верно");
        } else{
            System.out.println("Неверно");
        }
    }
}
