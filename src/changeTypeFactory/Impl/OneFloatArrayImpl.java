package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

import java.util.ArrayList;

public class OneFloatArrayImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        ArrayList<Float> arrayList = new ArrayList<>();
        premeter = premeter.replaceAll("\\[", "");
        premeter = premeter.replaceAll("]", "");
        String[] tmp = premeter.split(",");
        for (int i = 0; i < tmp.length; i++) {
            arrayList.add(new Float(Float.valueOf(tmp[i])));
        }
        float[] arr = new float[arrayList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }

}
