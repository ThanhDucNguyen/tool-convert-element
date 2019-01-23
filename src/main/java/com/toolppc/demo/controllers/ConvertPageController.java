package com.toolppc.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertPageController {
    public class Main {
        public  void main(String args[]) {
            String str = "this is Java";
            System.out.println(removeCharAt(str, 3));
        }
        public  String removeCharAt(String s, int pos) {
            return s.substring(0, pos) + s.substring(pos + 1);
        }
    }


//    public static void main(String[] args) {
//        // Ví dụ phương thức substring() trong Java
//        String kenhLapTrinh = "kenhlaptrinh.net";
//        int index = 4;
//        System.out.println(kenhLapTrinh.substring(index));
//    }

    //
    public static void main(String[] args) {
        // Ví dụ phương thức substring() trong Java
        String kenhLapTrinh = "kenhlaptrinh.net";
        int batDau = 4;
        int ketThuc = 7;
        String chuoi1 = kenhLapTrinh.substring(batDau); // xoa 4 ky tu dau
        String reverse = new StringBuffer(chuoi1).reverse().toString(); //Dao nguoc chuoi1
        String chuoi = reverse.substring(ketThuc); // Sao khi dao chuoi, xoa 7 ky tu dau
        String kq = new StringBuffer(chuoi).reverse().toString(); //Dao nguoc chuoi
        System.out.println(kq);
    }
    public class StringReverseExample{
        public  void main(String[] args){
            String string="abcdef";
            String reverse = new StringBuffer(string).reverse().toString();
            System.out.println("String before reverse: "+string);
            System.out.println("String after reverse: "+reverse);
        }
    }

}
