package com.example.android.dicodingacademy;

import java.util.ArrayList;

public class AcademyData {
    // tempat menyimpan data
    // susunan pengolahan data: Name, Remaks, Photo, ..Detail, Siswa, Bonus, Level, Platform, ImgPenyusun, Penyusun
    public static String[][] data = new String[][]{
            {"Kotlin Android Developer Expert",
                    "Stay up-to-date dengan menguasai bahasa Kotlin, bahasa pemrograman resmi Google. Di sini Anda akan belajar mengenai Kotlin di Android.",
                    "https://www.dicoding.com/images/small/academy/kotlin_android_developer_expert_logo_120318174210.png",
                    "Pada Google I/O 2017, Kotlin diumumkan sebagai bahasa pemrograman yang termasuk dalam bahasa kelas satu (First class) yang didukung untuk pembuatan aplikasi Android, " +
                            "selain Java dan C++. Kotlin adalah bahasa pemrograman yang dibuat dan didukung oleh JetBrains. Google juga akan memastikan bahwa semua fitur baru di Android, " +
                            "framework, IDE dan keseluruhan library, akan dapat bekerja dan terintegrasi baik dengan bahasa pemrograman Kotlin serta interopable dengan fungsi-fungsi Java " +
                            "yang telah ada sehingga memungkinkan para engineer melakukan perubahan bagian tertentu aplikasi dari Java ke Kotlin dan sebaliknya dengan sangat mudah.",
                    "1471 Siswa",
                    "0 Pts & 1100 XP ",
                    "Menengah",
                    "Android",
                    "https://www.dicoding.com/images/small/avatar/6f9b08428cedcc883d002ab170206b66a74cb233.png",
                    "Dicoding Indonesia",
                    "https://www.dicoding.com/academies/55"
            },

            {"Menjadi Android Developer Expert",
                    "Jadilah expert di dunia pemrograman Android. Materi disusun oleh Dicoding sebagai Google Authorized Training Partner.",
                    "https://www.dicoding.com/images/small/academy/menjadi_android_developer_expert_logo_041217105708.png",
                    "Dicoding sebagai satu-satunya Google Authorized Training Partner di Indonesia telah melalui proses penyusunan kurikulum secara komprehensif. Semua modul telah " +
                            "diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini.",
                    "10867 Siswa",
                    "0 Pts & 2200 XP",
                    "Menengah",
                    "Android",
                    "https://www.dicoding.com/images/small/avatar/20170819074458e6aaccbfc652991163363a22b144b09f.jpg",
                    "Google ATP",
                    "https://www.dicoding.com/academies/14"
            },

            {"Belajar Membuat Game dengan Construct 2",
                    "Belajar Gratis! Segera daftar dan dapatkan ilmunya.",
                    "https://www.dicoding.com/images/small/academy/belajar_membuat_game_dengan_construct_2_logo_170718163519.png",
                    "Kelas ini telah didesain khusus untuk game developer pemula. Software yang digunakan dalam kelas ini adalah Construct 2 Free Edition yang dapat diunduh " +
                            "secara bebas atau gratis melalui halaman resmi Construct 2.",
                    "125 Siswa",
                    "0 Pts & 0 XP",
                    "Pemula",
                    "Android, Web, dan Tizen",
                    "https://www.dicoding.com/images/small/avatar/6f9b08428cedcc883d002ab170206b66a74cb233.png",
                    "Dicoding Indonesia",
                    "https://www.dicoding.com/academies/65"
            },

            {"Menjadi Game Developer Expert",
                    "Pendaftaran Kelas Menjadi Game Developer Expert dibuka selama Ramadhan.",
                    "https://www.dicoding.com/images/small/academy/menjadi_game_developer_expert_logo_041217105559.png",
                    "Semua modul dalam kelas ini telah diverifikasi langsung oleh Asosiasi Game Indonesia (AGI) untuk memastikan materi yang diajarkan relevan " +
                            "dan sesuai dengan kebutuhan industri game saat ini.",
                    "1344 Siswa",
                    "0 Pts & 1650 XP",
                    "Menengah",
                    "Apple, Android, dan Desktop",
                    "https://www.dicoding.com/images/small/avatar/2018022820221273f42252259fd5b4e5e58e3ccd0d9631.jpg",
                    "Asosiasi Game Indonesia",
                    "https://www.dicoding.com/academies/47"
            },

            {"Belajar Membuat Aplikasi Android untuk Pemula",
                    "Belajar Gratis Android untuk Pemula dengan Google Authorized Training Partner selama 30 hari!.",
                    "https://www.dicoding.com/images/small/academy/belajar_membuat_aplikasi_android_untuk_pemula_logo_041217105725.png",
                    "Kelas ini didesain oleh Google Authorized Training Partner untuk developer Android di Indonesia. Peserta akan mempelajari materi dasar " +
                            "Android dalam 30 hari dan diarahkan untuk membuat aplikasi sederhana. Terdapat 27 modul yang juga merupakan bagian dari Kelas " +
                            "Menjadi Android Developer Expert.",
                    "22575 Siswa",
                    "0 Pts & 400 XP",
                    "Pemula",
                    "Android",
                    "https://www.dicoding.com/images/small/avatar/20170819074458e6aaccbfc652991163363a22b144b09f.jpg",
                    "Google ATP",
                    "https://www.dicoding.com/academies/51"
            },

            {"Belajar Membuat Aplikasi Kognitif",
                    "Belajar Gratis! Segera daftar dan dapatkan ilmunya.",
                    "https://www.dicoding.com/images/small/academy/belajar_membuat_aplikasi_kognitif_logo_220518155712.png",
                    "Kelas ini didesain untuk developer yang ingin mempelajari aplikasi kognitif dengan menggunakan teknologi IBM Watson. Tool lain yang " +
                            "digunakan adalah CloudFoundry (CF) CLI, Postman, dan Android Studio (opsional).",
                    "637 Siswa",
                    "0 Pts & 0 XP",
                    "Menengah",
                    "Android",
                    "https://www.dicoding.com/images/small/avatar/6f9b08428cedcc883d002ab170206b66a74cb233.png",
                    "Dicoding Indonesia",
                    "https://www.dicoding.com/academies/68"
            },

            {"Belajar Membuat Game untuk Pemula",
                    "Belajar Gratis Mengembangkan Game dengan Kurikulum dari Asosiasi Game Indonesia selama 30 Hari!.",
                    "https://www.dicoding.com/images/small/academy/belajar_membuat_game_untuk_pemula_logo_080218174335.png",
                    "Semua modul dalam kelas ini telah diverifikasi langsung oleh Asosiasi Game Indonesia (AGI) untuk memastikan materi yang diajarkan " +
                            "relevan dan sesuai dengan kebutuhan industri game saat ini. Terdapat 22 modul yang merupakan bagian dari kelas Menjadi Game " +
                            "Developer Expert.",
                    "1663 Siswa",
                    "0 Pts & 400 XP",
                    "Pemula",
                    "Android, dan Desktop",
                    "https://www.dicoding.com/images/small/avatar/2018022820221273f42252259fd5b4e5e58e3ccd0d9631.jpg",
                    "Asosiasi Game Indonesia",
                    "https://www.dicoding.com/academies/58"
            },

            {"Belajar Membangun LINE ChatBot",
                    "Belajar Gratis tentang Chatbot bersama LINE selama 30 hari!.",
                    "https://www.dicoding.com/images/small/academy/belajar_membangun_line_chatbot_logo_041217105839.png",
                    "Kelas ini didesain oleh LINE dan Dicoding untuk membantu developer Indonesia membuat sebuah produk chatbot diatas platform LINE. " +
                            "Peserta kelas memiliki opsi untuk belajar membangun chatbot dengan menggunakan bahasa pemograman Java atau PHP. " +
                            "Pengetahuan yang memadai tentang Java atau PHP akan membantu peserta untuk menyelesaikan kelas ini.",
                    "7377 Siswa",
                    "0 Pts & 400 XP",
                    "Menengah",
                    "Android",
                    "https://www.dicoding.com/images/small/avatar/2018021314200630bb31e0b79197d65c37795eee7a1764.jpg",
                    "Line",
                    "https://www.dicoding.com/academies/32"
            }
    };

    public static ArrayList<Academy> getListData(){
        Academy academy = null;
        ArrayList<Academy> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            academy = new Academy();
            academy.setName(data[i][0]);
            academy.setRemarks(data[i][1]);
            academy.setPhoto(data[i][2]);

            academy.setDetail(data[i][3]);
            academy.setSiswa(data[i][4]);
            academy.setBonus(data[i][5]);
            academy.setLevel(data[i][6]);
            academy.setPlatform(data[i][7]);
            academy.setImgpenyusun(data[i][8]);
            academy.setPenyusun(data[i][9]);
            academy.setLink(data[i][10]);

            list.add(academy);
        }
        return list;
    }
}
