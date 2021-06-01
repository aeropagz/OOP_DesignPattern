package fhkiel.factory;

import fhkiel.monster.Monster;
import fhkiel.monster.Orc;
import fhkiel.monster.Scavenger;
import fhkiel.monster.Wolf;

public enum MonsterFactory implements Factory{
    Orc(){
        @Override
        public Monster create(){
            return new Orc(300, 100, 25);
        }
    },
    Scavenger(){
        @Override
        public Monster create() {
            return new Scavenger(125, 15, 5);
        }
    },
    Wolf(){
        @Override
        public Monster create() {
            return new Wolf(200, 15, 15);
        }
    };
}
