package programmers.lv2.queue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int bridgeWeight = 0;

        for (int truck : truck_weights) {
            while (true) {
                if (bridge.size() == bridge_length) {
                    bridgeWeight -= bridge.poll();
                } else if (bridgeWeight + truck <= weight) {
                    bridge.add(truck);
                    bridgeWeight += truck;
                    time++;
                    break;
                } else {
                    bridge.add(0);
                    time++;
                }
            }
        }

        return time + bridge_length;
    }
}