public class Main
{
    public static void main(String[] args) throws EXecutionException,InterruptedException {

        //First create an obj of SingletonCollable class.
        SingletonCollable singletonCollable=new SingletonCollable();
        SingletonCollable singletonCollable1=new SingletonCollable();
        //since we want to submit two task so create 2 obj.

//        Thread t1=new Thread(singletonCollable);
//        Thread t1=new Thread(singletonCollable);

        ExecutorService executorService=Executors.newCacheThreadPool();
        Future<DatabaseConnection> dbc=executorService.submit(singletonCollable);
        Future<DatabaseConnection> dbc2=executorService.submit(singletonCollable1);

        System.out.println(dbc.get());
        System.out.println(dbc2.get());

        //We are trying to create object of singleton from 2 different threads using ExecutorService
        //in ExecutorService we are submitting 2 tasks
    }
}
