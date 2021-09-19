-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 19, 2021 at 08:38 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `Adm` int(11) NOT NULL,
  `Subject` text NOT NULL,
  `Score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`Adm`, `Subject`, `Score`) VALUES
(1001, 'Math', 40),
(1001, 'Eng', 45);

-- --------------------------------------------------------

--
-- Table structure for table `studentdata`
--

CREATE TABLE `studentdata` (
  `fullname` text NOT NULL,
  `adm` text NOT NULL,
  `form` text NOT NULL,
  `math` int(11) NOT NULL,
  `eng` int(11) NOT NULL,
  `kis` int(11) NOT NULL,
  `bio` int(11) NOT NULL,
  `chem` int(11) NOT NULL,
  `phy` int(11) NOT NULL,
  `geo` int(11) NOT NULL,
  `hist` int(11) NOT NULL,
  `cre` int(11) NOT NULL,
  `bus` int(11) NOT NULL,
  `agri` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `points` int(11) NOT NULL,
  `avg` double NOT NULL,
  `rank` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentdata`
--

INSERT INTO `studentdata` (`fullname`, `adm`, `form`, `math`, `eng`, `kis`, `bio`, `chem`, `phy`, `geo`, `hist`, `cre`, `bus`, `agri`, `total`, `points`, `avg`, `rank`) VALUES
('fows', '1001', 'Form 1', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `studentdetails`
--

CREATE TABLE `studentdetails` (
  `Name` text NOT NULL,
  `Adm` int(11) NOT NULL,
  `Form` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentdetails`
--

INSERT INTO `studentdetails` (`Name`, `Adm`, `Form`) VALUES
('gdilq', 1001, 'Form 1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentdetails`
--
ALTER TABLE `studentdetails`
  ADD PRIMARY KEY (`Adm`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentdetails`
--
ALTER TABLE `studentdetails`
  MODIFY `Adm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1002;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
