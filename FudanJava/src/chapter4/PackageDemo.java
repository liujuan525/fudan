package chapter4;

import java.util.*;
import java.sql.*;

public class PackageDemo{
    public static void main(String[] args){
//        Date d = new Date(); // 编译错误
        java.util.Date d = new java.util.Date();
        System.out.println("d = " + d);
    }
}