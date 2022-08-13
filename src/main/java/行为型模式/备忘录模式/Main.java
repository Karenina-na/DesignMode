package 行为型模式.备忘录模式;

import 行为型模式.备忘录模式.memory.Memento;

public class Main {
    public static void main(String[] args) {
        CareTaker stateList = new CareTaker();
        Originator state = new Originator();
        state.setState("第一个状态");
        stateList.add(state.saveToMemento());
        state.setState("第二个状态");
        stateList.add(state.saveToMemento());
        state.setState("第三个状态");
        stateList.add(state.saveToMemento());
        for (int i = 0; i < 3;i++) {
            System.out.println(((Memento)stateList.get(i)).getState());
        }
    }
}
