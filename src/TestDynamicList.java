public class TestDynamicList {
    public static void main(String[] args) {
        DynamicList<Integer> list = new DynamicList<>();

        list.add(5);
        list.add(7);
        list.add(1, 500);
        list.add(0, 20);

        for (int x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------------------------------");

        System.out.println(list);
        System.out.println(list.contains(7));
        System.out.println(list.contains(999));
    }
}