package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

import java.util.ArrayList;

public class TwoCharArrayImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        premeter = premeter.substring(1, premeter.length() - 1);
        String[] row = premeter.split("],");
        for (int i = 0; i < row.length; i++) {
            row[i] = row[i].replaceAll("\\[","").replaceAll("]","").replaceAll("\"","");
        }
        ArrayList<ArrayList<Character>> arrayList = new ArrayList<>();
        for (int i = 0; i < row.length; i++) {
            String[] tmp = row[i].split(",");
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < tmp.length; j++) {
                list.add(tmp[j].charAt(0));
            }
            arrayList.add(list);
        }
        char[][] res = new char[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i++) {
            char[] tmp = new char[arrayList.get(i).size()];
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                tmp[j] = arrayList.get(i).get(j);
            }
            res[i] = tmp;
        }
        return res;
    }
}
