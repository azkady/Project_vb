-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Okt 2018 pada 05.35
-- Versi server: 10.1.31-MariaDB
-- Versi PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `courses_project`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `Username` varchar(15) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Admin_Name` varchar(30) NOT NULL,
  `Admin_Contact` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`Username`, `Password`, `Admin_Name`, `Admin_Contact`) VALUES
('adni', 'adni20', 'adni alydrus', '082347128342'),
('rizaldi', 'rizaldi10', 'Rizaldi Akbar', '08312482341');

-- --------------------------------------------------------

--
-- Struktur dari tabel `class`
--

CREATE TABLE `class` (
  `Student_Class` varchar(10) NOT NULL,
  `Class_Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `class`
--

INSERT INTO `class` (`Student_Class`, `Class_Name`) VALUES
('2sc4', 'Ti'),
('asd', 'asd'),
('Class002', 'Ti');

-- --------------------------------------------------------

--
-- Struktur dari tabel `room_schedule`
--

CREATE TABLE `room_schedule` (
  `Room_Schedule` varchar(10) NOT NULL,
  `Room_ID` varchar(5) NOT NULL,
  `Teacher_ID` varchar(10) NOT NULL,
  `Student_Class` varchar(10) NOT NULL,
  `Start_Time` text NOT NULL,
  `End_Time` text NOT NULL,
  `Date` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `room_schedule`
--

INSERT INTO `room_schedule` (`Room_Schedule`, `Room_ID`, `Teacher_ID`, `Student_Class`, `Start_Time`, `End_Time`, `Date`) VALUES
('RS001', 'R01', 'T001', '2sc4', '08.00', '12.00', '10 april 2018'),
('RS002', 'R01', 'T001', '2sc4', '12.00', '14.00', '11 april 2018');

-- --------------------------------------------------------

--
-- Struktur dari tabel `student`
--

CREATE TABLE `student` (
  `Student_ID` varchar(10) NOT NULL,
  `Student_Name` varchar(30) NOT NULL,
  `Student_Class` varchar(10) NOT NULL,
  `Student_Contact` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `student`
--

INSERT INTO `student` (`Student_ID`, `Student_Name`, `Student_Class`, `Student_Contact`) VALUES
('S001', 'Rizaldi Akbar', '2sc4', '081231423423'),
('S002', 'Sava Marwah', '2sc4', '0813241353464'),
('S003', 'rizaldi', '2sc4', '01231224221'),
('S004', 'fasya', '2sc4', '12312412');

-- --------------------------------------------------------

--
-- Struktur dari tabel `teacher`
--

CREATE TABLE `teacher` (
  `Teacher_ID` varchar(10) NOT NULL,
  `Teacher_Name` varchar(30) NOT NULL,
  `Teacher_Lesson` varchar(25) NOT NULL,
  `Teacher_Contact` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `teacher`
--

INSERT INTO `teacher` (`Teacher_ID`, `Teacher_Name`, `Teacher_Lesson`, `Teacher_Contact`) VALUES
('T001', 'Mr. Ar Royya', 'TI', '0823478234'),
('T003', 'Miftahun', 'Java', '0886767686767'),
('T005', 'Pebry', 'IT', '081723743');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Username`);

--
-- Indeks untuk tabel `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`Student_Class`);

--
-- Indeks untuk tabel `room_schedule`
--
ALTER TABLE `room_schedule`
  ADD PRIMARY KEY (`Room_Schedule`),
  ADD KEY `FK_Teacher` (`Teacher_ID`),
  ADD KEY `Student_Class_room_schedule` (`Student_Class`);

--
-- Indeks untuk tabel `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Student_ID`),
  ADD KEY `Student_Class_student` (`Student_Class`) USING BTREE;

--
-- Indeks untuk tabel `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`Teacher_ID`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `room_schedule`
--
ALTER TABLE `room_schedule`
  ADD CONSTRAINT `FK_Teacher` FOREIGN KEY (`Teacher_ID`) REFERENCES `teacher` (`Teacher_ID`),
  ADD CONSTRAINT `Student_Class_room_schedule` FOREIGN KEY (`Student_Class`) REFERENCES `class` (`Student_Class`);

--
-- Ketidakleluasaan untuk tabel `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `Student_Class_class` FOREIGN KEY (`Student_Class`) REFERENCES `class` (`Student_Class`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
