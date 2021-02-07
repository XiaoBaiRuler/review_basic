import sun.net.www.content.text.Generic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author xiaobai
 * @Date 2020/12/29 17:20
 * @Version 1.0
 */
class AnalysisReflect {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee xb = new Employee("xiaobai", 8000);
//        Class cl = xb.getClass();
//        // 反射机制的默认行为受限于Java的访问机制
//        Field f = cl.getDeclaredField("name");
//        // 可以覆盖访问控制
//        f.setAccessible(true);
//        System.out.println(f);
//
//        Field fd = cl.getDeclaredField("number");
//        fd.setAccessible(true);
//        fd.set(xb, 9000);
//        Integer number = (Integer) fd.get(xb);
//        System.out.println(number);
//
//        Object v = f.get(xb);
//        System.out.println(v);

        System.out.println(toString(xb));
    }
    public static String toString(Object obj) throws IllegalAccessException {
        Class cl = obj.getClass();
        String r = cl.getName();
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            for (Field f : fields){
                f.setAccessible(true);
                System.out.println(f.get(obj));
                if (!Modifier.isStatic(f.getModifiers())){

                }
//                if (!Modifier.isStatic(f.getModifiers())){
//                    if (!r.endsWith("[")){
//                        r += ",";
//                    }
//                    r += f.getName() + "=";
//                    try {
//                        Object val = f.get(obj);
//                        r += toString(val);
//                    }
//                    catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//                r += "]";
//                cl = cl.getSuperclass();
            }
            return "?";
        }while (cl != null);
//        return r;
    }
}
