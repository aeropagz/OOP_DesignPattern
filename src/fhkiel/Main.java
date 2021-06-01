package fhkiel;

import fhkiel.factory.MonsterFactory;
import fhkiel.monster.Monster;

public class Main {
    public static void main(String[] args){
        Monster[] monsters = new Monster[9];

        monsters[0] = MonsterFactory.Orc.create();
        monsters[1] = MonsterFactory.Orc.create();
        monsters[2] = MonsterFactory.Orc.create();

        monsters[3] = MonsterFactory.Scavenger.create();
        monsters[4] = MonsterFactory.Scavenger.create();
        monsters[5] = MonsterFactory.Scavenger.create();

        monsters[6] = MonsterFactory.Wolf.create();
        monsters[7] = MonsterFactory.Wolf.create();
        monsters[8] = MonsterFactory.Wolf.create();
    }

}
