package org.caoym.jjvm;

import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by caoyangmin on 2017/9/7.
 */
public class JJvm {
    /**
     *args ${rootPath}/jjvm/target/classes/ HelloWorld
     * @param args
     */
    static public void main(String[] args){
        if(args.length <2 ){
            System.out.println("Usage: <classpath> <JJvm class> [args...]");
            return;
        }
        VirtualMachine vm = new VirtualMachine(Paths.get(args[0]), args[1]);
        try {
            args = Arrays.copyOfRange(args, 2, args.length);
            vm.run(new String[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
