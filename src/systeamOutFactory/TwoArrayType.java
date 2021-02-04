package systeamOutFactory;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;


public class TwoArrayType implements ISystemOutAns {
    @Override
    public void SystemOutAns(Method method, Object[] premeters, Object object) throws Exception {
        Object tmp = method.invoke(object , premeters);
        for (int i = 0; i < Array.getLength(tmp); i++) {
            for (int j = 0; j < Array.getLength(Array.get(tmp,i)); j++) {
                System.out.print(Array.get(Array.get(tmp, i), j) + "\t");
            }
            System.out.println();
        }
    }
}
