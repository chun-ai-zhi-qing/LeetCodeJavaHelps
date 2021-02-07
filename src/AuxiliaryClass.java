import changeTypeFactory.IChangeType;
import changeTypeFactory.ChangeTypeFactory;
import systeamOutFactory.ISystemOutAns;
import systeamOutFactory.SysteamOutFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AuxiliaryClass {
    private String[] readFile() throws Exception {
        File file = new File("Premeter.txt");
        InputStream inputStream = new FileInputStream(file);
        Long fileLength = file.length();
        byte[] tmp = new byte[fileLength.intValue()];
        inputStream.read(tmp);
        String string = new String(tmp);
        String[] buffArray = string.split("\r\n");
        return buffArray;

    }

    private Method getSolustionMethod() {
        Class clazz = Solution.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getModifiers() == Modifier.PUBLIC) {
                return methods[i];
            }
        }
        return null;
    }


    public void run() throws Exception {
        String[] premeter = readFile();
        Method method = getSolustionMethod();
        Class[] parameterTypes = method.getParameterTypes();
//        Object[] objects = new Object[premeter.length];
        for (int i = 0; i < premeter.length / parameterTypes.length; i++) {
            Object[] premeters = new Object[parameterTypes.length];
            for (int j = 0; j < parameterTypes.length; j++) {
                premeters[j] = ChangeType(premeter[i * parameterTypes.length + j],parameterTypes[j]);
            }
            SysteamOutAns(method,premeters);
        }
    }
    public void SysteamOutAns(Method method,Object[] premeters) throws Exception {
        ISystemOutAns ans = SysteamOutFactory.getISyteamOutAns(method.getReturnType().getTypeName());
        ans.SystemOutAns(method,premeters,new Solution());
    }

    public Object ChangeType(String premeter, Class type) throws Exception {
        IChangeType changeType = ChangeTypeFactory.getChangeTypeImlp(type);
        Object object = changeType.ChangeType(premeter);
        return object;
    }
}
