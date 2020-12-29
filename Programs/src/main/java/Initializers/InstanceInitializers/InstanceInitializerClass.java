package Initializers.InstanceInitializers;

class InstanceInitializerClass
{

    {
        System.out.println("Instance Initializer block");
    }

    InstanceInitializerClass()
    {
        System.out.println("Constructor Called");
    }
    public static void main(String[] args)
    {
        InstanceInitializerClass a = new InstanceInitializerClass();
    }
}