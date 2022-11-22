
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
