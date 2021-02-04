package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

import java.util.ArrayList;

public class OneDoubleArrayImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        ArrayList<Double> arrayList = new ArrayList<>();
        premeter = premeter.replaceAll("\\[", "");
        premeter = premeter.replaceAll("]", "");
        String[] tmp = premeter.split(",");
        for (int i = 0; i < tmp.length; i++) {
            arrayList.add(new Double(Float.valueOf(tmp[i])));
        }
        double[] arr = new double[arrayList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }

}
