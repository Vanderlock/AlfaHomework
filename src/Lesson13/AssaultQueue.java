package Lesson13;

import java.util.LinkedList;

public class AssaultQueue {
    private LinkedList<String> queue;


    public AssaultQueue() {
        this.queue = new LinkedList<>();
    }


    public void addRecruit(String name) {
        queue.addLast(name);
        System.out.println("Штурмовик '" + name + "' добавлен в конец очереди");
    }


    public String retreatCoward() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста! Некого удалять.");
            return null;
        }
        String removed = queue.removeFirst();
        System.out.println("Штурмовик '" + removed + "' покинул очередь (сбежал трус!)");
        return removed;
    }


    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            System.out.println("Текущая очередь (" + queue.size() + " чел.):");
            for (int i = 0; i < queue.size(); i++) {
                System.out.println("  Позиция " + (i + 1) + ": " + queue.get(i));
            }
        }
    }


    @Override
    public String toString() {
        if (queue.isEmpty()) {
            return "AssaultQueue{queue=[] (пусто)}";
        }
        return "AssaultQueue{queue=" + queue + ", size=" + queue.size() + "}";
    }
}