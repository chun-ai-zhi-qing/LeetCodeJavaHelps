package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

import java.util.ArrayList;

public class TwoIntegerArrayImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        String[] premeterArr = premeter.substring(1,premeter.length() - 1).split("],");
        for (int i = 0; i < premeterArr.length; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            String[] tmp = premeterArr[i].split(",");
            for (int j = 0; j < tmp.length; j++) {
                tmp[j] = tmp[j].replaceAll("\\[","").replaceAll("]","");
                arr.add(Integer.valueOf(tmp[j]));
            }
            arrayList.add(arr);
        }

        int[][] object = new int[arrayList.size()][];
        for (int i = 0; i < object.length; i++) {
            int[] arr = new int[arrayList.get(i).size()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = arrayList.get(i).get(j);
            }
            object[i] = arr;
        }
        return object;
    }
}
