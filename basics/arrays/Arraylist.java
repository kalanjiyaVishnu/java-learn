package basics.arrays;

import java.util.ArrayList;

class namesaylist {
    public static void main(String[] args) {
        // namesayList<String> list = new namesayList<>();
        // list.add("b");
        // list.add("b");
        // list.add("b");
        // System.out.println(list.contains("b"));
        // Iterator<String> itr = list.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        // int name_count = 1;
        // // Set<String> lump = new HashSet<String>();
        // namesayList<String> lump = new namesayList<String>();// Creating namesaylist

        // for (int i = 0; i < n; i++) {
        // if (lump.contains(names[i])) {
        // names[i] += name_count;
        // name_count++;
        // } else {
        // names[i] = "OK";
        // }
        // lump.add(names[i]);
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.println(names[i]);
        // }
        user_nameReg();
    }

    static void user_nameReg() {
        int n = 2, name_count = 1;
        String[] names = { "c", "cn" };
        // ArrayList<String> name = new ArrayList<>();
        Boolean[] is_exists = new Boolean[n];
        for (int i = 0; i < n; i++)
            is_exists[i] = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i] == names[j]) {
                    is_exists[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (is_exists[i]) {
                System.out.println(names[i] + "" + name_count);
                name_count++;
            } else {
                System.out.println("OK");
            }
        }
    }
}