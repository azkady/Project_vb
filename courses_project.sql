-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 18 Des 2018 pada 03.29
-- Versi Server: 10.1.28-MariaDB
-- PHP Version: 7.1.10

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
  `ID_Admin` int(255) NOT NULL,
  `Username` varchar(15) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Admin_Name` varchar(30) NOT NULL,
  `Admin_Contact` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`ID_Admin`, `Username`, `Password`, `Admin_Name`, `Admin_Contact`) VALUES
(1, 'Dadang', 'Dadang12', 'Dadang Suherman', '082246214330'),
(2, 'QMCMandreee', 'QMCMandreee', 'M Andre Juliansyah', '082188889999'),
(3, 'admin', 'admin', 'admin', '089938382222');

-- --------------------------------------------------------

--
-- Struktur dari tabel `class`
--

CREATE TABLE `class` (
  `ID_Class` int(10) NOT NULL,
  `Student_Class` varchar(10) NOT NULL,
  `Class_Name` varchar(20) NOT NULL,
  `Author` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `class`
--

INSERT INTO `class` (`ID_Class`, `Student_Class`, `Class_Name`, `Author`) VALUES
(1, 'IPS 2', '404', ''),
(9, 'IPA 10', '101', ''),
(10, 'IPS 3', '401', ''),
(11, 'IPA 8', '505', 'Admin'),
(12, 'IPA 2', '403', 'admin'),
(13, 'IPA 3', '307', 'admin'),
(14, 'Student 1', 'Class 1', 'admin'),
(15, 'Student 2', 'Class 2', 'admin'),
(16, 'Student 3', 'Class 3', 'admin'),
(17, 'Student 4', 'Class 4', 'admin'),
(18, 'Student 5', 'Class 5', 'admin'),
(19, '', '', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `room_schedule`
--

CREATE TABLE `room_schedule` (
  `ID_Schedule` int(10) NOT NULL,
  `Teacher_ID` int(10) NOT NULL,
  `Student_Class` varchar(10) NOT NULL,
  `Class_Name` varchar(20) NOT NULL,
  `Start_Time` text NOT NULL,
  `End_Time` text NOT NULL,
  `Date` text NOT NULL,
  `Author` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `room_schedule`
--

INSERT INTO `room_schedule` (`ID_Schedule`, `Teacher_ID`, `Student_Class`, `Class_Name`, `Start_Time`, `End_Time`, `Date`, `Author`) VALUES
(3, 3, 'IPS 2', '404', '0888', '0999', '070708', ''),
(6, 1, 'IPA 3', '404', '12:30', '16:30', '12/07/18', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `student`
--

CREATE TABLE `student` (
  `Student_ID` int(10) NOT NULL,
  `Student_Name` varchar(30) NOT NULL,
  `Student_Class` varchar(10) NOT NULL,
  `Student_Contact` varchar(15) NOT NULL,
  `Author` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `student`
--

INSERT INTO `student` (`Student_ID`, `Student_Name`, `Student_Class`, `Student_Contact`, `Author`) VALUES
(4, 'Dadang Faex', 'IPS 2', '381910', ''),
(5, 'Dadang', 'IPA 8', '0899101010', 'admin'),
(6, 'Dadang', 'IPA 8', '0899101010', 'admin'),
(7, 'Dadang', 'IPA 8', '0899101010', 'admin'),
(8, 'Dadang', 'IPA 8', '0899101010', 'admin'),
(11, 'Helmi', 'IPA 3', '08281191000', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `teacher`
--

CREATE TABLE `teacher` (
  `Teacher_ID` int(10) NOT NULL,
  `Teacher_Name` varchar(30) NOT NULL,
  `Teacher_Lesson` varchar(25) NOT NULL,
  `Teacher_Contact` varchar(15) NOT NULL,
  `Author` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `teacher`
--

INSERT INTO `teacher` (`Teacher_ID`, `Teacher_Name`, `Teacher_Lesson`, `Teacher_Contact`, `Author`) VALUES
(1, 'Andre', 'IPA', '63729101', ''),
(3, 'SASAW', 'IPA', '63729101', ''),
(4, 'Andre', 'Nyuci', '09888191', 'admin'),
(5, 'Dadang', 'Database Engineering', '087745667809', 'Admin'),
(7, '', '', '', 'admin'),
(8, '', '', '', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID_Admin`),
  ADD KEY `Username` (`Username`);

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`ID_Class`),
  ADD KEY `Student_Class` (`Student_Class`),
  ADD KEY `Class_Name` (`Class_Name`);

--
-- Indexes for table `room_schedule`
--
ALTER TABLE `room_schedule`
  ADD PRIMARY KEY (`ID_Schedule`),
  ADD KEY `Teacher_ID` (`Teacher_ID`),
  ADD KEY `Student_Class` (`Student_Class`),
  ADD KEY `Class_Name` (`Class_Name`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Student_ID`),
  ADD KEY `Student_Class_student` (`Student_Class`) USING BTREE,
  ADD KEY `Student_ID` (`Student_ID`),
  ADD KEY `Student_ID_2` (`Student_ID`),
  ADD KEY `Student_ID_3` (`Student_ID`),
  ADD KEY `Student_Class` (`Student_Class`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`Teacher_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `ID_Admin` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `class`
--
ALTER TABLE `class`
  MODIFY `ID_Class` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `room_schedule`
--
ALTER TABLE `room_schedule`
  MODIFY `ID_Schedule` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `Student_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `Teacher_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `room_schedule`
--
ALTER TABLE `room_schedule`
  ADD CONSTRAINT `room_schedule_ibfk_1` FOREIGN KEY (`Teacher_ID`) REFERENCES `teacher` (`Teacher_ID`),
  ADD CONSTRAINT `room_schedule_ibfk_2` FOREIGN KEY (`Student_Class`) REFERENCES `class` (`Student_Class`),
  ADD CONSTRAINT `room_schedule_ibfk_3` FOREIGN KEY (`Class_Name`) REFERENCES `class` (`Class_Name`);

--
-- Ketidakleluasaan untuk tabel `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`Student_Class`) REFERENCES `class` (`Student_Class`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
