package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class OneStringArrayImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        premeter = premeter.replaceAll("\\[","").replaceAll("]","").replace("\"","");
        String[] tmp = premeter.split(",");
        return tmp;
    }
}
