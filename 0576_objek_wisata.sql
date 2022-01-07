-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2022 at 02:36 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `0576_objek_wisata`
--

-- --------------------------------------------------------

--
-- Table structure for table `costumer`
--

CREATE TABLE `costumer` (
  `id_costumer` varchar(30) NOT NULL,
  `nama_costumer` varchar(30) NOT NULL,
  `notelp_costumer` varchar(30) NOT NULL,
  `tgl_pembelian` date NOT NULL,
  `tgl_berwisata` date NOT NULL,
  `nama_wisata` varchar(30) NOT NULL,
  `nama_pemandu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `costumer`
--

INSERT INTO `costumer` (`id_costumer`, `nama_costumer`, `notelp_costumer`, `tgl_pembelian`, `tgl_berwisata`, `nama_wisata`, `nama_pemandu`) VALUES
('1', 'ALFA', '000000001111', '2021-01-01', '2021-01-10', 'Museum Banua Anyar', 'Idiw'),
('2', 'Maimunah', '111111112233', '2021-02-01', '2021-02-07', 'Menara Pandang', 'Idiw');

-- --------------------------------------------------------

--
-- Table structure for table `pemandu`
--

CREATE TABLE `pemandu` (
  `id_pemandu` varchar(20) NOT NULL,
  `nama_pemandu` varchar(30) NOT NULL,
  `tgl_lahir_pemandu` date NOT NULL,
  `jk_pemandu` varchar(30) NOT NULL,
  `alamat_pemandu` varchar(30) NOT NULL,
  `notelp_pemandu` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemandu`
--

INSERT INTO `pemandu` (`id_pemandu`, `nama_pemandu`, `tgl_lahir_pemandu`, `jk_pemandu`, `alamat_pemandu`, `notelp_pemandu`) VALUES
('1', 'Idiw', '2022-01-06', 'Laki - Laki', 'Martapura', '008811223344');

-- --------------------------------------------------------

--
-- Table structure for table `wisata`
--

CREATE TABLE `wisata` (
  `id_wisata` varchar(30) NOT NULL,
  `nama_wisata` varchar(30) NOT NULL,
  `alamat_wisata` varchar(30) NOT NULL,
  `jam_operasional` varchar(30) NOT NULL,
  `deskripsi_wisata` text NOT NULL,
  `tarif_masuk` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wisata`
--

INSERT INTO `wisata` (`id_wisata`, `nama_wisata`, `alamat_wisata`, `jam_operasional`, `deskripsi_wisata`, `tarif_masuk`) VALUES
('1', 'Museum Banua Anyar', 'Jl.Banua Anyar', '16.00 - 18.00', 'sdfsdhgdf', '15.000'),
('2', 'Menara Pandang', 'Jl. Kapten Piere Tendean', '10.00 - 20.00', 'Bangunan terkenal kontemporer yang bercahaya saat malam dengan panorama kota dan sungai dari dek observasi', '10.000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `costumer`
--
ALTER TABLE `costumer`
  ADD PRIMARY KEY (`id_costumer`);

--
-- Indexes for table `pemandu`
--
ALTER TABLE `pemandu`
  ADD PRIMARY KEY (`id_pemandu`);

--
-- Indexes for table `wisata`
--
ALTER TABLE `wisata`
  ADD PRIMARY KEY (`id_wisata`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
