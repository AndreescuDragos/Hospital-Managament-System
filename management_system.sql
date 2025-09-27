-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Gazdă: 127.0.0.1:3306
-- Timp de generare: sept. 27, 2025 la 09:53 AM
-- Versiune server: 8.2.0
-- Versiune PHP: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Bază de date: `management_system`
--

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `inventory`
--

DROP TABLE IF EXISTS `inventory`;
CREATE TABLE IF NOT EXISTS `inventory` (
  `item_id` int NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `item_type` varchar(100) NOT NULL,
  `stock_quantity` int NOT NULL,
  `location` varchar(100) NOT NULL,
  `supplier` varchar(100) NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Eliminarea datelor din tabel `inventory`
--

INSERT INTO `inventory` (`item_id`, `item_name`, `item_type`, `stock_quantity`, `location`, `supplier`) VALUES
(3001, 'Aspirina', 'Medicine', 50, 'Pharmacy', 'BioPharm Solutions'),
(3002, 'Paracetamol', 'Medicine', 100, 'Pharmacy', 'Medico Life SA'),
(3003, 'Ibuprofen', 'Medicine', 80, 'Pharmacy', 'Zentiva Romania'),
(3004, 'Stetoscop', 'Equipment', 10, 'Deposit', 'MedTech Instruments'),
(3005, 'Aparat EKG', 'Equipment', 5, 'Deposit', 'CardioVision Ltd.'),
(3006, 'Bandaje', 'Supplies', 200, 'Salons', 'Sanimed Distribution'),
(3007, 'Siringa', 'Supplies', 150, 'Pharmacy', 'B.Braun Medical SRL'),
(3008, 'Antibiotic', 'Medicine', 60, 'Pharmacy', 'Antibiotice Iași SA'),
(3009, 'Defibrilator', 'Equipment', 10, 'Deposit', 'Lifeline Medical Equipment'),
(3010, 'Centrifuga', 'Equipment', 2, 'Deposit', 'LabExperts SRL'),
(3011, 'Gaze sterile', 'Supplies', 500, 'Salons', 'Rommedica Supplies'),
(3012, 'Masca chirurgicala', 'Supplies', 30, 'Pharmacy', 'Medline Europe'),
(3013, 'Insulina', 'Medicine', 40, 'Pharmacy', 'Novo Nordisk'),
(3014, 'Ventilator', 'Equipment', 4, 'Deposit', 'Siemens Healthineers'),
(3015, 'Seringi cu ac', 'Supplies', 250, 'Salons', 'Terumo Corporation'),
(3016, 'Glucagon', 'Medicine', 30, 'Pharmacy', 'Eli Lilly'),
(3017, 'Monitor cardiac', 'Equipment', 6, 'Deposit', 'Philips Healthcare'),
(3018, 'Pansamente', 'Supplies', 400, 'Salons', 'Hartmann Group'),
(3019, 'Antiseptic', 'Medicine', 70, 'Pharmacy', 'Hexi Pharma Distribution'),
(3020, 'Tensiometru', 'Equipment', 8, 'Deposit', 'Omron Healthcare Europe ');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `lab_tests`
--

DROP TABLE IF EXISTS `lab_tests`;
CREATE TABLE IF NOT EXISTS `lab_tests` (
  `test_id` int NOT NULL,
  `patient_id` int NOT NULL,
  `test_name` varchar(100) NOT NULL,
  `department` varchar(50) NOT NULL,
  `employee1_id` int NOT NULL,
  `employee2_id` int NOT NULL,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`test_id`),
  KEY `employee2_id` (`employee2_id`),
  KEY `fk_labtests_patient` (`patient_id`),
  KEY `fk_labtests_emp1` (`employee1_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Eliminarea datelor din tabel `lab_tests`
--

INSERT INTO `lab_tests` (`test_id`, `patient_id`, `test_name`, `department`, `employee1_id`, `employee2_id`, `status`) VALUES
(6, 2015, 'Urinalysis', 'Urology', 1007, 1020, 'Pending');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Eliminarea datelor din tabel `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(2, 'Admin', '9af15b336e6a9619928537df30b2e6a2376569fcf9d7e773eccede65606529a0');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `medical_staff`
--

DROP TABLE IF EXISTS `medical_staff`;
CREATE TABLE IF NOT EXISTS `medical_staff` (
  `employee_id` int NOT NULL,
  `employee_name` varchar(100) NOT NULL,
  `employee_phone` int NOT NULL,
  `employee_address` varchar(255) DEFAULT NULL,
  `employee_position` varchar(50) NOT NULL,
  `department` varchar(50) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Eliminarea datelor din tabel `medical_staff`
--

INSERT INTO `medical_staff` (`employee_id`, `employee_name`, `employee_phone`, `employee_address`, `employee_position`, `department`) VALUES
(1001, 'Ion Popescu', 723456789, 'Str. Lalelelor, nr. 8', 'Doctor', 'Cardiology'),
(1002, 'Maria Ionescu', 723456791, 'Str. Trandafirilor, nr. 35', 'Technician', 'Ophthalmology'),
(1003, 'Andrei Georgescu', 723456791, 'Str. Florilor, nr. 7', 'Doctor', 'Dermatology'),
(1004, 'Elena Dumitru', 723456792, 'Str. Primaverii, nr. 1', 'Technician', 'Neurology'),
(1005, 'Mihai Dumitrescu', 723456793, 'Str. Libertatii, nr. 1', 'Doctor', 'Ophthalmology'),
(1006, 'Ana Marinescu', 723456794, 'Str. Victoriei, nr. 4', 'Assistant', 'Pediatrics'),
(1007, 'Florin Radu', 723456795, 'Str. Unirii, nr. 6', 'Doctor', 'Urology'),
(1008, 'Ion Victor', 723436763, 'Str. Trandafirilor, nr. 3', 'Doctor', 'Endocrinology'),
(1009, 'Vlad Mihail', 723456797, 'Str. Oltului, nr. 17', 'Technician', 'Cardiology'),
(1011, 'Cristian Enache', 723456798, 'Str. Libertatii, nr. 14', 'Doctor', 'Radiology'),
(1012, 'Alina Florescu', 723456800, 'Str. Mihai Eminescu, nr. 11', 'Technician', 'Dermatology'),
(1013, 'Daniel Tudor', 723456801, 'Str. Avram Iancu, nr. 15', 'Doctor', 'Pediatrics'),
(1014, 'Ioana Voicu', 723456802, 'Str. Republicii, nr. 20', 'Nurse', 'Neurology'),
(1015, 'Stefan Ionescu', 723456803, 'Str. Dacia, nr. 16', 'Doctor', 'Neurology'),
(1016, 'Claudia Marin', 723456804, 'Str. Nationala, nr. 22', 'Technician', 'Endocrinology'),
(1017, 'Radu Popescu', 723456805, 'Str. Libertatii, nr. 18', 'Technician', 'Radiology'),
(1018, 'Bianca Stanescu', 723456806, 'Str. Florilor, nr. 21', 'Assistant', 'Radiology'),
(1019, 'Victor Barbu', 723456807, 'Str. Trandafirilor, nr. 23', 'Assistant', 'Dermatology'),
(1020, 'Simona Dima', 723456808, 'Str. Lalelelor, nr. 25', 'Technician', 'Urology');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `patients`
--

DROP TABLE IF EXISTS `patients`;
CREATE TABLE IF NOT EXISTS `patients` (
  `patient_id` int NOT NULL,
  `patient_name` varchar(100) NOT NULL,
  `patient_phone` int NOT NULL,
  `patient_address` varchar(255) DEFAULT NULL,
  `patient_gender` varchar(50) NOT NULL,
  `department` varchar(50) NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Eliminarea datelor din tabel `patients`
--

INSERT INTO `patients` (`patient_id`, `patient_name`, `patient_phone`, `patient_address`, `patient_gender`, `department`) VALUES
(2001, 'Ionela Pop', 731111222, 'Str. Mihai Viteazul, nr. 1', 'Female', 'Cardiology'),
(2002, 'Mihai Iacob', 731111223, 'Str. Libertatii, nr. 2', 'Male', 'Radiology'),
(2003, 'Andreea Petrescu', 731111224, 'Str. Primaverii, nr. 3', 'Female', 'Dermatology'),
(2004, 'Cristian Iliescu', 731111225, 'Str. Trandafirilor, nr. 43', 'Male', 'Neurology'),
(2005, 'Elena Badea', 731111226, 'Str. Lalelelor, nr. 5', 'Female', 'Ophthalmology'),
(2006, 'Florin Stan', 731111227, 'Str. Unirii, nr. 6', 'Male', 'Pediatrics'),
(2007, 'Popa Lucian', 73113438, 'Str. Libertatii, nr. 3', 'Male', 'Endocrinology'),
(2008, 'Alin Dumitru', 731111229, 'Str. Nationala, nr. 8', 'Male', 'Endocrinology'),
(2009, 'Ioana Manole', 731111230, 'Str. Avram Iancu, nr. 9', 'Female', 'Cardiology'),
(2010, 'Valentin Marinescu', 731111231, 'Str. Republicii, nr. 10', 'Male', 'Radiology'),
(2011, 'Anca Rusu', 731111232, 'Str. Florilor, nr. 11', 'Female', 'Dermatology'),
(2012, 'Daniel Mocanu', 731111233, 'Str. Oltului, nr. 12', 'Male', 'Neurology'),
(2013, 'Simona Radu', 731111234, 'Str. Trandafirilor, nr. 13', 'Female', 'Ophthalmology'),
(2014, 'Sorin Vasile', 731111235, 'Str. Lalelelor, nr. 14', 'Male', 'Pediatrics'),
(2015, 'Alex Dumitru', 731111236, 'Str. Unirii, nr. 15', 'Female', 'Urology'),
(2016, 'Radu Tudor', 731111237, 'Str. Nationala, nr. 16', 'Male', 'Endocrinology'),
(2017, 'Gheorghe Vlad', 731311331, 'Str. Savantului, nr. 5', 'Male', 'Urology'),
(2018, 'Victor Luca', 731111239, 'Str. Libertatii, nr. 18', 'Male', 'Radiology'),
(2019, 'Cristina Matei', 731111240, 'Str. Stefan cel Mare, nr. 19', 'Female', 'Dermatology'),
(2020, 'Paul Andrei', 731111241, 'Str. Avram Iancu, nr. 20', 'Male', 'Neurology');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `treatment`
--

DROP TABLE IF EXISTS `treatment`;
CREATE TABLE IF NOT EXISTS `treatment` (
  `treatment_id` int NOT NULL AUTO_INCREMENT,
  `test_id` int NOT NULL,
  `patient_id` int NOT NULL,
  `test_name` varchar(100) NOT NULL,
  `department` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `item_id` int NOT NULL,
  `item_name` varchar(100) NOT NULL,
  PRIMARY KEY (`treatment_id`),
  KEY `patient_id` (`patient_id`),
  KEY `item_id` (`item_id`),
  KEY `fk_treatment_test` (`test_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Constrângeri pentru tabele eliminate
--

--
-- Constrângeri pentru tabele `lab_tests`
--
ALTER TABLE `lab_tests`
  ADD CONSTRAINT `fk_labtests_emp1` FOREIGN KEY (`employee1_id`) REFERENCES `medical_staff` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_labtests_emp2` FOREIGN KEY (`employee2_id`) REFERENCES `medical_staff` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_labtests_patient` FOREIGN KEY (`patient_id`) REFERENCES `patients` (`patient_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constrângeri pentru tabele `treatment`
--
ALTER TABLE `treatment`
  ADD CONSTRAINT `fk_treatment_item` FOREIGN KEY (`item_id`) REFERENCES `inventory` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_treatment_patient` FOREIGN KEY (`patient_id`) REFERENCES `patients` (`patient_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_treatment_test` FOREIGN KEY (`test_id`) REFERENCES `lab_tests` (`test_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
