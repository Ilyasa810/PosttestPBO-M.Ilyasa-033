# POST TEST 1 PRAKTIKUM PBO

## NAMA: MUHAMMAD ILYASA' 'IZZUDDIN
## NIM: 24091166033

### TEMA: DAFTAR GAME FAVORIT


### Deskripsi Singkat:
Tema ini tentang bagaimana memanajemen sebuah daftar game favorit, mulai dari create, read, update, delete sesuai keinginan kita. kita bisa menambahkan game favorit, menghapus game favorit yang ada di list, memperbarui game favorit, atau bahkan hanya mengecek game favorit yang ada dilist.

### Alur Program Secara singkat:

1. Program dimulai atau di_run_.

2. Setelah dimulai, program akan menampilkan menu utama.

3. User akan diminta untuk memilih menu:

    > Tambah Game → user bisa menuliskan nama game, lalu game masuk ke
    daftar.
    
    > Lihat Daftar Game → menampilkan seluruh daftar game favorit yang sudah disimpan.
    
    > Memperbarui daftar game -> User bisa memperbarui game dari daftar game.

    > Menghapus game dari daftar game -> User bisa menghapus daftar game jika sudah tidak relevan atau sudah tidak menjadi favorit.

### Penjelasan Kode

### 1. Package & Import

<img width="400" height="100" alt="{76234792-85D9-4F82-87FA-0A366CE19382}" src="https://github.com/user-attachments/assets/ddcf31a9-900d-48c1-bde7-214ef6a1bedf" />

Digunakan untuk menentukan lokasi package dan mengimpor library ArrayList serta Scanner.


### 2. Class Main & Method main

<img width="400" height="100" alt="{69A72E8A-D598-4C33-9582-F96EC6EA2544}" src="https://github.com/user-attachments/assets/ca4cbc5b-58d1-464e-9477-9e7f6728b576" />

Kelas utama tempat semua kode program ditulis. main adalah method yang pertama kali dijalankan.


### 3. Deklarasi Struktur Data & Scanner

<img width="300" height="100" alt="{9B619981-6B08-42FA-AE82-592D362AB309}" src="https://github.com/user-attachments/assets/68f277d1-e963-4427-a42e-eb194725f770" />

> daftarGame → untuk menyimpan daftar game favorit.

> Scanner input → membaca input dari keyboard.

> pilihan → menampung pilihan menu user.


### 4. Perulangan Menu Utama

<img width="400" height="100" alt="{8C57185B-C670-4C46-BEAB-1FAD0AAD9E5F}" src="https://github.com/user-attachments/assets/e9cf1f37-63a7-4288-95bf-a48a7ad926ab" />
<img width="400" height="100" alt="{8AC94C19-3A56-4D1E-BE78-5A3319C8A7AA}" src="https://github.com/user-attachments/assets/f2dfda6e-4d60-4700-9411-d89d4eca64ff" />

Perulangan do-while membuat menu terus muncul sampai user memilih keluar (opsi 5).

### 5. Tampilan Menu

<img width="400" height="100" alt="{D64C97C3-86F7-4732-8E0A-9AAAE79DEB03}" src="https://github.com/user-attachments/assets/eef10f44-c7bf-4010-8c0c-496a72c17664" />

Menampilkan daftar menu CRUD yang bisa dipilih oleh user.

### 6. Percabangan Switch-case

<img width="400" height="100" alt="{3C52C467-2B25-4388-8AC4-DD26DA8147EA}" src="https://github.com/user-attachments/assets/2f133f8d-0bb8-426a-9e8a-8310a7e416dc" />

Sampai

<img width="300" height="100" alt="{DCB650DF-DAC2-4E65-9F53-73FB251B90C8}" src="https://github.com/user-attachments/assets/79a1d5af-355f-4382-a389-526dc0925021" />

Menjalankan aksi sesuai angka menu yang dipilih.


### 7. Case 1 – Tambah Game

<img width="300" height="100" alt="{0687C905-8251-46E0-A147-98E2945DAAA9}" src="https://github.com/user-attachments/assets/02f92efd-9efb-42eb-99ec-6491c3d2b82f" />

Menambahkan game baru ke daftar.

### 8. Case 2 - Lihat Game

<img width="300" height="160" alt="{A30DCAE3-9084-4261-A2EE-A851B9F44220}" src="https://github.com/user-attachments/assets/f424bcf9-0f82-41e8-8a6e-4754bce6ad09" />

Menampilkan semua game yang sudah ada, atau pesan jika masih kosong.


### 9. Case 3 - Ubah Game

<img width="300" height="196" alt="{B0143268-F5B3-44EA-84BE-2CB22733C4D5}" src="https://github.com/user-attachments/assets/c5beb6d0-f9e5-4adb-8c3e-c6db5d222e96" />

Mengubah nama game berdasarkan nomor yang dipilih user.


### 10. Case 4 - Hapus Game

<img width="300" height="321" alt="{E312B6FF-3FFE-4B32-B434-7E753DFF6619}" src="https://github.com/user-attachments/assets/ce0f821d-d2a5-4972-bb50-8515f8c5ced4" />

Menghapus game dari daftar sesuai nomor yang dipilih user.


### 11. Case 5 – Keluar Program

<img width="300" height="119" alt="{584580DE-C6EA-45AB-BAC0-E02ED0AB459F}" src="https://github.com/user-attachments/assets/48e4f27f-1f0c-455e-8c11-ce0ba2d8778c" />

Mengakhiri program dan menampilkan pesan perpisahan.

###################################################################
