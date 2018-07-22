package com.example.android.dicodingacademy;

import java.util.ArrayList;

public class AcademyData {
    // tempat menyimpan data
    public static String[][] data = new String[][]{
            {"Kotlin Android Developer Expert",
                    "Stay up-to-date dengan menguasai bahasa Kotlin, bahasa pemrograman resmi Google. Di sini Anda akan belajar mengenai Kotlin di Android.",
                    "https://www.dicoding.com/images/small/academy/kotlin_android_developer_expert_logo_120318174210.png"},
            {"Menjadi Android Developer Expert",
                    "Jadilah expert di dunia pemrograman Android. Materi disusun oleh Dicoding sebagai Google Authorized Training Partner.",
                    "https://www.dicoding.com/images/small/academy/menjadi_android_developer_expert_logo_041217105708.png"},
            {"Menjadi Game Developer Expert",
                    "Pendaftaran Kelas Menjadi Game Developer Expert dibuka selama Ramadhan.",
                    "https://www.dicoding.com/images/small/academy/menjadi_game_developer_expert_logo_041217105559.png"},
            {"Belajar Membuat Aplikasi Android untuk Pemula",
                    "Belajar Gratis Android untuk Pemula dengan Google Authorized Training Partner selama 30 hari!",
                    "https://www.dicoding.com/images/small/academy/belajar_membuat_aplikasi_android_untuk_pemula_logo_041217105725.png"},
            {"Belajar Membuat Aplikasi Kognitif",
                    "Belajar Gratis! Segera daftar dan dapatkan ilmunya.",
                    "https://www.dicoding.com/images/small/academy/belajar_membuat_aplikasi_kognitif_logo_220518155712.png"},
            {"Belajar Membuat Game untuk Pemula",
                    "Belajar Gratis Mengembangkan Game dengan Kurikulum dari Asosiasi Game Indonesia selama 30 Hari!",
                    "https://www.dicoding.com/images/small/academy/belajar_membuat_game_untuk_pemula_logo_080218174335.png"},
            {"Belajar Membangun LINE ChatBot",
                    "Belajar Gratis tentang Chatbot bersama LINE selama 30 hari!",
                    "https://www.dicoding.com/images/small/academy/belajar_membangun_line_chatbot_logo_041217105839.png"}
    };

    public static ArrayList<Academy> getListData(){
        Academy academy = null;
        ArrayList<Academy> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            academy = new Academy();
            academy.setName(data[i][0]);
            academy.setRemarks(data[i][1]);
            academy.setPhoto(data[i][2]);

            list.add(academy);
        }
        return list;
    }
}
