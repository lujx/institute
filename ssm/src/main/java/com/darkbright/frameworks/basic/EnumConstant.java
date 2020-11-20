package com.darkbright.frameworks.basic;

/**
 * 枚举类是枚举常量类的代码封装简化.
 *
 * @author bright
 * @date 2018/6/4 23:29
 */
public enum EnumConstant {
    
/*
    常量：
    public class Constant{
        public static final String CONST_ONE = "bb";
        public static final String CONST_TWO = "cc";
    }
    1、常量作为参数时，是String，int等弱类型，开发人员可以传入没有在常量接口里定义的值，这个问题无法通过编译器发现。
    2、由于开发人员可以直接写常量，所以不能用==对比，只能用equals对比，不能优化性能。
    3、开发人员没有参考资料时，不可能知道某个int类型的参数到底应该赋什么内容。
    4、编译时，是直接把常量的值编译到类的二进制代码里，常量的值在升级中变化后，需要重新编译引用常量的类，因为里面存的是旧值。
    5、如果常量类的构造器不私有，无法限制开发员继承/实现接口，开发员能够在子接口里继续添加常量.而这些常量可能得不到祖先层的支持。
*/

/*
    枚举常量类
    public class Constant{
        private String name;
    
        private Constant(){
            this.name = name;
        }
    
        public static final Constant CONST_ONE = new Constant("bb");
        public static final Constant CONST_TWO = new Constant("cc");
    }
    
    1、私有构造函数，避免被继承和扩展。
    2、定义方法的参数时，必须用枚举常量类类型，如上面的Constant,这样就转变成了强类型，不会出现弱类型引用的问题。
    3、常量值地址唯一，可以用==直接对比，性能会有提高。
    4、编译时，没有把常量值编译到代码里，即使常量的值发生变化，也不会影响引用常量的类。
*/
    
    ONE(1), TWO(2), THREE(3);
    
    private int num;
    
    EnumConstant(int num) {
        this.num = num;
    }
    
    public int getValue() {
        return num;
    }
    
}
