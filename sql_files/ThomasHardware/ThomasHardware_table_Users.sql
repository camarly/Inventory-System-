
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
