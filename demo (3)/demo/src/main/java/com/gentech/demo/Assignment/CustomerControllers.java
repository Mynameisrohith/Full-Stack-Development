package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerControllers {

    @GetMapping("/getcustomerdetails2")
    public List<customers> getcustomers(@RequestParam String id) {
        List<customers> list = new ArrayList<>();
        list.add(new customers(1, "rohith", "engineer", 60000));
        list.add(new customers(2, "bharath", "programmer", 70000));
        return list;
    }

    @GetMapping("/getmatrixmultiplication")
    public Integer[][] multiplicationofmatrix() {
        Integer[][] arr1 = new Integer[][]{{1, 2}, {3, 4}, {5, 6}};
        Integer[][] arr2 = new Integer[][]{{1, 2, 3}, {3, 4, 5}};
        Integer[][] sum = new Integer[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                sum[i][j] = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return sum;
    }
    @GetMapping("/getmatrixaddition")
    public Integer[][] additionofmatrix() {
        Integer[][] arr1 = new Integer[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        Integer[][] arr2 = new Integer[][]{{1, 2}, {3, 4}, {7, 8}, {9, 10}};
        Integer[][] sum = new Integer[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }
    @GetMapping("/getmatrixsubtraction")
    public Integer[][] subtractionofmatrix() {
        Integer[][] arr1 = new Integer[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        Integer[][] arr2 = new Integer[][]{{1, 2}, {3, 4}, {7, 8}, {9, 10}};
        Integer[][] sum = new Integer[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return sum;

    }

    @GetMapping("/getmatrixtranspose")
    public Integer[][] transposeofmatrix() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        Integer[][] transpose = new Integer[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    @GetMapping("/getprimenumbers")
    public ArrayList getprimenumbers() {
        ArrayList a = new ArrayList();
        Integer[] transpose = new Integer[100];
        Integer num = 100;
        for (int i = 2; i <= num; i++) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                a.add(i);
            }
        }
        return a;
    }
}
