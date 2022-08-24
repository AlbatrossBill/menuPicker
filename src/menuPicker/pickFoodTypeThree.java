package menuPicker;

public class pickFoodTypeThree {
    String f1 = "上海青";
    String f2 = "粉丝";
    String f3 = "空心菜";
    String f4 = "生菜";
    String f5 = "包菜";
    String f6 = "毛豆";
    String f7 = "拍黄瓜";
    String f8 = "";
    String f9 = "";
    String f10 = "";

    public pickFoodTypeThree() {
        Random random = new Random();
        int num = random.pickANumber();
        //有几个菜就写大于几，如果有6个菜就是 num > 6
        if (num > 7) {
            new pickFoodTypeThree();
        } else {
            //System.out.println(num);
            System.out.print("菜品三类（青菜及凉菜）:");
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
