-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2026 at 03:11 PM
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

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`id_kursi`),
  ADD KEY `id_jadwal` (`id_jadwal`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kursi`
--
ALTER TABLE `kursi`
  MODIFY `id_kursi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kursi`
--
ALTER TABLE `kursi`
  ADD CONSTRAINT `kursi_ibfk_1` FOREIGN KEY (`id_jadwal`) REFERENCES `jadwal` (`id_jadwal`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
