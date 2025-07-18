public class Goblin extends Monster{
    public Goblin(String name,char suffix,int hp) {
        super("ゴブリン",'A',50);
    }
    public void attack(Creature target) {
        System.out.println("ゴブリン" + suffix + "はナイフで切りつけた" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
}
