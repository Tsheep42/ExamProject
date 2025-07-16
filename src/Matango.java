public class Matango extends Monster {
    public Matango(char suffix,int hp) {
        super('A',45);
    }
    public void attack(Creature target) {
        System.out.println("お化けキノコ" + suffix + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp() - 6);
    }
}
