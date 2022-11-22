
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
