import java.util.ArrayList;
import java.util.List;

public class GameMaster {
    public static void main(String[] args) {
        List<Character> party = new ArrayList<Character>();

        Hero hero=new Hero("勇者",100,"剣");
        Wizard wizard=new Wizard("魔法使い",60,20);
        Thief thief = new Thief("盗賊",70);

        party.add(hero);
        party.add(wizard);
        party.add(thief);

        ArrayList<Monster> monsters = new ArrayList<>();

        Matango matango = new Matango('A',45);
        Goblin goblin= new Goblin('A',50);
        Slime slime = new Slime('A',40);

        monsters.add(matango);
        monsters.add(goblin);
        monsters.add(slime);

        System.out.println("---味方パーティ---");
        for(Character p :party){
            p.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster m :monsters){
            m.showStatus();
        }
    }
}
