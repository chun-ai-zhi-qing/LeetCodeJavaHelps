package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class OneStringArrayImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        premeter = premeter.replaceAll("\\[","").replaceAll("]","");
        String[] tmp = premeter.split(",");
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = tmp[i].replaceAll("\"","");
        }
        return tmp;
    }
}
