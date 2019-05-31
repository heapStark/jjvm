import com.sun.tools.classfile.ClassFile;
import com.sun.tools.classfile.Method;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者: yanlang.wzl 时间: 2019/5/31 工程: jjvm
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("/Users/tom_wzl/gitHub/jjvm/target/classes/HelloWorld.class");
        ClassFile classFile = ClassFile.read(path);
         Map<Map.Entry<String, String>, Method> methods = new HashMap<>();
        for (Method method : classFile.methods) {
            String name = method.getName(classFile.constant_pool);
            String desc = method.descriptor.getValue(classFile.constant_pool);
            methods.put(new AbstractMap.SimpleEntry<>(name, desc), method);

        }
        System.out.println(methods);
    }
}
