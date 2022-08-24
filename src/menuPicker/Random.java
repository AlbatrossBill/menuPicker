package menuPicker;

//随机获得数字类，只能用于随机抽取数字
public class Random {
    public int pickANumber() {
        java.util.Random random = new java.util.Random();
        //随机1-10以内
        int num = random.nextInt(1, 10);
        return num;
    }
}
