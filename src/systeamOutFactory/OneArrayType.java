package systeamOutFactory;

import java.lang.reflect.Array;
import java.lang.reflect.Method;


public class OneArrayType implements ISystemOutAns {
    @Override
    public void SystemOutAns(Method method, Object[] premeters, Object object) throws Exception {
        Object tmp = method.invoke(object , premeters);
        for (int i = 0; i < Array.getLength(tmp); i++) {
            System.out.print(Array.get(tmp, i) + "\t");
        }
        System.out.println();
    }
}
