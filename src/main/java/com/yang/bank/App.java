package com.yang.bank;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Account zhang=null;
        System.out.println("1.创建用户\n2.查询余额\n3.存款\n4.取款\n");
        Scanner sc = new Scanner(System.in);
        while (true){
            int choose=sc.nextInt();
            switch (choose){
                case 1:{
                    zhang=new Account();
                    break;
                }
                case 2:{
                    System.out.println((zhang != null ? "当前余额为："+ zhang.getBanlance() : "你还未创建用户"));
                    break;
                }
                case 3:{
                    System.out.print("请输入存款金额：");
                    if (zhang == null) throw new AssertionError();
                    zhang.deposit(sc.nextDouble());
                    System.out.println("存款成功，现在您的余额为："+zhang.getBanlance());
                    break;
                }
                case 4:{
                    if (zhang == null) {
                        System.out.println("您还未创建用户");
                        break;
                    }
                    System.out.print("请输入取款金额：");
                    if (zhang.withdraw(sc.nextDouble())){
                        System.out.println("取款成功，现在您的余额为："+zhang.getBanlance());
                    }else{
                        System.out.println("取款失败，你的余额不足");
                    }
                    break;
                }default:{
                    System.out.println("1.创建用户\n2.查询余额\n3.存款\n4.取款\n");
                    break;
                }
            }
        }
    }
}
