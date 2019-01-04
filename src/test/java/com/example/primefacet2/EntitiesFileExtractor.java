package com.example.primefacet2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EntitiesFileExtractor {

    public static void main(String[] args) throws IOException {
        getSql("skill","name","/Users/ioc/Downloads/skills.txt");
    }

    public static String readText(String path) throws IOException {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        return new String(data, "UTF-8");

    }

    public static String getSql(String tableName,String rowName,String path) throws IOException {
        System.out.println("running");

        String data=readText(path);
        data.split("\n");
        Set<String> unique=new HashSet(Arrays.asList(data.split("\n")));
        List<String> sqlData =unique.stream()
                        .map(s->"('" +s.toUpperCase()+"')").collect(Collectors.toList());
        String sql="INSERT INTO "+tableName+"("+rowName+") VALUES "+String.join(",",sqlData);
        System.out.println(sql);
        return sql;
    }

}
