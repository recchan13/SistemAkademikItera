-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Bulan Mei 2019 pada 08.38
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistem_peminjaman`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(191) NOT NULL,
  `password` varchar(191) NOT NULL,
  `tempat_peminjaman_id` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `tempat_peminjaman_id`) VALUES
(1, 'admin1', '0001', 1),
(2, 'admin2', '0002', 2),
(3, 'admin3', '0003', 3),
(4, 'admin4', '0004', 4);

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id` int(25) NOT NULL,
  `nama` varchar(191) NOT NULL,
  `jumlah_stok` int(25) NOT NULL DEFAULT '1',
  `ketersediaan` tinyint(1) NOT NULL DEFAULT '1',
  `id_tempat_pinjam` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id`, `nama`, `jumlah_stok`, `ketersediaan`, `id_tempat_pinjam`) VALUES
(1, 'proyektor', 50, 1, 1),
(2, 'converter', 25, 1, 1),
(3, 'kabel terminal', 100, 1, 1),
(4, 'spidol hitam', 100, 1, 1),
(5, 'spidol biru', 60, 1, 1),
(6, 'spidol merah', 67, 1, 1),
(7, 'spidol hijau', 76, 1, 1),
(8, 'penghapus papantulis', 75, 1, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` bigint(25) NOT NULL,
  `nama` varchar(191) NOT NULL,
  `prodi` varchar(191) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nama`, `prodi`) VALUES
(14115002, 'Irvan Suryadi', 'Teknik Informatika'),
(14115009, 'Imam Mukhti ', 'Teknik Informatika'),
(14115014, 'Muhammad Iqbal', 'Teknik Informatika'),
(14115017, 'Rahmat Fitriadi', 'Teknik Informatika'),
(14115042, 'Rizki Muhammad Farhan', 'Teknik Informatika'),
(14115046, 'Mutiara Ruci', 'Teknik Informatika'),
(14115055, 'Dedi Munandar', 'Teknik Informatika'),
(14115061, 'Benyamin Tupang', 'Teknik Informatika'),
(14115062, 'Ari Bambang Kurniawan', 'Teknik Informatika'),
(14115063, 'Muhammad Surya', 'Teknik Informatika'),
(14116005, 'Dicky Hermawan', 'Teknik Informatika'),
(14116008, 'Reki Selianta', 'Teknik Informatika'),
(14116020, 'Febri Dwi Putro', 'Teknik Informatika'),
(14116026, 'Putra Kurniawan', 'Teknik Informatika'),
(14116028, 'Adimas Sutanto', 'Teknik Informatika'),
(14116032, 'Faizal Alif', 'Teknik Informatika'),
(14116033, 'Arif Wicaksono', 'Teknik Informatika'),
(14116034, 'Leslie Anggraini', 'Teknik Informatika'),
(14116048, 'Hendy Prasetya', 'Teknik Informatika'),
(14116055, 'Gilang Ramadhan', 'Teknik Informatika'),
(14116056, 'Dewi Rahayu', 'Teknik Informatika'),
(14116060, 'Venika Purba', 'Teknik Informatika'),
(14116070, 'Shella Intia', 'Teknik Informatika'),
(14116081, 'Ravi Prayoga', 'Teknik Informatika'),
(14116098, 'Yulianto Pambudi', 'Teknik Informatika'),
(14116103, 'Vallen Refkiyawan', 'Teknik Informatika'),
(14116119, 'Heru Setiawan', 'Teknik Informatika'),
(14116121, 'Adi Ramadhan', 'Teknik Informatika'),
(14116147, 'Muhammad Farhan', 'Teknik Informatika'),
(14116162, 'Muhammad Taufiq Hidayat', 'Teknik Informatika'),
(14116165, 'Muhammad Julian', 'Teknik Informatika'),
(14117001, 'Tasya Karinda', 'Teknik Informatika'),
(14117005, 'Latisya', 'Teknik Informatika'),
(14117024, 'Rika Laila', 'Teknik Informatika'),
(14117031, 'Safran Ilmi', 'Teknik Informatika'),
(14117032, 'Mia Audina', 'Teknik Informatika'),
(14117035, 'Yudi Gunawan', 'Teknik Informatika'),
(14117039, 'Liga Septian', 'Teknik Informatika'),
(14117041, 'Maria Andini', 'Teknik Informatika'),
(14117043, 'Nuranisda Triawati', 'Teknik Informatika'),
(14117046, 'Annisa Maharani', 'Teknik Informatika'),
(14117051, 'Achmad Syafriyal', 'Teknik Informatika'),
(14117053, 'Hendri Triputra', 'Teknik Informatika'),
(14117062, 'Reza Octaviany', 'Teknik Informatika'),
(14117063, 'Raras Franita', 'Teknik Informatika'),
(14117070, 'Erawati', 'Teknik Informatika'),
(14117071, 'Nurul Fauziah Azizah', 'Teknik Informatika'),
(14117072, 'Felia Azahra', 'Teknik Informatika'),
(14117078, 'Genta Ari Anggoro', 'Teknik Informatika'),
(14117081, 'Humairoh', 'Teknik Informatika'),
(14117085, 'Nurma Yunita Sari', 'Teknik Informatika'),
(14117088, 'Nur Anggraheni', 'Teknik Informatika'),
(14117092, 'Yosi Mardianti', 'Teknik Informatika'),
(14117093, 'Ismail Al Faruqi', 'Teknik Informatika'),
(14117094, 'Eron Wahyu', 'Teknik Informatika'),
(14117095, 'Alya Khairunnisa Rizkita', 'Teknik Informatika'),
(14117098, 'Riwandy', 'Teknik Informatika'),
(14117109, 'Steven Hermadoni', 'Teknik Informatika'),
(14117110, 'Ayu Sri Rezeki', 'Teknik Informatika'),
(14117113, 'Annisa Ayu Sabrina', 'Teknik Informatika'),
(118140001, 'Satrio Kunto Birowo', 'Teknik Informatika'),
(118140002, 'Citra Amelia', 'Teknik Informatika'),
(118140005, 'M. Fazar Zuhdi', 'Teknik Informatika'),
(118140007, 'Lukas Sandy', 'Teknik Informatika'),
(118140009, 'Faizal Ahmad', 'Teknik Informatika'),
(118140013, 'Annisa Oktarina', 'Teknik Informatika'),
(118140018, 'Mohamad Aditia', 'Teknik Informatika'),
(118140028, 'Aminudin Fadila', 'Teknik Informatika'),
(118140033, 'Destiana Wahyuni', 'Teknik Informatika'),
(118140034, 'Rexi Laroibafih', 'Teknik Informatika'),
(118140038, 'Putri Fatihah H', 'Teknik Informatika'),
(118140039, 'Bima Pangestu', 'Teknik Informatika'),
(118140040, 'Adelia Yasmin', 'Teknik Informatika'),
(118140044, 'Yuni Nurdiyanti', 'Teknik Informatika'),
(118140048, 'Kharisma Anjina', 'Teknik Informatika'),
(118140053, 'Supriatna', 'Teknik Informatika'),
(118140055, 'Fikri Halim Ch', 'Teknik Informatika'),
(118140058, 'Andika Saputra', 'Teknik Informatika'),
(118140060, 'Adrian Yudi Tama', 'Teknik Informatika'),
(118140061, 'Vina Oktariana', 'Teknik Informatika'),
(118140063, 'Rasyidah Herawati', 'Teknik Informatika'),
(118140069, 'Tamara Damayanti', 'Teknik Informatika'),
(118140072, 'Fitri Aisyah', 'Teknik Informatika'),
(118140078, 'Dandi Yudistira', 'Teknik Informatika'),
(118140080, 'Daniel Sipangkar', 'Teknik Informatika'),
(118140081, 'Ilman Abdillah', 'Teknik Informatika'),
(118140086, 'Ester Efritira', 'Teknik Informatika'),
(118140101, 'Rahmat Ramadhan', 'Teknik Informatika'),
(118140105, 'Vina Alvionita', 'Teknik Informatika'),
(118140106, 'Abdul Gani', 'Teknik Informatika'),
(118140107, 'Andre Pratama', 'Teknik Informatika'),
(118140111, 'Syahrul Anam', 'Teknik Informatika'),
(118140113, 'Naufal Irvansyah', 'Teknik Informatika'),
(118140115, 'Hamidh Firoos', 'Teknik Informatika'),
(118140128, 'Arya Daulat', 'Teknik Informatika'),
(118140129, 'Arre Pangestu', 'Teknik Informatika'),
(118140130, 'Muhammad Iqbal', 'Teknik Informatika'),
(118140133, 'Manarul Hidayat', 'Teknik Informatika'),
(118140139, 'Siti Zulaika', 'Teknik Informatika'),
(118140141, 'Imran', 'Teknik Informatika');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruang`
--

CREATE TABLE `ruang` (
  `id` int(25) NOT NULL,
  `nama` varchar(191) NOT NULL,
  `gedung` varchar(5) NOT NULL,
  `ketersediaan` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ruang`
--

INSERT INTO `ruang` (`id`, `nama`, `gedung`, `ketersediaan`) VALUES
(1, 'C106', 'C', 1),
(2, 'C108', 'C', 1),
(3, 'C204', 'C', 1),
(4, 'D102', 'D', 1),
(5, 'D103', 'D', 1),
(6, 'D104', 'D', 1),
(7, 'D105', 'D', 1),
(8, 'D306', 'D', 1),
(9, 'D307', 'D', 1),
(10, 'D308', 'D', 1),
(11, 'D309', 'D', 1),
(12, 'D315', 'D', 1),
(13, 'E001', 'E', 1),
(14, 'E003', 'E', 1),
(15, 'E103', 'E', 1),
(16, 'E104', 'E', 1),
(17, 'E107', 'E', 1),
(18, 'E109', 'E', 1),
(19, 'E112', 'E', 1),
(20, 'E113', 'E', 1),
(21, 'E114', 'E', 1),
(22, 'E115', 'E', 1),
(23, 'E203', 'E', 1),
(24, 'E204', 'E', 1),
(25, 'E205', 'E', 1),
(26, 'E206', 'E', 1),
(27, 'E207', 'E', 1),
(28, 'E208', 'E', 1),
(29, 'E209', 'E', 1),
(30, 'E210', 'E', 1),
(31, 'E211', 'E', 1),
(32, 'E307', 'E', 1),
(33, 'E308', 'E', 1),
(34, 'E309', 'E', 1),
(35, 'E310', 'E', 1),
(36, 'E311', 'E', 1),
(37, 'GK101', 'GKU', 1),
(38, 'GK102', 'GKU', 1),
(39, 'GK103', 'GKU', 1),
(40, 'GK104', 'GKU', 1),
(41, 'GK105', 'GKU', 1),
(42, 'GK106', 'GKU', 1),
(43, 'GK117', 'GKU', 1),
(44, 'GK118', 'GKU', 1),
(45, 'GK119', 'GKU', 1),
(46, 'GK120', 'GKU', 1),
(47, 'GK121', 'GKU', 1),
(48, 'GK122', 'GKU', 1),
(49, 'GK201', 'GKU', 1),
(50, 'GK202', 'GKU', 1),
(51, 'GK203', 'GKU', 1),
(52, 'GK204', 'GKU', 1),
(53, 'GK211', 'GKU', 1),
(54, 'GK212', 'GKU', 1),
(55, 'GK213', 'GKU', 1),
(56, 'GK214', 'GKU', 1),
(57, 'GK301', 'GKU', 1),
(58, 'GK302', 'GKU', 1),
(59, 'GK303', 'GKU', 1),
(60, 'GK304', 'GKU', 1),
(61, 'GK311', 'GKU', 1),
(62, 'GK312', 'GKU', 1),
(63, 'GK313', 'GKU', 1),
(64, 'GK314', 'GKU', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tempat_peminjaman`
--

CREATE TABLE `tempat_peminjaman` (
  `id` int(25) NOT NULL,
  `nama` varchar(191) NOT NULL,
  `gedung` varchar(191) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tempat_peminjaman`
--

INSERT INTO `tempat_peminjaman` (`id`, `nama`, `gedung`) VALUES
(1, 'akademik', 'C'),
(2, 'akademik', 'E'),
(3, 'sarana prasarana', 'D'),
(4, 'sarana prasarana', 'E');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `tempat_peminjaman_id` (`tempat_peminjaman_id`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_tempat_pinjam` (`id_tempat_pinjam`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `ruang`
--
ALTER TABLE `ruang`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nama` (`nama`);

--
-- Indeks untuk tabel `tempat_peminjaman`
--
ALTER TABLE `tempat_peminjaman`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `ruang`
--
ALTER TABLE `ruang`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT untuk tabel `tempat_peminjaman`
--
ALTER TABLE `tempat_peminjaman`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`tempat_peminjaman_id`) REFERENCES `tempat_peminjaman` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`id_tempat_pinjam`) REFERENCES `tempat_peminjaman` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
