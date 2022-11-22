-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Dec 09, 2021 at 10:40 PM
-- Server version: 5.7.34
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ThomasHardware`
--

-- --------------------------------------------------------

--
-- Table structure for table `Customer`
--

CREATE TABLE `Customer` (
  `CustomerID` int(10) NOT NULL,
  `CustomerName` varchar(50) NOT NULL,
  `CustomerAddress` varchar(150) NOT NULL,
  `Telephone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Customer`
--

INSERT INTO `Customer` (`CustomerID`, `CustomerName`, `CustomerAddress`, `Telephone`) VALUES
(34, '34', '443', '4434'),
(45, 'q', 'ee', 'e');

-- --------------------------------------------------------

--
-- Table structure for table `Item`
--

CREATE TABLE `Item` (
  `ItemID` varchar(7) NOT NULL,
  `ItemDescription` varchar(32) NOT NULL,
  `TotalInStock` int(11) DEFAULT NULL,
  `UnitPurchasePrice` double(9,2) DEFAULT NULL,
  `UnitSalePrice` double(9,2) DEFAULT NULL,
  `UnderStockValue` double(9,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Item`
--

INSERT INTO `Item` (`ItemID`, `ItemDescription`, `TotalInStock`, `UnitPurchasePrice`, `UnitSalePrice`, `UnderStockValue`) VALUES
('0001', 'Nail', 25, 345.99, 597.89, 1494.72),
('0002', 'Hammer', 25, 345.99, 597.89, 1494.72),
('0003', 'Lumber 2x4', 25, 345.99, 597.89, 1494.72),
('0004', 'Lumber 2x6', 25, 345.99, 597.89, 1494.72),
('0005', 'Drill', 25, 345.99, 597.89, 1494.72),
('0006', 'Power Drill', 25, 345.99, 597.89, 1494.72),
('0007', 'Saw', 25, 345.99, 597.89, 1494.72),
('0008', 'Power Saw', 25, 345.99, 597.89, 1494.72),
('0009', 'UPS', 25, 345.99, 597.89, 1494.72),
('0010', 'Copper Cabling', 25, 345.99, 597.89, 1494.72),
('0011', 'Ladder', 25, 345.99, 597.89, 1494.72),
('0012', 'Screw', 25, 345.99, 597.89, 1494.72),
('0013', 'Power Adapter', 25, 345.99, 597.89, 1494.72),
('0014', 'Steel Bars', 25, 345.99, 597.89, 1494.72),
('0015', 'Steel Rods', 25, 345.99, 597.89, 1494.72),
('0016', 'Water Hose', 25, 345.99, 597.89, 1494.72),
('0017', 'Water Boots', 25, 345.99, 597.89, 1494.72),
('0018', 'Electrcity Boots', 25, 345.99, 597.89, 1494.72),
('0019', 'JumperSuit 16x32', 25, 345.99, 597.89, 1494.72),
('0020', 'JumperSuit 18x34', 25, 345.99, 597.89, 1494.72),
('0021', 'Toolset', 25, 345.99, 597.89, 1494.72),
('0022', 'Jumper Cable', 25, 345.99, 597.89, 1494.72),
('0023', 'Silicone Gel', 25, 345.99, 597.89, 1494.72),
('0024', 'Power Guard', 25, 345.99, 597.89, 1494.72),
('0025', 'Power Extension', 25, 345.99, 597.89, 1494.72),
('0026', 'Battery', 25, 345.99, 597.89, 1494.72),
('0027', 'Generator', 25, 44345.99, 597.89, 173994.73),
('0028', 'Electric Fittings', 25, 345.99, 597.89, 1494.72),
('0029', 'Light Bulb', 25, 345.99, 597.89, 1494.72),
('0030', 'Electric Socket', 25, 345.99, 597.89, 1494.72),
('0031', 'Fibre Cable', 25, 2345.99, 597.89, 11494.73),
('0032', 'Rubber', 25, 3345.99, 597.89, 13994.73),
('0033', 'Compressor', 25, 5345.99, 597.89, 18994.73),
('0034', 'Wrench', 25, 345.99, 597.89, 1494.72),
('0035', 'Screw Driver F', 25, 345.99, 597.89, 3494.73),
('0036', 'Screw Driver P', 25, 345.99, 597.89, 2744.73),
('0037', 'Nuts & Bolts', 25, 345.99, 597.89, 5744.72),
('0038', 'Woodword Ahesive', 25, 345.99, 597.89, 1494.72),
('0039', 'Sauder Gun', 25, 345.99, 597.89, 11494.73),
('0040', 'Sauder Iron', 25, 345.99, 597.89, 4994.73),
('0041', 'Binding Wire', 25, 345.99, 597.89, 1994.72),
('0042', 'Soil', 25, 345.99, 597.89, 1494.72),
('0043', 'Grass 4x6x7', 25, 345.99, 597.89, 1494.72),
('0044', 'Fertilizer Syntethic', 25, 345.99, 597.89, 1494.72),
('0045', 'Fertilizer Organic', 25, 345.99, 597.89, 994.72),
('0046', 'Pesticide', 25, 345.99, 597.89, 2494.72),
('0047', 'Barrels', 25, 345.99, 597.89, 6494.72),
('0048', 'Water Tank', 25, 345.99, 597.89, 1494.72),
('0049', 'Universal Remote', 25, 345.99, 597.89, 2494.72),
('0050', 'Electric Fan', 25, 345.99, 597.89, 1494.72),
('0051', 'Industrial Fan', 25, 345.99, 597.89, 1494.72),
('0052', 'Industrial Microwave', 25, 345.99, 597.89, 8919.73),
('0053', 'Water Filter Machine', 25, 88345.99, 597.89, 33994.72),
('0054', 'Out-door Grill', 25, 345.99, 597.89, 1494.72),
('0055', 'Cast-Iron Bars', 25, 345.99, 597.89, 1494.72),
('0056', 'Charcoal', 25, 345.99, 597.89, 1744.72),
('0057', 'Lawn-Mower', 25, 345.99, 597.89, 1494.72),
('0058', 'Weed-Wacker', 25, 345.99, 597.89, 1309.72),
('0059', 'Paint -Premium', 25, 345.99, 597.89, 1494.72),
('0060', 'Paint -Economy', 25, 345.99, 597.89, 1494.72),
('0061', 'Paint Brush', 25, 345.99, 597.89, 1494.72),
('0062', 'Linonium', 25, 345.99, 597.89, 1494.72),
('0063', 'Carpet', 25, 345.99, 597.89, 1494.72),
('0064', 'Ethernet Cable Standard', 25, 345.99, 597.89, 1494.72),
('0065', 'Ethernet Cable Long', 25, 345.99, 597.89, 1494.72),
('0066', 'Door -interior', 0, 345.99, 597.89, 1494.72),
('0067', 'Door -exterior', 25, 345.99, 597.89, 1494.72),
('0068', 'Window Panes', 25, 345.99, 597.89, 8107.22),
('0069', 'French Windows', 25, 345.99, 597.89, 1494.72),
('0070', 'Wooden Shelve -set(2)', 25, 345.99, 597.89, 1494.72),
('0071', 'Car Jack', 25, 345.99, 597.89, 1494.72),
('0072', 'Car Seat Covering', 25, 345.99, 597.89, 1494.72),
('0073', 'Rain-Cloak', 25, 345.99, 597.89, 1494.72),
('0074', 'Safety Elmet', 25, 345.99, 597.89, 1494.72),
('0075', 'Construction Sign', 25, 345.99, 597.89, 1494.72),
('0076', 'Flare Gun', 25, 345.99, 597.89, 3914.73),
('0077', 'Fencing Wire', 25, 345.99, 597.89, 1494.72),
('0078', 'Wheel-Barrow', 25, 345.99, 597.89, 5167.22),
('0079', 'Cement', 25, 345.99, 597.89, 1494.72),
('0080', 'Cid Block', 25, 345.99, 597.89, 1494.72),
('0081', 'Wooden Flooring', 25, 345.99, 597.89, 1494.72),
('0082', 'Flood Lights', 25, 345.99, 597.89, 1274.72),
('0083', 'PadLock', 25, 345.99, 597.89, 1494.72),
('0084', 'Personal Safe', 25, 345.99, 597.89, 1494.72),
('0085', 'Shovel', 25, 345.99, 597.89, 1494.72),
('0086', 'Pickaxe', 25, 345.99, 597.89, 1494.72),
('0087', 'Machete', 25, 345.99, 597.89, 244.72),
('0088', 'Gloves', 25, 345.99, 597.89, 1464.72),
('0089', 'Pottery', 25, 345.99, 597.89, 1494.72),
('0090', 'Vaccuum', 25, 345.99, 597.89, 1344.72),
('0091', 'Mirror', 25, 345.99, 597.89, 1494.72),
('0092', 'Clear Glass', 25, 345.99, 597.89, 1494.72),
('0093', 'Bath-Tub', 25, 345.99, 597.89, 1494.72),
('0094', 'Toilet', 25, 345.99, 597.89, 2744.73),
('0095', 'Faucet', 25, 345.99, 597.89, 1494.72),
('0096', 'Pipe', 25, 345.99, 597.89, 1494.72),
('0097', 'Bedside Lamp', 25, 345.99, 597.89, 1494.72),
('0098', 'PVC Pipe', 25, 345.99, 597.89, 1244.72),
('0099', 'Aircondition Unit', 25, 345.99, 597.89, 1494.72),
('0100', 'Zinc Sheet', 25, 345.99, 597.89, 1744.72);

-- --------------------------------------------------------

--
-- Table structure for table `OrderItems`
--

CREATE TABLE `OrderItems` (
  `OrderItemId` int(11) NOT NULL,
  `OrderSaleID` int(11) DEFAULT NULL,
  `ItemID` varchar(7) DEFAULT NULL,
  `QuantitySold` int(11) DEFAULT NULL,
  `TotalSalePrice` double(9,2) DEFAULT NULL,
  `PurchaseDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `OrderItems`
--

INSERT INTO `OrderItems` (`OrderItemId`, `OrderSaleID`, `ItemID`, `QuantitySold`, `TotalSalePrice`, `PurchaseDate`) VALUES
(32, 99, '0012', 1, 597.89, '2021-12-09'),
(34, 100, '0012', 1, 597.89, '2021-12-09'),
(35, 100, '0016', 1, 597.89, '2021-12-09');

-- --------------------------------------------------------

--
-- Table structure for table `Passwords`
--

CREATE TABLE `Passwords` (
  `PwdID` int(11) NOT NULL,
  `UserID` varchar(9) NOT NULL,
  `Pwd` varchar(36) DEFAULT NULL,
  `SQA` varchar(100) DEFAULT NULL,
  `Answer` varchar(100) DEFAULT NULL,
  `RequestedPwdReset` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Passwords`
--

INSERT INTO `Passwords` (`PwdID`, `UserID`, `Pwd`, `SQA`, `Answer`, `RequestedPwdReset`) VALUES
(12, '000000000', '000000000', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(13, 'AW007', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(14, 'CH004', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(15, 'CR0011', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(16, 'CT001', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(17, 'DM0010', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(18, 'JL003', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(19, 'KW009', 'yellow', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(20, 'RC0012', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(21, 'SB0019', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(22, 'SC008', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0);

-- --------------------------------------------------------

--
-- Table structure for table `SaleOrder`
--

CREATE TABLE `SaleOrder` (
  `OrderSaleID` int(11) NOT NULL,
  `CustomerID` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `SaleOrder`
--

INSERT INTO `SaleOrder` (`OrderSaleID`, `CustomerID`) VALUES
(100, 34),
(99, 45);

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `UserID` varchar(9) NOT NULL,
  `EmployeeNo` varchar(9) NOT NULL,
  `Lname` varchar(20) NOT NULL DEFAULT '',
  `Fname` varchar(10) NOT NULL DEFAULT '',
  `TypeOfUser` varchar(9) NOT NULL,
  `Department` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`UserID`, `EmployeeNo`, `Lname`, `Fname`, `TypeOfUser`, `Department`) VALUES
('000000000', '000000000', 'Reporting', 'Reporting', 'Manager', 'ALL_'),
('AW007', 'AW007TTC', 'Willis', 'Alexia', 'Manager', 'Accounts/Sales'),
('CH004', 'JCH004BBD', 'Henry', 'Cornelia', 'Manager', 'Sales'),
('CR0011', 'CR0011TC', 'Ricketts', 'Candice', 'Manager', 'HR'),
('CT001', 'CT001AJ', 'Thomas', 'Camarly', 'CEO', 'ALL_'),
('DM0010', 'DM0010BC', 'McTaggart-Hector', 'Dennecia', 'Cashier', 'Sales'),
('JL003', 'JL003ABVI', 'Lemonius', 'Jamouy', 'Manager', 'IT'),
('KW009', 'KW009CTT', 'Wilson', 'Kayanda', 'Cashier', 'Sales'),
('RC0012', 'RC0012TTA', 'Crutchley', 'Rashaun', 'Manager', 'Facilities'),
('SB0019', 'SB019DG', 'Brown', 'Shanice', 'Manager', 'Accounts'),
('SC008', 'SC008SUR', 'Clarke', 'Soraiya', 'Cashier', 'Sales');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Customer`
--
ALTER TABLE `Customer`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `Item`
--
ALTER TABLE `Item`
  ADD PRIMARY KEY (`ItemID`),
  ADD UNIQUE KEY `ItemID` (`ItemID`),
  ADD UNIQUE KEY `ItemDescription` (`ItemDescription`);

--
-- Indexes for table `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD PRIMARY KEY (`OrderItemId`),
  ADD KEY `OrderSaleID` (`OrderSaleID`),
  ADD KEY `ItemID` (`ItemID`);

--
-- Indexes for table `Passwords`
--
ALTER TABLE `Passwords`
  ADD PRIMARY KEY (`PwdID`),
  ADD UNIQUE KEY `PwdID` (`PwdID`),
  ADD KEY `UserID` (`UserID`);

--
-- Indexes for table `SaleOrder`
--
ALTER TABLE `SaleOrder`
  ADD PRIMARY KEY (`OrderSaleID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `UserID` (`UserID`),
  ADD UNIQUE KEY `EmployeeNo` (`EmployeeNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `OrderItems`
--
ALTER TABLE `OrderItems`
  MODIFY `OrderItemId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `Passwords`
--
ALTER TABLE `Passwords`
  MODIFY `PwdID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `SaleOrder`
--
ALTER TABLE `SaleOrder`
  MODIFY `OrderSaleID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD CONSTRAINT `orderitems_ibfk_1` FOREIGN KEY (`OrderSaleID`) REFERENCES `SaleOrder` (`OrderSaleID`),
  ADD CONSTRAINT `orderitems_ibfk_2` FOREIGN KEY (`ItemID`) REFERENCES `Item` (`ItemID`);

--
-- Constraints for table `Passwords`
--
ALTER TABLE `Passwords`
  ADD CONSTRAINT `passwords_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `Users` (`UserID`);

--
-- Constraints for table `SaleOrder`
--
ALTER TABLE `SaleOrder`
  ADD CONSTRAINT `saleorder_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `Customer` (`CustomerID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
