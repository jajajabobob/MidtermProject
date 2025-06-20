public class GameMaster {
    public static void main(String[] args) {
        Hero abel = new Hero("アベル", 100, "銅の剣");
        Slime slimeA = new Slime("スライムA", 30);

        System.out.println("冒険が始まる…！");
        System.out.println("アベル：HP " + abel.hp);
        System.out.println("スライムA：HP " + slimeA.hp);

        System.out.println();
        System.out.println("戦闘開始！");
        abel.attack(slimeA);
        System.out.println("スライムA：HP " + slimeA.hp);

        slimeA.attack(abel);
        System.out.println("アベル：HP " + abel.hp);

        abel.heal();
        System.out.println("アベル：HP " + abel.hp);

        abel.attack(slimeA);
        abel.attack(slimeA);
        abel.attack(slimeA);

        System.out.println("---- 戦闘終了 ----");
        System.out.println("最終ステータス：");
        System.out.println("アベル：HP " + abel.hp);
        System.out.println("スライムA：HP " + slimeA.hp);
        System.out.println("アベルは生きている： " + abel.isAlive());
        System.out.println("スライムAは生きている： " + slimeA.isAlive());

        System.out.println("---- 参照の確認 ----");
        Character partyMember = abel;
        partyMember.hp -= 50;
        System.out.println("partyMember経由でHPを減らした後：");
        System.out.println("アベル：HP " + abel.hp);
    }
}
