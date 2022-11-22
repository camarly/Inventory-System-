
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
