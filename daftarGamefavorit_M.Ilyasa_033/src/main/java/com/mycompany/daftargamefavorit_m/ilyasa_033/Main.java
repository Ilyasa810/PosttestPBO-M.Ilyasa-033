package com.mycompany.daftargamefavorit_m.ilyasa_033;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarGame = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("\n=== Manajemen Daftar Game Favorit ===");
                System.out.println("1. Tambah Game");
                System.out.println("2. Lihat Daftar Game");
                System.out.println("3. Ubah Game");
                System.out.println("4. Hapus Game");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine(); 
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama game baru: ");
                        String gameBaru = input.nextLine();
                        daftarGame.add(gameBaru);
                        System.out.println("Game berhasil ditambahkan!");
                    }
                        
                    case 2 -> {
                        System.out.println("\n=== Daftar Game Favorit ===");
                        if (daftarGame.isEmpty()) {
                            System.out.println("Belum ada game yang ditambahkan.");
                        } else {
                            for (int i = 0; i < daftarGame.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarGame.get(i));
                            }
                        }
                    }
                        
                    case 3 -> {
                        System.out.println("\n=== Ubah Game ===");
                        if (daftarGame.isEmpty()) {
                            System.out.println("Daftar game masih kosong.");
                        } else {
                            for (int i = 0; i < daftarGame.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarGame.get(i));
                            }
                            System.out.print("Pilih nomor game yang ingin diubah: ");
                            int ubahIndex = input.nextInt();
                            input.nextLine();
                            if (ubahIndex > 0 && ubahIndex <= daftarGame.size()) {
                                System.out.print("Masukkan nama game baru: ");
                                String gameUbah = input.nextLine();
                                daftarGame.set(ubahIndex - 1, gameUbah);
                                System.out.println("Game berhasil diubah!");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }
                        
                    case 4 -> {
                        System.out.println("\n=== Hapus Game ===");
                        if (daftarGame.isEmpty()) {
                            System.out.println("Daftar game masih kosong.");
                        } else {
                            for (int i = 0; i < daftarGame.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarGame.get(i));
                            }
                            System.out.print("Pilih nomor game yang ingin dihapus: ");
                            int hapusIndex = input.nextInt();
                            input.nextLine();
                            if (hapusIndex > 0 && hapusIndex <= daftarGame.size()) {
                                daftarGame.remove(hapusIndex - 1);
                                System.out.println("Game berhasil dihapus!");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }
                        
                    case 5 -> System.out.println("Terima kasih! Program selesai.");
                        
                    default -> System.out.println("Pilihan tidak valid, coba lagi.");
                }
            } while (pilihan != 5);
        }  
    }
}
