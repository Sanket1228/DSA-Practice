import java.util.*;

public class Collections {

    public static void arrayList() {
        List<Integer> num  = new ArrayList<>();

        num.add(2);
        num.add(3);
        num.add(4);
        num.add(35);
        num.add(20);

        System.out.println(num);

        // For Each loop
//        for(Integer no: num) {
//            System.out.println(no);
//        }
    }

    public static void stack() {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(32);
        st.push(24);
        st.push(26);
        st.push(27);

        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.pop());
    }

    public static void queue() {
        Queue<Integer> qu = new LinkedList<>();

        qu.offer(2);
        qu.offer(42);
        qu.offer(52);
        qu.offer(62);

        System.out.println(qu);

        System.out.println(qu.peek());

        System.out.println(qu.poll());
    }

    public static void arrayDeque() {
        ArrayDeque<Integer> qu = new ArrayDeque<>();

        qu.offer(2);
        qu.offer(42);
        qu.offer(52);
        qu.offer(62);

        System.out.println(qu);

        System.out.println(qu.peek());

        System.out.println(qu.poll());

        qu.offerFirst(10);

        System.out.println(qu);

        System.out.println(qu.pollLast());
    }

    public static void priorityQueue() {
        // for min heap
//        Queue<Integer> qu = new PriorityQueue<>();

        //for max heap
        Queue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());

        qu.offer(42);
        qu.offer(8);
        qu.offer(62);
        qu.offer(2);

        System.out.println(qu);

        System.out.println(qu.peek());

        System.out.println(qu.poll());
    }

    public static void hashSet() {
        HashSet<Integer> st = new HashSet<>();

        st.add(2);
        st.add(18);
        st.add(90);
        st.add(27);
        st.add(15);
        st.add(2);

        System.out.println(st);

        for (Integer val: st) {
            System.out.print(val + " ");
        }
    }

    public static void treeSet() {
        TreeSet<Integer> st = new TreeSet<>();

        st.add(2);
        st.add(18);
        st.add(90);
        st.add(27);
        st.add(15);
        st.add(2);

        System.out.println(st);

        for (Integer val: st) {
            System.out.print(val + " ");
        }
    }

    public static void hashMap() {
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(1, 10);
        hm.put(2, 48);
        hm.put(3, 3);
        hm.put(4, 10);

        for (Map.Entry<Integer, Integer> val: hm.entrySet())   {
            System.out.println(val);
        }

        for (Integer key: hm.keySet()){
            System.out.print(key + " ");
        }

        System.out.println();

        for (Integer key: hm.values()){
            System.out.print(key + " ");
        }

    }

    public static void treeMap() {
        TreeMap<Integer, Integer> hm = new TreeMap<>();

        hm.put(1, 10);
        hm.put(5, 48);
        hm.put(3, 3);
        hm.put(4, 10);

        for (Map.Entry<Integer, Integer> val: hm.entrySet())   {
            System.out.println(val);
        }

        for (Integer key: hm.keySet()){
            System.out.print(key + " ");
        }

        System.out.println();

        for (Integer key: hm.values()){
            System.out.print(key + " ");
        }

    }

    public static void main(String[] args) {
        treeMap();
    }
}
