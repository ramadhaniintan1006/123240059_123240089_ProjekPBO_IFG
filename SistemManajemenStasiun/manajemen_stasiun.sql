-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2026 at 08:28 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manajemen_stasiun`
--

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `id_jadwal` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `jam_berangkat` time NOT NULL,
  `jam_tiba` time NOT NULL,
  `harga` decimal(10,2) NOT NULL,
  `nama_kereta` varchar(100) DEFAULT NULL,
  `asal` varchar(100) DEFAULT NULL,
  `tujuan` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`id_jadwal`, `tanggal`, `jam_berangkat`, `jam_tiba`, `harga`, `nama_kereta`, `asal`, `tujuan`) VALUES
(2, '2026-06-15', '07:00:00', '14:30:00', 350000.00, 'Taksaka', 'Yogyakarta', 'Jakarta'),
(3, '2026-06-15', '08:15:00', '16:00:00', 280000.00, 'Lodaya', 'Bandung', 'Solo'),
(4, '2026-06-16', '09:00:00', '17:30:00', 320000.00, 'Argo Bromo Anggrek', 'Surabaya', 'Jakarta'),
(5, '2026-06-16', '13:00:00', '20:00:00', 250000.00, 'Sancaka', 'Yogyakarta', 'Surabaya'),
(6, '2026-06-17', '06:30:00', '12:30:00', 220000.00, 'Malioboro Ekspres', 'Malang', 'Yogyakarta'),
(7, '2026-06-17', '10:00:00', '18:00:00', 300000.00, 'Bima', 'Surabaya', 'Jakarta'),
(8, '2026-06-18', '15:00:00', '23:00:00', 275000.00, 'Turangga', 'Bandung', 'Surabaya'),
(9, '2026-06-18', '18:30:00', '03:30:00', 450000.00, 'Argo Lawu', 'Solo', 'Jakarta');

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `id_kereta` int(11) NOT NULL,
  `nama_kereta` varchar(100) NOT NULL,
  `kelas` enum('Ekonomi','Bisnis','Eksekutif') NOT NULL,
  `kapasitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`id_kereta`, `nama_kereta`, `kelas`, `kapasitas`) VALUES
(1, 'Argo Bromo', 'Eksekutif', 50),
(2, 'Malioboro Express', 'Bisnis', 60),
(3, 'Sri Tanjung', 'Ekonomi', 80),
(4, 'Lodaya', 'Eksekutif', 45),
(5, 'Progo', 'Ekonomi', 90),
(6, 'Taksaka', 'Eksekutif', 48);

-- --------------------------------------------------------

--
-- Table structure for table `kursi`
--

CREATE TABLE `kursi` (
  `id_kursi` int(11) NOT NULL,
  `id_jadwal` int(11) NOT NULL,
  `nomor_kursi` varchar(10) NOT NULL,
  `status` enum('Tersedia','Dipesan') DEFAULT 'Tersedia'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kursi`
--

INSERT INTO `kursi` (`id_kursi`, `id_jadwal`, `nomor_kursi`, `status`) VALUES
(1, 2, 'A1', 'Tersedia'),
(2, 2, 'A2', 'Tersedia'),
(3, 2, 'A3', 'Tersedia'),
(4, 2, 'A4', 'Tersedia'),
(5, 2, 'B1', 'Tersedia'),
(6, 2, 'B2', 'Tersedia'),
(7, 3, 'A1', 'Tersedia'),
(8, 3, 'A2', 'Tersedia'),
(9, 3, 'A3', 'Tersedia'),
(10, 3, 'A4', 'Tersedia'),
(11, 3, 'B1', 'Tersedia'),
(12, 3, 'B2', 'Tersedia'),
(13, 4, 'A1', 'Dipesan'),
(14, 4, 'A2', 'Dipesan'),
(15, 4, 'A3', 'Tersedia'),
(16, 4, 'A4', 'Tersedia'),
(17, 4, 'B1', 'Tersedia'),
(18, 4, 'B2', 'Tersedia'),
(19, 4, 'A5', 'Tersedia'),
(20, 4, 'B3', 'Tersedia'),
(21, 4, 'B4', 'Tersedia'),
(22, 4, 'B5', 'Tersedia'),
(23, 4, 'C1', 'Tersedia'),
(24, 4, 'C2', 'Tersedia'),
(25, 4, 'C3', 'Tersedia'),
(26, 4, 'C4', 'Tersedia'),
(27, 4, 'C5', 'Tersedia'),
(28, 4, 'D1', 'Tersedia'),
(29, 4, 'D2', 'Tersedia'),
(30, 4, 'D3', 'Tersedia'),
(31, 4, 'D4', 'Tersedia'),
(32, 4, 'D5', 'Tersedia'),
(33, 4, 'E1', 'Tersedia'),
(34, 4, 'E2', 'Tersedia'),
(35, 4, 'E3', 'Tersedia'),
(36, 4, 'E4', 'Tersedia'),
(37, 4, 'E5', 'Tersedia'),
(38, 4, 'F1', 'Tersedia'),
(39, 4, 'F2', 'Tersedia'),
(40, 4, 'F3', 'Tersedia'),
(41, 4, 'F4', 'Tersedia'),
(42, 4, 'F5', 'Tersedia'),
(43, 4, 'G1', 'Tersedia'),
(44, 4, 'G2', 'Tersedia'),
(45, 4, 'G3', 'Tersedia'),
(46, 4, 'G4', 'Tersedia'),
(47, 4, 'G5', 'Tersedia'),
(48, 4, 'H1', 'Tersedia'),
(49, 4, 'H2', 'Tersedia'),
(50, 4, 'H3', 'Tersedia'),
(51, 4, 'H4', 'Tersedia'),
(52, 4, 'H5', 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pemesanan` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_jadwal` int(11) NOT NULL,
  `id_kursi` int(11) NOT NULL,
  `kode_booking` varchar(20) NOT NULL,
  `status` enum('Pending','Selesai','Dibatalkan') DEFAULT 'Pending',
  `tanggal_pesan` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`id_pemesanan`, `id_user`, `id_jadwal`, `id_kursi`, `kode_booking`, `status`, `tanggal_pesan`) VALUES
(1, 2, 4, 13, 'BK1780055198622', 'Pending', '2026-05-29 18:46:38'),
(2, 2, 4, 14, 'BK1780057275706', 'Pending', '2026-05-29 19:21:15');

-- --------------------------------------------------------

--
-- Table structure for table `stasiun`
--

CREATE TABLE `stasiun` (
  `id_stasiun` int(11) NOT NULL,
  `nama_stasiun` varchar(100) NOT NULL,
  `kota` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stasiun`
--

INSERT INTO `stasiun` (`id_stasiun`, `nama_stasiun`, `kota`) VALUES
(1, 'Tugu ', 'Yogyakarta'),
(2, 'Gambir', 'Jakarta');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` enum('admin','user') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `nama`, `email`, `password`, `role`) VALUES
(1, 'Admin', 'admin@gmail.com', 'admin123', 'admin'),
(2, 'user1', 'user1@gmail.com', '1234', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`id_kereta`);

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`id_kursi`),
  ADD KEY `id_jadwal` (`id_jadwal`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pemesanan`),
  ADD UNIQUE KEY `kode_booking` (`kode_booking`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_jadwal` (`id_jadwal`),
  ADD KEY `id_kursi` (`id_kursi`);

--
-- Indexes for table `stasiun`
--
ALTER TABLE `stasiun`
  ADD PRIMARY KEY (`id_stasiun`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jadwal`
--
ALTER TABLE `jadwal`
  MODIFY `id_jadwal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `kereta`
--
ALTER TABLE `kereta`
  MODIFY `id_kereta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `kursi`
--
ALTER TABLE `kursi`
  MODIFY `id_kursi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `pemesanan`
--
ALTER TABLE `pemesanan`
  MODIFY `id_pemesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `stasiun`
--
ALTER TABLE `stasiun`
  MODIFY `id_stasiun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kursi`
--
ALTER TABLE `kursi`
  ADD CONSTRAINT `kursi_ibfk_1` FOREIGN KEY (`id_jadwal`) REFERENCES `jadwal` (`id_jadwal`);

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`),
  ADD CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`id_jadwal`) REFERENCES `jadwal` (`id_jadwal`),
  ADD CONSTRAINT `pemesanan_ibfk_3` FOREIGN KEY (`id_kursi`) REFERENCES `kursi` (`id_kursi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
