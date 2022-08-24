package menuPicker;

//豆制品及炒菜
public class pickFoodTypeTwo {
    String f1 = "花菜";
    String f2 = "玉米";
    String f3 = "豆角";
    String f4 = "香干";
    String f5 = "麻婆豆腐";
    String f6 = "青椒炒鸡蛋";
    String f7 = "臭豆腐";
    String f8 = "胡萝卜炒鸡蛋";
    String f9 = "";
    String f10 = "";

    public pickFoodTypeTwo() {
        Random random = new Random();
        int num = random.pickANumber();
        //有几个菜就写大于几，如果有6个菜就是 num > 6
        if (num > 8) {
            new pickFoodTypeTwo();
        } else {
            //System.out.println(num);
            System.out.print("菜品二类（豆制品及炒菜）:");
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

