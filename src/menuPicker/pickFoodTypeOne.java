package menuPicker;

//荤菜
public class pickFoodTypeOne {
    String f1 = "圆子";
    String f2 = "千张卷";
    String f3 = "红烧鸡翅";
    String f4 = "豆豉排骨";
    String f5 = "多宝鱼";
    String f6 = "青椒牛肉";
    String f7 = "扇贝";
    String f8 = "鹌鹑蛋烧肉";
    String f9 = "";
    String f10 = "";

    public pickFoodTypeOne() {
        Random random = new Random();
        int num = random.pickANumber();
        //有几个菜就写大于几，如果有6个菜就是 num > 6
        if (num > 8) {
            new pickFoodTypeOne();
        } else {
            //System.out.println(num);
            System.out.print("菜品一类（荤菜）:");
            switch (num) {
                case 1:
                    print(f1);
                    break;
                case 2:
                    print(f2);
                    break;
                case 3:
                    print(f3);
                    break;
                case 4:
                    print(f4);
                    break;
                case 5:
                    print(f5);
                    break;
                case 6:
                    print(f6);
                    break;
                case 7:
                    print(f7);
                    break;
                case 8:
                    print(f8);
                    break;
                case 9:
                    print(f9);
                    break;
                case 10:
                    print(f10);
                    break;
            }
        }
    }

    private void print(String f) {
        System.out.println(f);
    }
}
